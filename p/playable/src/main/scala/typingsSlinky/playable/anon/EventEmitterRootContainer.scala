package typingsSlinky.playable.anon

import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngine
import typingsSlinky.playable.rootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitterRootContainer extends StObject {
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var rootContainer: IRootContainer = js.native
}
object EventEmitterRootContainer {
  
  @scala.inline
  def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter, rootContainer: IRootContainer): EventEmitterRootContainer = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterRootContainer]
  }
  
  @scala.inline
  implicit class EventEmitterRootContainerMutableBuilder[Self <: EventEmitterRootContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
