package typingsSlinky.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStreamMod {
  
  @js.native
  sealed trait MediaStreamDeliveryPriority extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority with Double] = js.native
    
    @js.native
    sealed trait ADAPTIVE_VIA_MSE extends MediaStreamDeliveryPriority
    /* 1 */ val ADAPTIVE_VIA_MSE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE with Double = js.native
    
    @js.native
    sealed trait FORCED extends MediaStreamDeliveryPriority
    /* 3 */ val FORCED: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED with Double = js.native
    
    @js.native
    sealed trait NATIVE_ADAPTIVE extends MediaStreamDeliveryPriority
    /* 2 */ val NATIVE_ADAPTIVE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE with Double = js.native
    
    @js.native
    sealed trait NATIVE_PROGRESSIVE extends MediaStreamDeliveryPriority
    /* 0 */ val NATIVE_PROGRESSIVE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE with Double = js.native
  }
  
  @js.native
  sealed trait MediaStreamType extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType with String] = js.native
    
    @js.native
    sealed trait DASH extends MediaStreamType
    /* "DASH" */ val DASH: typingsSlinky.playable.mediaStreamMod.MediaStreamType.DASH with String = js.native
    
    @js.native
    sealed trait HLS extends MediaStreamType
    /* "HLS" */ val HLS: typingsSlinky.playable.mediaStreamMod.MediaStreamType.HLS with String = js.native
    
    @js.native
    sealed trait MKV extends MediaStreamType
    /* "MKV" */ val MKV: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MKV with String = js.native
    
    @js.native
    sealed trait MOV extends MediaStreamType
    /* "MOV" */ val MOV: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MOV with String = js.native
    
    @js.native
    sealed trait MP4 extends MediaStreamType
    /* "MP4" */ val MP4: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MP4 with String = js.native
    
    @js.native
    sealed trait OGG extends MediaStreamType
    /* "OGG" */ val OGG: typingsSlinky.playable.mediaStreamMod.MediaStreamType.OGG with String = js.native
    
    @js.native
    sealed trait WEBM extends MediaStreamType
    /* "WEBM" */ val WEBM: typingsSlinky.playable.mediaStreamMod.MediaStreamType.WEBM with String = js.native
  }
}
