package typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidMarkerException
  extends ServiceException[InvalidMarkerExceptionDetails]
     with ListAliasesExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeysExceptionsUnion
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion {
  
  @JSName("name")
  var name_InvalidMarkerException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException = js.native
}
object InvalidMarkerException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidMarkerExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException
  ): InvalidMarkerException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMarkerException]
  }
  
  @scala.inline
  implicit class InvalidMarkerExceptionOps[Self <: InvalidMarkerException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
