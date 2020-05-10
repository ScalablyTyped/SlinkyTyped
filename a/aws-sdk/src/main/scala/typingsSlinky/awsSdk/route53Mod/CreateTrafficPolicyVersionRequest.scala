package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyVersionRequest extends js.Object {
  /**
    * The comment that you specified in the CreateTrafficPolicyVersion request, if any.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  /**
    * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the CreateTrafficPolicyVersion request. For more information about the JSON format, see CreateTrafficPolicy.
    */
  var Document: TrafficPolicyDocument = js.native
  /**
    * The ID of the traffic policy for which you want to create a new version.
    */
  var Id: TrafficPolicyId = js.native
}

object CreateTrafficPolicyVersionRequest {
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Id: TrafficPolicyId): CreateTrafficPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyVersionRequest]
  }
  @scala.inline
  implicit class CreateTrafficPolicyVersionRequestOps[Self <: CreateTrafficPolicyVersionRequest] (val x: Self) extends AnyVal {
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
    def withId(value: TrafficPolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
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

