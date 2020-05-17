package typingsSlinky.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatumColorInstruction
  extends OrdinalColorsInstruction[js.Any] {
  var datum: String = js.native
}

object DatumColorInstruction {
  @scala.inline
  def apply(datum: String): DatumColorInstruction = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumColorInstruction]
  }
  @scala.inline
  implicit class DatumColorInstructionOps[Self <: DatumColorInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

