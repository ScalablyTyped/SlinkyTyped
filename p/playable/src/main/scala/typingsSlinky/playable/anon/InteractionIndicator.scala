package typingsSlinky.playable.anon

import typingsSlinky.playable.configMod.IPlayerConfig
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.fullScreenManagerTypesMod.IFullScreenManager
import typingsSlinky.playable.interactionIndicatorTypesMod.IInteractionIndicator
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngine
import typingsSlinky.playable.rootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionIndicator extends StObject {
  
  var config: IPlayerConfig = js.native
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var fullScreenManager: IFullScreenManager = js.native
  
  var interactionIndicator: IInteractionIndicator = js.native
  
  var rootContainer: IRootContainer = js.native
}
object InteractionIndicator {
  
  @scala.inline
  def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    fullScreenManager: IFullScreenManager,
    interactionIndicator: IInteractionIndicator,
    rootContainer: IRootContainer
  ): InteractionIndicator = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenManager = fullScreenManager.asInstanceOf[js.Any], interactionIndicator = interactionIndicator.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIndicator]
  }
  
  @scala.inline
  implicit class InteractionIndicatorMutableBuilder[Self <: InteractionIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenManager(value: IFullScreenManager): Self = StObject.set(x, "fullScreenManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionIndicator(value: IInteractionIndicator): Self = StObject.set(x, "interactionIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
