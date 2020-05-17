package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderField extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var IsDescending: Boolean = js.native
  @JSName("Outlook.OrderField_typekey")
  var OutlookDotOrderField_typekey: OrderField = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val ViewXMLSchemaName: String = js.native
}

object OrderField {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    IsDescending: Boolean,
    OutlookDotOrderField_typekey: OrderField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): OrderField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], IsDescending = IsDescending.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OrderField_typekey")(OutlookDotOrderField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderField]
  }
  @scala.inline
  implicit class OrderFieldOps[Self <: OrderField] (val x: Self) extends AnyVal {
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
    def withIsDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotOrderField_typekey(value: OrderField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OrderField_typekey")(value.asInstanceOf[js.Any])
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

