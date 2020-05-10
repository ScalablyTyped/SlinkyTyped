package typingsSlinky.officeUiFabricReact.imageBaseMod

import typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageState extends js.Object {
  var loadState: js.UndefOr[ImageLoadState] = js.native
}

object IImageState {
  @scala.inline
  def apply(): IImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageState]
  }
  @scala.inline
  implicit class IImageStateOps[Self <: IImageState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadState(value: ImageLoadState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadState")(js.undefined)
        ret
    }
  }
  
}

