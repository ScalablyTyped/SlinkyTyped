package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForUsername extends StObject {
  
  /**
    * The categoryId parameter specifies a YouTube guide category, thereby requesting YouTube channels associated with that category.
    */
  var categoryId: js.UndefOr[String] = js.native
  
  /**
    * The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username.
    */
  var forUsername: js.UndefOr[String] = js.native
  
  /**
    * The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the id property specifies the channel's YouTube channel ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var managedByMe: js.UndefOr[Boolean] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Set this parameter's value to true to instruct the API to only return channels owned by the authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.native
  
  /**
    * Set this parameter's value to true to retrieve a list of channels that subscribed to the authenticated user's channel.
    */
  var mySubscribers: js.UndefOr[Boolean] = js.native
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies a comma-separated list of one or more channel resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, statistics, topicDetails, and invideoPromotion. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set part=contentDetails, the API response will also contain all of those nested properties.
    */
  var part: String = js.native
}
object ForUsername {
  
  @scala.inline
  def apply(part: String): ForUsername = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForUsername]
  }
  
  @scala.inline
  implicit class ForUsernameMutableBuilder[Self <: ForUsername] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    @scala.inline
    def setForUsername(value: String): Self = StObject.set(x, "forUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForUsernameUndefined: Self = StObject.set(x, "forUsername", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setManagedByMe(value: Boolean): Self = StObject.set(x, "managedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByMeUndefined: Self = StObject.set(x, "managedByMe", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMine(value: Boolean): Self = StObject.set(x, "mine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMineUndefined: Self = StObject.set(x, "mine", js.undefined)
    
    @scala.inline
    def setMySubscribers(value: Boolean): Self = StObject.set(x, "mySubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMySubscribersUndefined: Self = StObject.set(x, "mySubscribers", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
  }
}
