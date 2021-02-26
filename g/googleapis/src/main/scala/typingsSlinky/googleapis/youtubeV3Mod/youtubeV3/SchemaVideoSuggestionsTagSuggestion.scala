package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single tag suggestion with it&#39;s relevance information.
  */
@js.native
trait SchemaVideoSuggestionsTagSuggestion extends StObject {
  
  /**
    * A set of video categories for which the tag is relevant. You can use this
    * information to display appropriate tag suggestions based on the video
    * category that the video uploader associates with the video. By default,
    * tag suggestions are relevant for all categories if there are no restricts
    * defined for the keyword.
    */
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The keyword tag suggested for the video.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaVideoSuggestionsTagSuggestion {
  
  @scala.inline
  def apply(): SchemaVideoSuggestionsTagSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSuggestionsTagSuggestion]
  }
  
  @scala.inline
  implicit class SchemaVideoSuggestionsTagSuggestionMutableBuilder[Self <: SchemaVideoSuggestionsTagSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryRestricts(value: js.Array[String]): Self = StObject.set(x, "categoryRestricts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryRestrictsUndefined: Self = StObject.set(x, "categoryRestricts", js.undefined)
    
    @scala.inline
    def setCategoryRestrictsVarargs(value: String*): Self = StObject.set(x, "categoryRestricts", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
