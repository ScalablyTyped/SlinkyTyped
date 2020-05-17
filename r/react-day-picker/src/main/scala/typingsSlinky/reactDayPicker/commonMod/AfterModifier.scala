package typingsSlinky.reactDayPicker.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterModifier extends Modifier {
  var after: js.Date = js.native
}

object AfterModifier {
  @scala.inline
  def apply(after: js.Date): AfterModifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterModifier]
  }
  @scala.inline
  implicit class AfterModifierOps[Self <: AfterModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

