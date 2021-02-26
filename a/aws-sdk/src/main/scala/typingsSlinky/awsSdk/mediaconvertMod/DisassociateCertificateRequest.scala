package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateCertificateRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate that you want to disassociate from your MediaConvert resource.
    */
  var Arn: string = js.native
}
object DisassociateCertificateRequest {
  
  @scala.inline
  def apply(Arn: string): DisassociateCertificateRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCertificateRequest]
  }
  
  @scala.inline
  implicit class DisassociateCertificateRequestMutableBuilder[Self <: DisassociateCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
