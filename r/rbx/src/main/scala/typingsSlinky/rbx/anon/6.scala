package typingsSlinky.rbx.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `6`[TAsComponent /* <: ReactElement */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.native
}

object `6` {
  @scala.inline
  def apply[/* <: typingsSlinky.react.mod.ElementType[_] */ TAsComponent](): `6`[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[TAsComponent]]
  }
  @scala.inline
  implicit class `6Ops`[Self <: `6`[_], /* <: typingsSlinky.react.mod.ElementType[_] */ TAsComponent] (val x: Self with `6`[TAsComponent]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: TAsComponent): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
  }
  
}

