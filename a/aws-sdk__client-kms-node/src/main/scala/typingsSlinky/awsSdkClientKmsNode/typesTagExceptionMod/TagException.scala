package typingsSlinky.awsSdkClientKmsNode.typesTagExceptionMod

import typingsSlinky.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagException
  extends ServiceException[TagExceptionDetails]
     with CreateKeyExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion {
  @JSName("name")
  var name_TagException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.TagException = js.native
}

