package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.EventEmitterRootContainer
import typingsSlinky.playable.subtitlesTypesMod.ISubtitles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/subtitles/subtitles", JSImport.Namespace)
@js.native
object subtitlesMod extends js.Object {
  
  @js.native
  trait Subtitles extends ISubtitles {
    
    var _activeSubtitleIndex: js.Any = js.native
    
    var _addSubtitle: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _clearActiveSubtitle: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _setActiveSubtitle: js.Any = js.native
    
    var _showSubtitles: js.Any = js.native
    
    var _trackList: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _video: js.Any = js.native
    
    def getElement(): HTMLElement = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typingsSlinky.playable.subtitlesViewMod.default = js.native
  }
  
  @js.native
  class default protected () extends Subtitles {
    def this(hasRootContainerEngineEventEmitter: EventEmitterRootContainer) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable0[typingsSlinky.playable.subtitlesViewMod.default] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
