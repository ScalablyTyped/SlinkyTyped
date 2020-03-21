package typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with EnableKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with TagResourceExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException = js.native
}

