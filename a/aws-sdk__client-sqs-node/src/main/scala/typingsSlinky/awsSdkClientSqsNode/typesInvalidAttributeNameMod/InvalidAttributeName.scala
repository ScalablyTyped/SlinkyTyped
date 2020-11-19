package typingsSlinky.awsSdkClientSqsNode.typesInvalidAttributeNameMod

import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidAttributeName extends ServiceException[InvalidAttributeNameDetails] {
  
  @JSName("name")
  var name_InvalidAttributeName: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName = js.native
}
object InvalidAttributeName {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidAttributeNameDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName
  ): InvalidAttributeName = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAttributeName]
  }
  
  @scala.inline
  implicit class InvalidAttributeNameOps[Self <: InvalidAttributeName] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
