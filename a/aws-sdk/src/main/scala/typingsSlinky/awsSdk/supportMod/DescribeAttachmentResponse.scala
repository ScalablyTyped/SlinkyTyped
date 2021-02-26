package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAttachmentResponse extends StObject {
  
  /**
    * This object includes the attachment content and file name. In the previous response syntax, the value for the data parameter appears as blob, which is represented as a base64-encoded string. The value for fileName is the name of the attachment, such as troubleshoot-screenshot.png.
    */
  var attachment: js.UndefOr[Attachment] = js.native
}
object DescribeAttachmentResponse {
  
  @scala.inline
  def apply(): DescribeAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAttachmentResponse]
  }
  
  @scala.inline
  implicit class DescribeAttachmentResponseMutableBuilder[Self <: DescribeAttachmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
  }
}
