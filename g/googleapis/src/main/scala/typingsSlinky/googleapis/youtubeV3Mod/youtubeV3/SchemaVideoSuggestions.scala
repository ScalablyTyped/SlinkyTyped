package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies suggestions on how to improve video content, including encoding
  * hints, tag suggestions, and editor suggestions.
  */
@js.native
trait SchemaVideoSuggestions extends StObject {
  
  /**
    * A list of video editing operations that might improve the video quality
    * or playback experience of the uploaded video.
    */
  var editorSuggestions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of errors that will prevent YouTube from successfully processing
    * the uploaded video video. These errors indicate that, regardless of the
    * video&#39;s current processing status, eventually, that status will
    * almost certainly be failed.
    */
  var processingErrors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of suggestions that may improve YouTube&#39;s ability to process
    * the video.
    */
  var processingHints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of reasons why YouTube may have difficulty transcoding the
    * uploaded video or that might result in an erroneous transcoding. These
    * warnings are generated before YouTube actually processes the uploaded
    * video file. In addition, they identify issues that are unlikely to cause
    * the video processing to fail but that might cause problems such as sync
    * issues, video artifacts, or a missing audio track.
    */
  var processingWarnings: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of keyword tags that could be added to the video&#39;s metadata to
    * increase the likelihood that users will locate your video when searching
    * or browsing on YouTube.
    */
  var tagSuggestions: js.UndefOr[js.Array[SchemaVideoSuggestionsTagSuggestion]] = js.native
}
object SchemaVideoSuggestions {
  
  @scala.inline
  def apply(): SchemaVideoSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSuggestions]
  }
  
  @scala.inline
  implicit class SchemaVideoSuggestionsMutableBuilder[Self <: SchemaVideoSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorSuggestions(value: js.Array[String]): Self = StObject.set(x, "editorSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorSuggestionsUndefined: Self = StObject.set(x, "editorSuggestions", js.undefined)
    
    @scala.inline
    def setEditorSuggestionsVarargs(value: String*): Self = StObject.set(x, "editorSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setProcessingErrors(value: js.Array[String]): Self = StObject.set(x, "processingErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingErrorsUndefined: Self = StObject.set(x, "processingErrors", js.undefined)
    
    @scala.inline
    def setProcessingErrorsVarargs(value: String*): Self = StObject.set(x, "processingErrors", js.Array(value :_*))
    
    @scala.inline
    def setProcessingHints(value: js.Array[String]): Self = StObject.set(x, "processingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingHintsUndefined: Self = StObject.set(x, "processingHints", js.undefined)
    
    @scala.inline
    def setProcessingHintsVarargs(value: String*): Self = StObject.set(x, "processingHints", js.Array(value :_*))
    
    @scala.inline
    def setProcessingWarnings(value: js.Array[String]): Self = StObject.set(x, "processingWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingWarningsUndefined: Self = StObject.set(x, "processingWarnings", js.undefined)
    
    @scala.inline
    def setProcessingWarningsVarargs(value: String*): Self = StObject.set(x, "processingWarnings", js.Array(value :_*))
    
    @scala.inline
    def setTagSuggestions(value: js.Array[SchemaVideoSuggestionsTagSuggestion]): Self = StObject.set(x, "tagSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSuggestionsUndefined: Self = StObject.set(x, "tagSuggestions", js.undefined)
    
    @scala.inline
    def setTagSuggestionsVarargs(value: SchemaVideoSuggestionsTagSuggestion*): Self = StObject.set(x, "tagSuggestions", js.Array(value :_*))
  }
}
