package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculationProperties extends js.Object {
  /**
  	 * Whether the application shall perform a full recalculation when the workbook is opened
  	 */
  var fullCalcOnLoad: Boolean = js.native
}

object CalculationProperties {
  @scala.inline
  def apply(fullCalcOnLoad: Boolean): CalculationProperties = {
    val __obj = js.Dynamic.literal(fullCalcOnLoad = fullCalcOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculationProperties]
  }
  @scala.inline
  implicit class CalculationPropertiesOps[Self <: CalculationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullCalcOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullCalcOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

