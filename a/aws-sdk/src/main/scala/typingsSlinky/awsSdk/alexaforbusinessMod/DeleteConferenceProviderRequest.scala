package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConferenceProviderRequest extends js.Object {
  
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
}
object DeleteConferenceProviderRequest {
  
  @scala.inline
  def apply(ConferenceProviderArn: Arn): DeleteConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConferenceProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteConferenceProviderRequestOps[Self <: DeleteConferenceProviderRequest] (val x: Self) extends AnyVal {
    
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
    def setConferenceProviderArn(value: Arn): Self = this.set("ConferenceProviderArn", value.asInstanceOf[js.Any])
  }
}
