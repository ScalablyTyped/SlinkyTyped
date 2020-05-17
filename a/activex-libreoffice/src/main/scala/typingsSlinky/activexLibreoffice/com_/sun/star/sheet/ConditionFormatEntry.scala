package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionFormatEntry extends XConditionEntry {
  var Formula1: String = js.native
  var Formula2: String = js.native
  /** See {@link com.sun.star.sheet.ConditionFormatOperator} for valid values */
  var Operator: Double = js.native
  var StyleName: String = js.native
}

object ConditionFormatEntry {
  @scala.inline
  def apply(
    Formula1: String,
    Formula2: String,
    Operator: Double,
    StyleName: String,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ConditionFormatEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ConditionFormatEntry]
  }
  @scala.inline
  implicit class ConditionFormatEntryOps[Self <: ConditionFormatEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormula1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

