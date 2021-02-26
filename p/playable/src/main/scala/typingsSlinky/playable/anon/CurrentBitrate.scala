package typingsSlinky.playable.anon

import typingsSlinky.playable.mediaStreamMod.MediaStreamType
import typingsSlinky.playable.playableStrings.html5video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentBitrate extends StObject {
  
  var bitrates: js.Array[String] = js.native
  
  var bwEstimate: Double = js.native
  
  var currentBitrate: String = js.native
  
  var currentTime: Double = js.native
  
  var deliveryPriority: String = js.native
  
  var duration: Double = js.native
  
  var loadingStateTimestamps: js.Object = js.native
  
  var nearestBufferSegInfo: js.Object = js.native
  
  var output: html5video = js.native
  
  var overallBufferLength: Double = js.native
  
  var `type`: MediaStreamType = js.native
  
  var url: String = js.native
  
  var viewDimensions: js.Object = js.native
}
object CurrentBitrate {
  
  @scala.inline
  def apply(
    bitrates: js.Array[String],
    bwEstimate: Double,
    currentBitrate: String,
    currentTime: Double,
    deliveryPriority: String,
    duration: Double,
    loadingStateTimestamps: js.Object,
    nearestBufferSegInfo: js.Object,
    output: html5video,
    overallBufferLength: Double,
    `type`: MediaStreamType,
    url: String,
    viewDimensions: js.Object
  ): CurrentBitrate = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loadingStateTimestamps = loadingStateTimestamps.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], viewDimensions = viewDimensions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentBitrate]
  }
  
  @scala.inline
  implicit class CurrentBitrateMutableBuilder[Self <: CurrentBitrate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrates(value: js.Array[String]): Self = StObject.set(x, "bitrates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitratesVarargs(value: String*): Self = StObject.set(x, "bitrates", js.Array(value :_*))
    
    @scala.inline
    def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBitrate(value: String): Self = StObject.set(x, "currentBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPriority(value: String): Self = StObject.set(x, "deliveryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingStateTimestamps(value: js.Object): Self = StObject.set(x, "loadingStateTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestBufferSegInfo(value: js.Object): Self = StObject.set(x, "nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: html5video): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBufferLength(value: Double): Self = StObject.set(x, "overallBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDimensions(value: js.Object): Self = StObject.set(x, "viewDimensions", value.asInstanceOf[js.Any])
  }
}
