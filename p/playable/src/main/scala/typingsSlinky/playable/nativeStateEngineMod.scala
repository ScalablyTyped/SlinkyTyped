package typingsSlinky.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.playable.engineStateMod.EngineState
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeStateEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/state-engine", JSImport.Default)
  @js.native
  class default protected () extends StateEngine {
    def this(eventEmitter: IEventEmitter, video: HTMLVideoElement) = this()
  }
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/state-engine", "NATIVE_VIDEO_EVENTS_TO_STATE")
  @js.native
  val NATIVE_VIDEO_EVENTS_TO_STATE: js.Array[String] = js.native
  
  @js.native
  trait StateEngine extends StObject {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _currentState: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initialTimeStamp: js.Any = js.native
    
    var _isMetadataLoaded: js.Any = js.native
    
    var _processEventFromVideo: js.Any = js.native
    
    var _setInitialTimeStamp: js.Any = js.native
    
    var _setStateTimestamp: js.Any = js.native
    
    var _statesTimestamps: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _video: js.Any = js.native
    
    def clearTimestamps(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def isMetadataLoaded: Boolean = js.native
    
    def setState(state: EngineState): Unit = js.native
    
    def state: EngineState = js.native
    
    def stateTimestamps: StringDictionary[Double] = js.native
  }
}
