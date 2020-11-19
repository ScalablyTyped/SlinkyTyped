package typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod

import typingsSlinky.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurgeQueueInProgress
  extends ServiceException[PurgeQueueInProgressDetails]
     with PurgeQueueExceptionsUnion {
  
  @JSName("name")
  var name_PurgeQueueInProgress: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress = js.native
}
object PurgeQueueInProgress {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PurgeQueueInProgressDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress
  ): PurgeQueueInProgress = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeQueueInProgress]
  }
  
  @scala.inline
  implicit class PurgeQueueInProgressOps[Self <: PurgeQueueInProgress] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
