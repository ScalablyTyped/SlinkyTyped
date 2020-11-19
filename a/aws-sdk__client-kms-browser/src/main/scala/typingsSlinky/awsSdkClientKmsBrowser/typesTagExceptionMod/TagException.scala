package typingsSlinky.awsSdkClientKmsBrowser.typesTagExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagException
  extends ServiceException[TagExceptionDetails]
     with CreateKeyExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion {
  
  @JSName("name")
  var name_TagException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.TagException = js.native
}
object TagException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TagExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.TagException
  ): TagException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagException]
  }
  
  @scala.inline
  implicit class TagExceptionOps[Self <: TagException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.TagException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
