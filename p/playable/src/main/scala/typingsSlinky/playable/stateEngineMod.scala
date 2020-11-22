package typingsSlinky.playable

import typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerController
import typingsSlinky.playable.engineStateMod.EngineState
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.playbackEngineTypesMod.IVideoOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/output/chromecast/state-engine", JSImport.Namespace)
@js.native
object stateEngineMod extends js.Object {
  
  @js.native
  trait StateEngine extends js.Object {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _checkVolumeChanges: js.Any = js.native
    
    var _currentMute: js.Any = js.native
    
    var _currentState: js.Any = js.native
    
    var _currentVolume: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _isMetadataLoaded: js.Any = js.native
    
    var _output: js.Any = js.native
    
    var _processEventFromVideo: js.Any = js.native
    
    var _remotePlayerController: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def isMetadataLoaded: Boolean = js.native
    
    def setState(state: EngineState): Unit = js.native
    
    def state: EngineState = js.native
  }
  
  @js.native
  class default protected () extends StateEngine {
    def this(eventEmitter: IEventEmitter, output: IVideoOutput, controller: RemotePlayerController) = this()
  }
}
