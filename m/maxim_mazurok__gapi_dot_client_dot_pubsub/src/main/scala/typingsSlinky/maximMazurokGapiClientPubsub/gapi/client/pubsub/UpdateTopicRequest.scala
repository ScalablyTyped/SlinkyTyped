package typingsSlinky.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTopicRequest extends StObject {
  
  /** Required. The updated topic object. */
  var topic: js.UndefOr[Topic] = js.native
  
  /**
    * Required. Indicates which fields in the provided topic to update. Must be specified and non-empty. Note that if `update_mask` contains "message_storage_policy" but the
    * `message_storage_policy` is not set in the `topic` provided above, then the updated value is determined by the policy configured at the project or organization level.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateTopicRequest {
  
  @scala.inline
  def apply(): UpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTopicRequest]
  }
  
  @scala.inline
  implicit class UpdateTopicRequestMutableBuilder[Self <: UpdateTopicRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
