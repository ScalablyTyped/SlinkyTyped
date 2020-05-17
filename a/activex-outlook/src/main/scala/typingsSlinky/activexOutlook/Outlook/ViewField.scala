package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewField extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ColumnFormat: typingsSlinky.activexOutlook.Outlook.ColumnFormat = js.native
  @JSName("Outlook.ViewField_typekey")
  var OutlookDotViewField_typekey: ViewField = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val ViewXMLSchemaName: String = js.native
}

object ViewField {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ColumnFormat: ColumnFormat,
    OutlookDotViewField_typekey: ViewField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): ViewField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFormat = ColumnFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewField_typekey")(OutlookDotViewField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewField]
  }
  @scala.inline
  implicit class ViewFieldOps[Self <: ViewField] (val x: Self) extends AnyVal {
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
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnFormat(value: ColumnFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotViewField_typekey(value: ViewField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.ViewField_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewXMLSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewXMLSchemaName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

