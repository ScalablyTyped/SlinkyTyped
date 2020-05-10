package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyRequest extends js.Object {
  /**
    * (Optional) Any comments that you want to include about the traffic policy.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  /**
    * The definition of this traffic policy in JSON format. For more information, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument = js.native
  /**
    * The name of the traffic policy.
    */
  var Name: TrafficPolicyName = js.native
}

object CreateTrafficPolicyRequest {
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Name: TrafficPolicyName): CreateTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyRequest]
  }
  @scala.inline
  implicit class CreateTrafficPolicyRequestOps[Self <: CreateTrafficPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: TrafficPolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: TrafficPolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: TrafficPolicyComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
  }
  
}

