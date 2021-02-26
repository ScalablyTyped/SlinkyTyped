package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotificationChannelDescriptorsResponse extends StObject {
  
  /** The monitored resource descriptors supported for the specified project, optionally filtered. */
  var channelDescriptors: js.UndefOr[js.Array[NotificationChannelDescriptor]] = js.native
  
  /**
    * If not empty, indicates that there may be more results that match the request. Use the value in the page_token field in a subsequent request to fetch the next set of results. If
    * empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListNotificationChannelDescriptorsResponse {
  
  @scala.inline
  def apply(): ListNotificationChannelDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationChannelDescriptorsResponse]
  }
  
  @scala.inline
  implicit class ListNotificationChannelDescriptorsResponseMutableBuilder[Self <: ListNotificationChannelDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelDescriptors(value: js.Array[NotificationChannelDescriptor]): Self = StObject.set(x, "channelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelDescriptorsUndefined: Self = StObject.set(x, "channelDescriptors", js.undefined)
    
    @scala.inline
    def setChannelDescriptorsVarargs(value: NotificationChannelDescriptor*): Self = StObject.set(x, "channelDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
