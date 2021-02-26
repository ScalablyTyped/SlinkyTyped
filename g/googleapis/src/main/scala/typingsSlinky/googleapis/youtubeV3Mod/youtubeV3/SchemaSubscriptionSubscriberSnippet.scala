package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a subscription&#39;s subscriber including title,
  * description, channel ID and thumbnails.
  */
@js.native
trait SchemaSubscriptionSubscriberSnippet extends StObject {
  
  /**
    * The channel ID of the subscriber.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The description of the subscriber.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Thumbnails for this subscriber.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  
  /**
    * The title of the subscriber.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaSubscriptionSubscriberSnippet {
  
  @scala.inline
  def apply(): SchemaSubscriptionSubscriberSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionSubscriberSnippet]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionSubscriberSnippetMutableBuilder[Self <: SchemaSubscriptionSubscriberSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
