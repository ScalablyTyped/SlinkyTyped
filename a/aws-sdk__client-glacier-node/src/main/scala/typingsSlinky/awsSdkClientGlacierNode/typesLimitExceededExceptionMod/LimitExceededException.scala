package typingsSlinky.awsSdkClientGlacierNode.typesLimitExceededExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.createVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.purchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
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

