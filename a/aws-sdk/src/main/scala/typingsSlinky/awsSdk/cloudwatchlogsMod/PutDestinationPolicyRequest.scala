package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDestinationPolicyRequest extends js.Object {
  /**
    * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination.
    */
  var accessPolicy: AccessPolicy = js.native
  /**
    * A name for an existing destination.
    */
  var destinationName: DestinationName = js.native
}

object PutDestinationPolicyRequest {
  @scala.inline
  def apply(accessPolicy: AccessPolicy, destinationName: DestinationName): PutDestinationPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationPolicyRequest]
  }
  @scala.inline
  implicit class PutDestinationPolicyRequestOps[Self <: PutDestinationPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicy(value: AccessPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationName(value: DestinationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

