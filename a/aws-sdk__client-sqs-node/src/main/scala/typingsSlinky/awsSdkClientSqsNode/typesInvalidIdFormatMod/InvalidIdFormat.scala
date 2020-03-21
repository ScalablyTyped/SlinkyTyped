package typingsSlinky.awsSdkClientSqsNode.typesInvalidIdFormatMod

import typingsSlinky.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidIdFormat
  extends ServiceException[InvalidIdFormatDetails]
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidIdFormat: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat = js.native
}

