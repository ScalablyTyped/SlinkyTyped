package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.loadingCoverTypesMod.ILoadingCoverViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingCoverViewMod {
  
  @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover.view", JSImport.Default)
  @js.native
  class default () extends LoadingCoverView
  
  @js.native
  trait LoadingCoverView
    extends typingsSlinky.playable.viewMod.default[ILoadingCoverViewStyles] {
    
    @JSName("_$image")
    var _$image: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCover(url: String): Unit = js.native
    def setCover(url: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
