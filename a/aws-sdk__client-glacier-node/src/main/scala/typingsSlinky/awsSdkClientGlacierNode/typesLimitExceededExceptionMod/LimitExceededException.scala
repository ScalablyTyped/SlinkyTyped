package typingsSlinky.awsSdkClientGlacierNode.typesLimitExceededExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.createVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.purchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with AddTagsToVaultExceptionsUnion
     with CreateVaultExceptionsUnion
     with PurchaseProvisionedCapacityExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException = js.native
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
  @scala.inline
  implicit class LimitExceededExceptionOps[Self <: LimitExceededException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

