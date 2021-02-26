package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.photo_
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.video_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadBroadcastReelOptionsMod {
  
  @js.native
  trait DirectThreadBroadcastReelOptions extends StObject {
    
    var mediaId: String = js.native
    
    var mediaType: js.UndefOr[photo_ | video_] = js.native
    
    var reelId: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object DirectThreadBroadcastReelOptions {
    
    @scala.inline
    def apply(mediaId: String): DirectThreadBroadcastReelOptions = {
      val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastReelOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastReelOptionsMutableBuilder[Self <: DirectThreadBroadcastReelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaType(value: photo_ | video_): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setReelId(value: String): Self = StObject.set(x, "reelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReelIdUndefined: Self = StObject.set(x, "reelId", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
