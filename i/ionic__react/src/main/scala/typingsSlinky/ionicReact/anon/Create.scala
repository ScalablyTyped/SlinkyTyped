package typingsSlinky.ionicReact.anon

import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends js.Object {
  def create(options: OptionsType): js.Promise[OverlayType] = js.native
}

object Create {
  @scala.inline
  def apply[OptionsType, OverlayType](create: OptionsType => js.Promise[OverlayType]): Create[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create[OptionsType, OverlayType]]
  }
  @scala.inline
  implicit class CreateOps[Self[optionstype, overlaytype] <: Create[optionstype, overlaytype], OptionsType, OverlayType] (val x: Self[OptionsType, OverlayType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionsType, OverlayType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionsType, OverlayType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[OptionsType, OverlayType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[OptionsType, OverlayType]) with Other]
    @scala.inline
    def withCreate(value: OptionsType => js.Promise[OverlayType]): Self[OptionsType, OverlayType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

