package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.findLoops.
  */
@js.native
trait IFindChainsOptions extends IPointMatchOptions {
  /**
    * Flag to separate chains by layers.
    */
  var byLayers: js.UndefOr[Boolean] = js.native
  /**
    * Flag to not recurse models, look only within current model's immediate paths.
    */
  var shallow: js.UndefOr[Boolean] = js.native
}

object IFindChainsOptions {
  @scala.inline
  def apply(): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindChainsOptions]
  }
  @scala.inline
  implicit class IFindChainsOptionsOps[Self <: IFindChainsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByLayers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byLayers")(js.undefined)
        ret
    }
    @scala.inline
    def withShallow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShallow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(js.undefined)
        ret
    }
  }
  
}

