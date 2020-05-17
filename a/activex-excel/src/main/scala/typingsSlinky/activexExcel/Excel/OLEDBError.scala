package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEDBError extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val ErrorString: String = js.native
  @JSName("Excel.OLEDBError_typekey")
  var ExcelDotOLEDBError_typekey: OLEDBError = js.native
  val Native: Double = js.native
  val Number: Double = js.native
  val Parent: js.Any = js.native
  val SqlState: String = js.native
  val Stage: Double = js.native
}

object OLEDBError {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ErrorString: String,
    ExcelDotOLEDBError_typekey: OLEDBError,
    Native: Double,
    Number: Double,
    Parent: js.Any,
    SqlState: String,
    Stage: Double
  ): OLEDBError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorString = ErrorString.asInstanceOf[js.Any], Native = Native.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SqlState = SqlState.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.OLEDBError_typekey")(ExcelDotOLEDBError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEDBError]
  }
  @scala.inline
  implicit class OLEDBErrorOps[Self <: OLEDBError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotOLEDBError_typekey(value: OLEDBError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.OLEDBError_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

