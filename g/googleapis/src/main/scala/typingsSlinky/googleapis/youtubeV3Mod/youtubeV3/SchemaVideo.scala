package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A video resource represents a YouTube video.
  */
@js.native
trait SchemaVideo extends StObject {
  
  /**
    * Age restriction details related to a video. This data can only be
    * retrieved by the video owner.
    */
  var ageGating: js.UndefOr[SchemaVideoAgeGating] = js.native
  
  /**
    * The contentDetails object contains information about the video content,
    * including the length of the video and its aspect ratio.
    */
  var contentDetails: js.UndefOr[SchemaVideoContentDetails] = js.native
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The fileDetails object encapsulates information about the video file that
    * was uploaded to YouTube, including the file&#39;s resolution, duration,
    * audio and video codecs, stream bitrates, and more. This data can only be
    * retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[SchemaVideoFileDetails] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#video&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The liveStreamingDetails object contains metadata about a live video
    * broadcast. The object will only be present in a video resource if the
    * video is an upcoming, live, or completed live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[SchemaVideoLiveStreamingDetails] = js.native
  
  /**
    * List with all localizations.
    */
  var localizations: js.UndefOr[StringDictionary[SchemaVideoLocalization]] = js.native
  
  /**
    * The monetizationDetails object encapsulates information about the
    * monetization status of the video.
    */
  var monetizationDetails: js.UndefOr[SchemaVideoMonetizationDetails] = js.native
  
  /**
    * The player object contains information that you would use to play the
    * video in an embedded player.
    */
  var player: js.UndefOr[SchemaVideoPlayer] = js.native
  
  /**
    * The processingDetails object encapsulates information about YouTube&#39;s
    * progress in processing the uploaded video file. The properties in the
    * object identify the current processing status and an estimate of the time
    * remaining until YouTube finishes processing the video. This part also
    * indicates whether different types of data or content, such as file
    * details or thumbnail images, are available for the video.  The
    * processingProgress object is designed to be polled so that the video
    * uploaded can track the progress that YouTube has made in processing the
    * uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[SchemaVideoProcessingDetails] = js.native
  
  /**
    * The projectDetails object contains information about the project specific
    * video metadata.
    */
  var projectDetails: js.UndefOr[SchemaVideoProjectDetails] = js.native
  
  /**
    * The recordingDetails object encapsulates information about the location,
    * date and address where the video was recorded.
    */
  var recordingDetails: js.UndefOr[SchemaVideoRecordingDetails] = js.native
  
  /**
    * The snippet object contains basic details about the video, such as its
    * title, description, and category.
    */
  var snippet: js.UndefOr[SchemaVideoSnippet] = js.native
  
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: js.UndefOr[SchemaVideoStatistics] = js.native
  
  /**
    * The status object contains information about the video&#39;s uploading,
    * processing, and privacy statuses.
    */
  var status: js.UndefOr[SchemaVideoStatus] = js.native
  
  /**
    * The suggestions object encapsulates suggestions that identify
    * opportunities to improve the video quality or the metadata for the
    * uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: js.UndefOr[SchemaVideoSuggestions] = js.native
  
  /**
    * The topicDetails object encapsulates information about Freebase topics
    * associated with the video.
    */
  var topicDetails: js.UndefOr[SchemaVideoTopicDetails] = js.native
}
object SchemaVideo {
  
  @scala.inline
  def apply(): SchemaVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideo]
  }
  
  @scala.inline
  implicit class SchemaVideoMutableBuilder[Self <: SchemaVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeGating(value: SchemaVideoAgeGating): Self = StObject.set(x, "ageGating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeGatingUndefined: Self = StObject.set(x, "ageGating", js.undefined)
    
    @scala.inline
    def setContentDetails(value: SchemaVideoContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFileDetails(value: SchemaVideoFileDetails): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLiveStreamingDetails(value: SchemaVideoLiveStreamingDetails): Self = StObject.set(x, "liveStreamingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveStreamingDetailsUndefined: Self = StObject.set(x, "liveStreamingDetails", js.undefined)
    
    @scala.inline
    def setLocalizations(value: StringDictionary[SchemaVideoLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    @scala.inline
    def setMonetizationDetails(value: SchemaVideoMonetizationDetails): Self = StObject.set(x, "monetizationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonetizationDetailsUndefined: Self = StObject.set(x, "monetizationDetails", js.undefined)
    
    @scala.inline
    def setPlayer(value: SchemaVideoPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    @scala.inline
    def setProcessingDetails(value: SchemaVideoProcessingDetails): Self = StObject.set(x, "processingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingDetailsUndefined: Self = StObject.set(x, "processingDetails", js.undefined)
    
    @scala.inline
    def setProjectDetails(value: SchemaVideoProjectDetails): Self = StObject.set(x, "projectDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDetailsUndefined: Self = StObject.set(x, "projectDetails", js.undefined)
    
    @scala.inline
    def setRecordingDetails(value: SchemaVideoRecordingDetails): Self = StObject.set(x, "recordingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingDetailsUndefined: Self = StObject.set(x, "recordingDetails", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaVideoSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: SchemaVideoStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaVideoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSuggestions(value: SchemaVideoSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setTopicDetails(value: SchemaVideoTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
  }
}
