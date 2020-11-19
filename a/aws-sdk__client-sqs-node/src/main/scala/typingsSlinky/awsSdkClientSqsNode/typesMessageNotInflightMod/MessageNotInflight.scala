package typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageNotInflight
  extends ServiceException[MessageNotInflightDetails]
     with ChangeMessageVisibilityExceptionsUnion {
  
  @JSName("name")
  var name_MessageNotInflight: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight = js.native
}
object MessageNotInflight {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MessageNotInflightDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight
  ): MessageNotInflight = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNotInflight]
  }
  
  @scala.inline
  implicit class MessageNotInflightOps[Self <: MessageNotInflight] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
