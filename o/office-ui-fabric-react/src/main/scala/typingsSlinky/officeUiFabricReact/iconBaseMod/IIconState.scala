package typingsSlinky.officeUiFabricReact.iconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconState extends js.Object {
  var imageLoadError: Boolean = js.native
}

object IIconState {
  @scala.inline
  def apply(imageLoadError: Boolean): IIconState = {
    val __obj = js.Dynamic.literal(imageLoadError = imageLoadError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconState]
  }
  @scala.inline
  implicit class IIconStateOps[Self <: IIconState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageLoadError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoadError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

