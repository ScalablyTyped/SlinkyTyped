package typingsSlinky.angularResource.mod.angularAugmentingMod.resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
@js.native
trait IResourceOptions extends js.Object {
  /**
    * If true, the request made by a "non-instance" call will be cancelled (if not already completed) by calling
    * $cancelRequest() on the call's return value. This can be overwritten per action. (Defaults to false.)
    */
  var cancellable: js.UndefOr[Boolean] = js.native
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.native
}

object IResourceOptions {
  @scala.inline
  def apply(): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceOptions]
  }
  @scala.inline
  implicit class IResourceOptionsOps[Self <: IResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellable")(js.undefined)
        ret
    }
    @scala.inline
    def withStripTrailingSlashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripTrailingSlashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlashes")(js.undefined)
        ret
    }
  }
  
}

