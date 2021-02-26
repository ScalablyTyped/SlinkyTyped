package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListNotificationChannels response.
  */
@js.native
trait SchemaListNotificationChannelsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The notification channels defined for the specified project.
    */
  var notificationChannels: js.UndefOr[js.Array[SchemaNotificationChannel]] = js.native
}
object SchemaListNotificationChannelsResponse {
  
  @scala.inline
  def apply(): SchemaListNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotificationChannelsResponse]
  }
  
  @scala.inline
  implicit class SchemaListNotificationChannelsResponseMutableBuilder[Self <: SchemaListNotificationChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNotificationChannels(value: js.Array[SchemaNotificationChannel]): Self = StObject.set(x, "notificationChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationChannelsUndefined: Self = StObject.set(x, "notificationChannels", js.undefined)
    
    @scala.inline
    def setNotificationChannelsVarargs(value: SchemaNotificationChannel*): Self = StObject.set(x, "notificationChannels", js.Array(value :_*))
  }
}
