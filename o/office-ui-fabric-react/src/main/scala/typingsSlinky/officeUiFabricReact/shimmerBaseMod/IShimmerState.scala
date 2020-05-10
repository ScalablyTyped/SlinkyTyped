package typingsSlinky.officeUiFabricReact.shimmerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerState extends js.Object {
  /**
    * Flag for knowing when to remove the shimmerWrapper from the DOM.
    */
  var contentLoaded: js.UndefOr[Boolean] = js.native
}

object IShimmerState {
  @scala.inline
  def apply(): IShimmerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerState]
  }
  @scala.inline
  implicit class IShimmerStateOps[Self <: IShimmerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLoaded")(js.undefined)
        ret
    }
  }
  
}

