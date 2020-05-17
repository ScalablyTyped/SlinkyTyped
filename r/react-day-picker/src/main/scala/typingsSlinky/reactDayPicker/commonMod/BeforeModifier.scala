package typingsSlinky.reactDayPicker.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeModifier extends Modifier {
  var before: js.Date = js.native
}

object BeforeModifier {
  @scala.inline
  def apply(before: js.Date): BeforeModifier = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeModifier]
  }
  @scala.inline
  implicit class BeforeModifierOps[Self <: BeforeModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

