package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTextArea extends js.Object {
  var Columns: Double = js.native
  var HTMLName: String = js.native
  @JSName("MSForms.HTMLTextArea_typekey")
  var MSFormsDotHTMLTextArea_typekey: HTMLTextArea = js.native
  var Rows: Double = js.native
  var Value: String = js.native
  var WordWrap: String = js.native
}

object HTMLTextArea {
  @scala.inline
  def apply(
    Columns: Double,
    HTMLName: String,
    MSFormsDotHTMLTextArea_typekey: HTMLTextArea,
    Rows: Double,
    Value: String,
    WordWrap: String
  ): HTMLTextArea = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLTextArea_typekey")(MSFormsDotHTMLTextArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTextArea]
  }
  @scala.inline
  implicit class HTMLTextAreaOps[Self <: HTMLTextArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotHTMLTextArea_typekey(value: HTMLTextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLTextArea_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

