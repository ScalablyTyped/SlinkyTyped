package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArmBaseOperand extends js.Object {
  var shift: js.UndefOr[Type] = js.native
  var subtracted: Boolean = js.native
  var vectorIndex: js.UndefOr[Double] = js.native
}

object ArmBaseOperand {
  @scala.inline
  def apply(subtracted: Boolean): ArmBaseOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmBaseOperand]
  }
  @scala.inline
  implicit class ArmBaseOperandOps[Self <: ArmBaseOperand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubtracted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtracted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorIndex")(js.undefined)
        ret
    }
  }
  
}

