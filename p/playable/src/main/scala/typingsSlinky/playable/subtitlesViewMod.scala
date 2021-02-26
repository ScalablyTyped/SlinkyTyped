package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.subtitlesTypesMod.ISubtitlesViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtitlesViewMod {
  
  @JSImport("playable/dist/src/modules/ui/subtitles/subtitles.view", JSImport.Default)
  @js.native
  class default () extends SubtitlesView
  
  @js.native
  trait SubtitlesView
    extends typingsSlinky.playable.viewMod.default[ISubtitlesViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$subtitles")
    var _$subtitles: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def clearSubtitles(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def moveSubtitlesDown(): Unit = js.native
    
    def moveSubtitlesUp(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showSubtitles(subtitles: js.Array[String]): Unit = js.native
  }
}
