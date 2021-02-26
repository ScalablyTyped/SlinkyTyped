package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteTopicRequest. */
@js.native
trait IDeleteTopicRequest extends StObject {
  
  /** DeleteTopicRequest topic */
  var topic: js.UndefOr[String | Null] = js.native
}
object IDeleteTopicRequest {
  
  @scala.inline
  def apply(): IDeleteTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteTopicRequest]
  }
  
  @scala.inline
  implicit class IDeleteTopicRequestMutableBuilder[Self <: IDeleteTopicRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNull: Self = StObject.set(x, "topic", null)
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
