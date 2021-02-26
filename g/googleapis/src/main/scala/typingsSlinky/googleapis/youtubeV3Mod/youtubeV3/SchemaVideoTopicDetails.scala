package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Freebase topic information related to the video.
  */
@js.native
trait SchemaVideoTopicDetails extends StObject {
  
  /**
    * Similar to topic_id, except that these topics are merely relevant to the
    * video. These are topics that may be mentioned in, or appear in the video.
    * You can retrieve information about each topic using Freebase Topic API.
    */
  var relevantTopicIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of Wikipedia URLs that provide a high-level description of the
    * video&#39;s content.
    */
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of Freebase topic IDs that are centrally associated with the
    * video. These are topics that are centrally featured in the video, and it
    * can be said that the video is mainly about each of these. You can
    * retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaVideoTopicDetails {
  
  @scala.inline
  def apply(): SchemaVideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoTopicDetails]
  }
  
  @scala.inline
  implicit class SchemaVideoTopicDetailsMutableBuilder[Self <: SchemaVideoTopicDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelevantTopicIds(value: js.Array[String]): Self = StObject.set(x, "relevantTopicIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantTopicIdsUndefined: Self = StObject.set(x, "relevantTopicIds", js.undefined)
    
    @scala.inline
    def setRelevantTopicIdsVarargs(value: String*): Self = StObject.set(x, "relevantTopicIds", js.Array(value :_*))
    
    @scala.inline
    def setTopicCategories(value: js.Array[String]): Self = StObject.set(x, "topicCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicCategoriesUndefined: Self = StObject.set(x, "topicCategories", js.undefined)
    
    @scala.inline
    def setTopicCategoriesVarargs(value: String*): Self = StObject.set(x, "topicCategories", js.Array(value :_*))
    
    @scala.inline
    def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
    
    @scala.inline
    def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value :_*))
  }
}
