package typingsSlinky.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
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

