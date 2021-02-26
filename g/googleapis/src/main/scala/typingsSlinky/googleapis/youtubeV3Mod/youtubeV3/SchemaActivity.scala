package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An activity resource contains information about an action that a particular
  * channel, or user, has taken on YouTube.The actions reported in activity
  * feeds include rating a video, sharing a video, marking a video as a
  * favorite, commenting on a video, uploading a video, and so forth. Each
  * activity resource identifies the type of action, the channel associated
  * with the action, and the resource(s) associated with the action, such as
  * the video that was rated or uploaded.
  */
@js.native
trait SchemaActivity extends StObject {
  
  /**
    * The contentDetails object contains information about the content
    * associated with the activity. For example, if the snippet.type value is
    * videoRated, then the contentDetails object&#39;s content identifies the
    * rated video.
    */
  var contentDetails: js.UndefOr[SchemaActivityContentDetails] = js.native
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#activity&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about the activity, including
    * the activity&#39;s type and group ID.
    */
  var snippet: js.UndefOr[SchemaActivitySnippet] = js.native
}
object SchemaActivity {
  
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  @scala.inline
  implicit class SchemaActivityMutableBuilder[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: SchemaActivityContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaActivitySnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
