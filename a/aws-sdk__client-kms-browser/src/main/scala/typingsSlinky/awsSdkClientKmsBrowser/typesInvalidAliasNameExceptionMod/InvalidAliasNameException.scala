package typingsSlinky.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAliasNameException
  extends ServiceException[InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException = js.native
}

