package typingsSlinky.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod

import typingsSlinky.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlreadyExistsException
  extends ServiceException[AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException = js.native
}

