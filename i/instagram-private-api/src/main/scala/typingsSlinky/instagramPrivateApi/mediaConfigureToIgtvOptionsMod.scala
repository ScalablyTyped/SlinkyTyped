package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Androidversion
import typingsSlinky.instagramPrivateApi.anon.Cropbottom
import typingsSlinky.instagramPrivateApi.anon.LengthSourcetype
import typingsSlinky.instagramPrivateApi.anon.Numreupload
import typingsSlinky.instagramPrivateApi.anon.Sourceheight
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaConfigureToIgtvOptionsMod {
  
  @js.native
  trait MediaConfigureToIgtvOptions extends StObject {
    
    var audio_muted: js.UndefOr[Boolean] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var clips: js.UndefOr[js.Array[LengthSourcetype]] = js.native
    
    var date_time_original: js.UndefOr[String] = js.native
    
    var device: js.UndefOr[Androidversion] = js.native
    
    var extra: Sourceheight = js.native
    
    var feed_preview_crop: js.UndefOr[Cropbottom | String] = js.native
    
    var filter_type: js.UndefOr[String] = js.native
    
    var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.native
    
    var length: Double = js.native
    
    var media_folder: js.UndefOr[String] = js.native
    
    var poster_frame_index: js.UndefOr[Double] = js.native
    
    var retryContext: js.UndefOr[Numreupload] = js.native
    
    var source_type: js.UndefOr[`3` | `4`] = js.native
    
    var timezone_offset: js.UndefOr[String] = js.native
    
    var title: String = js.native
    
    var upload_id: String = js.native
  }
  object MediaConfigureToIgtvOptions {
    
    @scala.inline
    def apply(extra: Sourceheight, length: Double, title: String, upload_id: String): MediaConfigureToIgtvOptions = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureToIgtvOptions]
    }
    
    @scala.inline
    implicit class MediaConfigureToIgtvOptionsMutableBuilder[Self <: MediaConfigureToIgtvOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio_muted(value: Boolean): Self = StObject.set(x, "audio_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudio_mutedUndefined: Self = StObject.set(x, "audio_muted", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setClips(value: js.Array[LengthSourcetype]): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipsUndefined: Self = StObject.set(x, "clips", js.undefined)
      
      @scala.inline
      def setClipsVarargs(value: LengthSourcetype*): Self = StObject.set(x, "clips", js.Array(value :_*))
      
      @scala.inline
      def setDate_time_original(value: String): Self = StObject.set(x, "date_time_original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_time_originalUndefined: Self = StObject.set(x, "date_time_original", js.undefined)
      
      @scala.inline
      def setDevice(value: Androidversion): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setExtra(value: Sourceheight): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeed_preview_crop(value: Cropbottom | String): Self = StObject.set(x, "feed_preview_crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeed_preview_cropUndefined: Self = StObject.set(x, "feed_preview_crop", js.undefined)
      
      @scala.inline
      def setFilter_type(value: String): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_typeUndefined: Self = StObject.set(x, "filter_type", js.undefined)
      
      @scala.inline
      def setIgtv_share_preview_to_feed(value: `1` | `0`): Self = StObject.set(x, "igtv_share_preview_to_feed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgtv_share_preview_to_feedUndefined: Self = StObject.set(x, "igtv_share_preview_to_feed", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_folder(value: String): Self = StObject.set(x, "media_folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_folderUndefined: Self = StObject.set(x, "media_folder", js.undefined)
      
      @scala.inline
      def setPoster_frame_index(value: Double): Self = StObject.set(x, "poster_frame_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoster_frame_indexUndefined: Self = StObject.set(x, "poster_frame_index", js.undefined)
      
      @scala.inline
      def setRetryContext(value: Numreupload): Self = StObject.set(x, "retryContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryContextUndefined: Self = StObject.set(x, "retryContext", js.undefined)
      
      @scala.inline
      def setSource_type(value: `3` | `4`): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
    }
  }
}
