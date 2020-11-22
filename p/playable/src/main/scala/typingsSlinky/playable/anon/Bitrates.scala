package typingsSlinky.playable.anon

import typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typingsSlinky.playable.mediaStreamMod.MediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bitrates extends js.Object {
  
  var bitrates: js.Any = js.native
  
  var bwEstimate: js.Any = js.native
  
  var currentBitrate: js.Any = js.native
  
  var currentTrack: js.Any = js.native
  
  var deliveryPriority: MediaStreamDeliveryPriority = js.native
  
  var nearestBufferSegInfo: End = js.native
  
  var overallBufferLength: js.Any = js.native
  
  var `type`: MediaStreamType = js.native
  
  var url: String = js.native
}
object Bitrates {
  
  @scala.inline
  def apply(
    bitrates: js.Any,
    bwEstimate: js.Any,
    currentBitrate: js.Any,
    currentTrack: js.Any,
    deliveryPriority: MediaStreamDeliveryPriority,
    nearestBufferSegInfo: End,
    overallBufferLength: js.Any,
    `type`: MediaStreamType,
    url: String
  ): Bitrates = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTrack = currentTrack.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bitrates]
  }
  
  @scala.inline
  implicit class BitratesOps[Self <: Bitrates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitrates(value: js.Any): Self = this.set("bitrates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwEstimate(value: js.Any): Self = this.set("bwEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBitrate(value: js.Any): Self = this.set("currentBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTrack(value: js.Any): Self = this.set("currentTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPriority(value: MediaStreamDeliveryPriority): Self = this.set("deliveryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestBufferSegInfo(value: End): Self = this.set("nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBufferLength(value: js.Any): Self = this.set("overallBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaStreamType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
