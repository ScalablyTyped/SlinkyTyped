package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterEventTopicRequest extends StObject {
  
  /**
    * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS topic.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The name of the SNS topic from which to remove the directory as a publisher.
    */
  var TopicName: typingsSlinky.awsSdk.directoryserviceMod.TopicName = js.native
}
object DeregisterEventTopicRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): DeregisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEventTopicRequest]
  }
  
  @scala.inline
  implicit class DeregisterEventTopicRequestMutableBuilder[Self <: DeregisterEventTopicRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
