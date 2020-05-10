package typingsSlinky.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEnforcedException
  extends ServiceException[PolicyEnforcedExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_PolicyEnforcedException: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException = js.native
}

object PolicyEnforcedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PolicyEnforcedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException
  ): PolicyEnforcedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEnforcedException]
  }
  @scala.inline
  implicit class PolicyEnforcedExceptionOps[Self <: PolicyEnforcedException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

