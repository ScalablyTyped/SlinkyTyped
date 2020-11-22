package typingsSlinky.playable

import typingsSlinky.playable.adaptersTypesMod.IPlaybackAdapterClass
import typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typingsSlinky.playable.mediaStreamMod.MediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/output/native/adapters/native", JSImport.Namespace)
@js.native
object nativeMod extends js.Object {
  
  def default(streamType: MediaStreamType, deliveryPriority: MediaStreamDeliveryPriority): IPlaybackAdapterClass = js.native
}
