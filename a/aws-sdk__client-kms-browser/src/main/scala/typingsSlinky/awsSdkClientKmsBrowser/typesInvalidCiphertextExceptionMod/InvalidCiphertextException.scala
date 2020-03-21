package typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidCiphertextException
  extends ServiceException[InvalidCiphertextExceptionDetails]
     with DecryptExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidCiphertextException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException = js.native
}

