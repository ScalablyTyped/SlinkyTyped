package typingsSlinky.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2UnexpectedExceptionDetails extends js.Object {
  
  /**
    * _String shape
    */
  var EC2ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
}
object EC2UnexpectedExceptionDetails {
  
  @scala.inline
  def apply(): EC2UnexpectedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2UnexpectedExceptionDetails]
  }
  
  @scala.inline
  implicit class EC2UnexpectedExceptionDetailsOps[Self <: EC2UnexpectedExceptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEC2ErrorCode(value: String): Self = this.set("EC2ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEC2ErrorCode: Self = this.set("EC2ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
