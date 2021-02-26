package typingsSlinky.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates format information about a media file. */
@js.native
trait MediaFileData extends StObject {
  
  /** The average bitrate of the content. The value is zero for images. */
  var bitrate: Double = js.native
  
  /** The actual format of the audio and video content. */
  var codecs: String = js.native
  
  /** The length of the video or sound clip in seconds. The value is zero for images. */
  var duration: Double = js.native
  
  /** The height of the image or video in pixels. The value is zero for audio clips. */
  var height: Double = js.native
  
  /** The width of the image or video in pixels. The value is zero for audio clips. */
  var width: Double = js.native
}
object MediaFileData {
  
  @scala.inline
  def apply(bitrate: Double, codecs: String, duration: Double, height: Double, width: Double): MediaFileData = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFileData]
  }
  
  @scala.inline
  implicit class MediaFileDataMutableBuilder[Self <: MediaFileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecs(value: String): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
