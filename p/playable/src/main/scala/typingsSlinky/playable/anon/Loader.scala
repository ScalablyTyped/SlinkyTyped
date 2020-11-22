package typingsSlinky.playable.anon

import typingsSlinky.playable.configMod.IPlayerConfig
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.loaderTypesMod.ILoader
import typingsSlinky.playable.mainUiBlockTypesMod.IMainUIBlock
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngine
import typingsSlinky.playable.rootContainerTypesMod.IRootContainer
import typingsSlinky.playable.themeTypesMod.IThemeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends js.Object {
  
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
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: ILoader): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUIBlock(value: IMainUIBlock): Self = this.set("mainUIBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = this.set("rootContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
