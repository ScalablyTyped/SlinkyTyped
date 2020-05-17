package typingsSlinky.ionicReact.anon

import typingsSlinky.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType] = js.native
}

object `0` {
  @scala.inline
  def apply[OverlayType](create: js.Any => js.Promise[OverlayType]): `0`[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`0`[OverlayType]]
  }
  @scala.inline
  implicit class `0Ops`[Self[overlaytype] <: `0`[overlaytype], OverlayType] (val x: Self[OverlayType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OverlayType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OverlayType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OverlayType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OverlayType] with Other]
    @scala.inline
    def withCreate(value: js.Any => js.Promise[OverlayType]): Self[OverlayType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

