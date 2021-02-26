package typingsSlinky.playable

import typingsSlinky.playable.adaptersTypesMod.IPlaybackAdapterClass
import typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typingsSlinky.playable.mediaStreamMod.MediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/adapters/native", JSImport.Default)
  @js.native
  def default(streamType: MediaStreamType, deliveryPriority: MediaStreamDeliveryPriority): IPlaybackAdapterClass = js.native
}
