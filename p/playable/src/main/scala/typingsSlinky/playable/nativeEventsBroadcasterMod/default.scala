package typingsSlinky.playable.nativeEventsBroadcasterMod

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/output/native/native-events-broadcaster", JSImport.Default)
@js.native
class default protected () extends NativeEventsBroadcaster {
  def this(eventEmitter: IEventEmitter, output: HTMLVideoElement) = this()
}
