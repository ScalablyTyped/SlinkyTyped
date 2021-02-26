package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorObject extends StObject {
  
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
  implicit class ErrorObjectMutableBuilder[Self <: ErrorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionName(value: js.Any): Self = StObject.set(x, "ConditionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedErrorMessage(value: String): Self = StObject.set(x, "DetailedErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotErrorObject_typekey(value: ErrorObject): Self = StObject.set(x, "InfoPath.ErrorObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: IXMLDOMNode): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortErrorMessage(value: String): Self = StObject.set(x, "ShortErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
