package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PublishResponse. */
@js.native
trait IPublishResponse extends StObject {
  
  /** PublishResponse messageIds */
  var messageIds: js.UndefOr[js.Array[String] | Null] = js.native
}
object IPublishResponse {
  
  @scala.inline
  def apply(): IPublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishResponse]
  }
  
  @scala.inline
  implicit class IPublishResponseMutableBuilder[Self <: IPublishResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdsNull: Self = StObject.set(x, "messageIds", null)
    
    @scala.inline
    def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    @scala.inline
    def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value :_*))
  }
}
