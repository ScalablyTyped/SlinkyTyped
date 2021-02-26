package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.EventEmitterRootContainer
import typingsSlinky.playable.subtitlesTypesMod.ISubtitles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtitlesMod {
  
  @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", JSImport.Default)
  @js.native
  class default protected () extends Subtitles {
    def this(hasRootContainerEngineEventEmitter: EventEmitterRootContainer) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof SubtitlesView` */
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", "default.View")
    @js.native
    class View ()
      extends typingsSlinky.playable.subtitlesViewMod.default
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/subtitles/subtitles", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
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
  object Subtitles {
    
    /* was `typeof SubtitlesView` */
    type View = typingsSlinky.playable.subtitlesViewMod.default
  }
}
