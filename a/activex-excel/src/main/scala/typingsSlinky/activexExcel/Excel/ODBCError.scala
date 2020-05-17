package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODBCError extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val ErrorString: String = js.native
  @JSName("Excel.ODBCError_typekey")
  var ExcelDotODBCError_typekey: ODBCError = js.native
  val Parent: js.Any = js.native
  val SqlState: String = js.native
}

object ODBCError {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ErrorString: String,
    ExcelDotODBCError_typekey: ODBCError,
    Parent: js.Any,
    SqlState: String
  ): ODBCError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorString = ErrorString.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SqlState = SqlState.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ODBCError_typekey")(ExcelDotODBCError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODBCError]
  }
  @scala.inline
  implicit class ODBCErrorOps[Self <: ODBCError] (val x: Self) extends AnyVal {
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
    def withExcelDotODBCError_typekey(value: ODBCError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ODBCError_typekey")(value.asInstanceOf[js.Any])
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
  }
  
}

