package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexSettings extends StObject {
  
  /**
    * Maximum video buffer delay in milliseconds.
    */
  var MaximumVideoBufferDelayMilliseconds: js.UndefOr[integerMin800Max3000] = js.native
  
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: integerMin1000000Max100000000 = js.native
  
  /**
    * Transport stream ID.
    */
  var TransportStreamId: integerMin0Max65535 = js.native
  
  /**
    * Transport stream reserved bit rate.
    */
  var TransportStreamReservedBitrate: js.UndefOr[integerMin0Max100000000] = js.native
}
object MultiplexSettings {
  
  @scala.inline
  def apply(TransportStreamBitrate: integerMin1000000Max100000000, TransportStreamId: integerMin0Max65535): MultiplexSettings = {
    val __obj = js.Dynamic.literal(TransportStreamBitrate = TransportStreamBitrate.asInstanceOf[js.Any], TransportStreamId = TransportStreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexSettings]
  }
  
  @scala.inline
  implicit class MultiplexSettingsMutableBuilder[Self <: MultiplexSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumVideoBufferDelayMilliseconds(value: integerMin800Max3000): Self = StObject.set(x, "MaximumVideoBufferDelayMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumVideoBufferDelayMillisecondsUndefined: Self = StObject.set(x, "MaximumVideoBufferDelayMilliseconds", js.undefined)
    
    @scala.inline
    def setTransportStreamBitrate(value: integerMin1000000Max100000000): Self = StObject.set(x, "TransportStreamBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportStreamId(value: integerMin0Max65535): Self = StObject.set(x, "TransportStreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportStreamReservedBitrate(value: integerMin0Max100000000): Self = StObject.set(x, "TransportStreamReservedBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportStreamReservedBitrateUndefined: Self = StObject.set(x, "TransportStreamReservedBitrate", js.undefined)
  }
}
