package typingsSlinky.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlreadyExistsException
  extends ServiceException[AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  
  @JSName("name")
  var name_AlreadyExistsException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException = js.native
}
object AlreadyExistsException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: AlreadyExistsExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException
  ): AlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlreadyExistsException]
  }
  
  @scala.inline
  implicit class AlreadyExistsExceptionOps[Self <: AlreadyExistsException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
