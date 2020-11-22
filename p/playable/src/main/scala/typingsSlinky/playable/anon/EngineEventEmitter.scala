package typingsSlinky.playable.anon

import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngine
import typingsSlinky.playable.themeTypesMod.IThemeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineEventEmitter extends js.Object {
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var theme: IThemeService = js.native
}
object EngineEventEmitter {
  
  @scala.inline
  def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter, theme: IThemeService): EngineEventEmitter = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineEventEmitter]
  }
  
  @scala.inline
  implicit class EngineEventEmitterOps[Self <: EngineEventEmitter] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: IPlaybackEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
