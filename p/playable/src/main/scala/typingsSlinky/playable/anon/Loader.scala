package typingsSlinky.playable.anon

import typingsSlinky.playable.configMod.IPlayerConfig
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.loaderTypesMod.ILoader
import typingsSlinky.playable.mainUiBlockTypesMod.IMainUIBlock
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngine
import typingsSlinky.playable.rootContainerTypesMod.IRootContainer
import typingsSlinky.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends StObject {
  
  var config: IPlayerConfig = js.native
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var loader: ILoader = js.native
  
  var mainUIBlock: IMainUIBlock = js.native
  
  var rootContainer: IRootContainer = js.native
  
  var theme: IThemeService = js.native
}
object Loader {
  
  @scala.inline
  def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    loader: ILoader,
    mainUIBlock: IMainUIBlock,
    rootContainer: IRootContainer,
    theme: IThemeService
  ): Loader = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], mainUIBlock = mainUIBlock.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderMutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: ILoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUIBlock(value: IMainUIBlock): Self = StObject.set(x, "mainUIBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
