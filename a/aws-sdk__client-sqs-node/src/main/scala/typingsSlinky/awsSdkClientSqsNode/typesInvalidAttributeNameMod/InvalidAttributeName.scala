package typingsSlinky.awsSdkClientSqsNode.typesInvalidAttributeNameMod

import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAttributeName extends ServiceException[InvalidAttributeNameDetails] {
  @JSName("name")
  var name_InvalidAttributeName: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName
}

object InvalidAttributeName {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidAttributeNameDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName,
    stack: String = null
  ): InvalidAttributeName = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAttributeName]
  }
}

