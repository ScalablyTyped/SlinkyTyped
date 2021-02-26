package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.playable.adaptersTypesMod.IPlaybackAdapter
import typingsSlinky.playable.adaptersTypesMod.IPlaybackAdapterClass
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.playbackEngineTypesMod.PlayableMediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersStrategyMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/adapters-strategy", JSImport.Default)
  @js.native
  class default protected () extends AdaptersStrategy {
    def this(eventEmitter: IEventEmitter, video: HTMLVideoElement) = this()
    def this(
      eventEmitter: IEventEmitter,
      video: HTMLVideoElement,
      playbackAdapters: js.Array[IPlaybackAdapterClass]
    ) = this()
  }
  
  @js.native
  trait AdaptersStrategy extends StObject {
    
    var _attachedAdapter: js.Any = js.native
    
    var _autoDetectSourceTypes: js.Any = js.native
    
    var _availableAdapters: js.Any = js.native
    
    var _connectAdapterToVideo: js.Any = js.native
    
    var _detachCurrentAdapter: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _playableAdapters: js.Any = js.native
    
    var _resolvePlayableAdapters: js.Any = js.native
    
    var _video: js.Any = js.native
    
    def attachedAdapter: IPlaybackAdapter = js.native
    
    def connectAdapter(src: PlayableMediaSource): Unit = js.native
    
    def destroy(): Unit = js.native
  }
}
