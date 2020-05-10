package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withConferenceProviderArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferenceProviderArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

