package typingsSlinky.hlsParser.anon

import typingsSlinky.hlsParser.hlsParserStrings.AUDIO
import typingsSlinky.hlsParser.hlsParserStrings.SUBTITLES
import typingsSlinky.hlsParser.hlsParserStrings.VIDEO
import typingsSlinky.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typingsSlinky.hlsParser.mod.types.Rendition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AverageBandwidth extends StObject {
  
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.native
  
  var averageBandwidth: js.UndefOr[Double] = js.native
  
  var bandwidth: Double = js.native
  
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.native
  
  var codecs: js.UndefOr[String] = js.native
  
  var currentRenditions: js.UndefOr[Audio] = js.native
  
  var frameRate: js.UndefOr[Double] = js.native
  
  var hdcpLevel: js.UndefOr[String] = js.native
  
  var isIFrameOnly: js.UndefOr[Boolean] = js.native
  
  var resolution: js.UndefOr[Height] = js.native
  
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.native
  
  var uri: String = js.native
  
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.native
}
object AverageBandwidth {
  
  @scala.inline
  def apply(bandwidth: Double, uri: String): AverageBandwidth = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageBandwidth]
  }
  
  @scala.inline
  implicit class AverageBandwidthMutableBuilder[Self <: AverageBandwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: js.Array[Rendition[AUDIO]]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setAudioVarargs(value: Rendition[AUDIO]*): Self = StObject.set(x, "audio", js.Array(value :_*))
    
    @scala.inline
    def setAverageBandwidth(value: Double): Self = StObject.set(x, "averageBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageBandwidthUndefined: Self = StObject.set(x, "averageBandwidth", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptions(value: js.Array[Rendition[`CLOSED-CAPTIONS`]]): Self = StObject.set(x, "closedCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptionsUndefined: Self = StObject.set(x, "closedCaptions", js.undefined)
    
    @scala.inline
    def setClosedCaptionsVarargs(value: Rendition[`CLOSED-CAPTIONS`]*): Self = StObject.set(x, "closedCaptions", js.Array(value :_*))
    
    @scala.inline
    def setCodecs(value: String): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecsUndefined: Self = StObject.set(x, "codecs", js.undefined)
    
    @scala.inline
    def setCurrentRenditions(value: Audio): Self = StObject.set(x, "currentRenditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRenditionsUndefined: Self = StObject.set(x, "currentRenditions", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setHdcpLevel(value: String): Self = StObject.set(x, "hdcpLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdcpLevelUndefined: Self = StObject.set(x, "hdcpLevel", js.undefined)
    
    @scala.inline
    def setIsIFrameOnly(value: Boolean): Self = StObject.set(x, "isIFrameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIFrameOnlyUndefined: Self = StObject.set(x, "isIFrameOnly", js.undefined)
    
    @scala.inline
    def setResolution(value: Height): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setSubtitles(value: js.Array[Rendition[SUBTITLES]]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    @scala.inline
    def setSubtitlesVarargs(value: Rendition[SUBTITLES]*): Self = StObject.set(x, "subtitles", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: js.Array[Rendition[VIDEO]]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setVideoVarargs(value: Rendition[VIDEO]*): Self = StObject.set(x, "video", js.Array(value :_*))
  }
}
