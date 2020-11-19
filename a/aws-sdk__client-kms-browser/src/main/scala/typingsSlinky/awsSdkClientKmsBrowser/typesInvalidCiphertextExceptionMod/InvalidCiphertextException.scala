package typingsSlinky.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidCiphertextException
  extends ServiceException[InvalidCiphertextExceptionDetails]
     with DecryptExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ReEncryptExceptionsUnion {
  
  @JSName("name")
  var name_InvalidCiphertextException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException = js.native
}
object InvalidCiphertextException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidCiphertextExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException
  ): InvalidCiphertextException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCiphertextException]
  }
  
  @scala.inline
  implicit class InvalidCiphertextExceptionOps[Self <: InvalidCiphertextException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
