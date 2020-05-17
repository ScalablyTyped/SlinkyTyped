package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLValidationError extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val ErrorCode: Double = js.native
  val Name: String = js.native
  val Node: CustomXMLNode = js.native
  @JSName("Office.CustomXMLValidationError_typekey")
  var OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError = js.native
  val Parent: js.Any = js.native
  val Text: String = js.native
  val Type: MsoCustomXMLValidationErrorType = js.native
  def Delete(): Unit = js.native
}

object CustomXMLValidationError {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    ErrorCode: Double,
    Name: String,
    Node: CustomXMLNode,
    OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError,
    Parent: js.Any,
    Text: String,
    Type: MsoCustomXMLValidationErrorType
  ): CustomXMLValidationError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ErrorCode = ErrorCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomXMLValidationError_typekey")(OfficeDotCustomXMLValidationError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLValidationError]
  }
  @scala.inline
  implicit class CustomXMLValidationErrorOps[Self <: CustomXMLValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: CustomXMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotCustomXMLValidationError_typekey(value: CustomXMLValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.CustomXMLValidationError_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoCustomXMLValidationErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

