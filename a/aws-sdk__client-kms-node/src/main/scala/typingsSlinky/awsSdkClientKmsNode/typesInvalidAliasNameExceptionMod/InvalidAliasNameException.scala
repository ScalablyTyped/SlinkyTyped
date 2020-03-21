package typingsSlinky.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod

import typingsSlinky.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAliasNameException
  extends ServiceException[InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException = js.native
}

