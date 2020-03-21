package typingsSlinky.awsSdkClientSqsNode.typesInvalidMessageContentsMod

import typingsSlinky.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMessageContents
  extends ServiceException[InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents = js.native
}

