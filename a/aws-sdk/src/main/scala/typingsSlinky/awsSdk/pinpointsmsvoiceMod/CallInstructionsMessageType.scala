package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallInstructionsMessageType extends js.Object {
  
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var Text: js.UndefOr[NonEmptyString] = js.native
}
object CallInstructionsMessageType {
  
  @scala.inline
  def apply(): CallInstructionsMessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallInstructionsMessageType]
  }
  
  @scala.inline
  implicit class CallInstructionsMessageTypeOps[Self <: CallInstructionsMessageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setText(value: NonEmptyString): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
  }
}
