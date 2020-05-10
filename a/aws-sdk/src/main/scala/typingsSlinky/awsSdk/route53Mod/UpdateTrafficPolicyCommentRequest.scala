package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyCommentRequest extends js.Object {
  /**
    * The new comment for the specified traffic policy and version.
    */
  var Comment: TrafficPolicyComment = js.native
  /**
    * The value of Id for the traffic policy that you want to update the comment for.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The value of Version for the traffic policy that you want to update the comment for.
    */
  var Version: TrafficPolicyVersion = js.native
}

object UpdateTrafficPolicyCommentRequest {
  @scala.inline
  def apply(Comment: TrafficPolicyComment, Id: TrafficPolicyId, Version: TrafficPolicyVersion): UpdateTrafficPolicyCommentRequest = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyCommentRequest]
  }
  @scala.inline
  implicit class UpdateTrafficPolicyCommentRequestOps[Self <: UpdateTrafficPolicyCommentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: TrafficPolicyComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: TrafficPolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: TrafficPolicyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

