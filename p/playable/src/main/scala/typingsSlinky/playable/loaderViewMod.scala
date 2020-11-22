package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.loaderTypesMod.ILoaderViewStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/loader/loader.view", JSImport.Namespace)
@js.native
object loaderViewMod extends js.Object {
  
  @js.native
  trait LoaderView
    extends typingsSlinky.playable.stylableMod.default[ILoaderViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
  }
  
  @js.native
  class default () extends LoaderView
}
