package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorObject extends js.Object {
  val ConditionName: js.Any = js.native
  var DetailedErrorMessage: String = js.native
  var ErrorCode: Double = js.native
  @JSName("InfoPath.ErrorObject_typekey")
  var InfoPathDotErrorObject_typekey: ErrorObject = js.native
  val Node: IXMLDOMNode = js.native
  var ShortErrorMessage: String = js.native
  val Type: String = js.native
}

object ErrorObject {
  @scala.inline
  def apply(
    ConditionName: js.Any,
    DetailedErrorMessage: String,
    ErrorCode: Double,
    InfoPathDotErrorObject_typekey: ErrorObject,
    Node: IXMLDOMNode,
    ShortErrorMessage: String,
    Type: String
  ): ErrorObject = {
    val __obj = js.Dynamic.literal(ConditionName = ConditionName.asInstanceOf[js.Any], DetailedErrorMessage = DetailedErrorMessage.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], ShortErrorMessage = ShortErrorMessage.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ErrorObject_typekey")(InfoPathDotErrorObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
  @scala.inline
  implicit class ErrorObjectOps[Self <: ErrorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetailedErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotErrorObject_typekey(value: ErrorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.ErrorObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

