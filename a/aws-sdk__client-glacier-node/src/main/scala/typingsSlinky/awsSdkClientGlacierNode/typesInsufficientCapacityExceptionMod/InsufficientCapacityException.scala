package typingsSlinky.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsufficientCapacityException
  extends ServiceException[InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException = js.native
}

