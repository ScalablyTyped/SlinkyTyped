package typingsSlinky.reactDndTouchBackend

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import typingsSlinky.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typingsSlinky.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-touch-backend/lib/OptionsReader", JSImport.Namespace)
@js.native
object optionsReaderMod extends js.Object {
  
  @js.native
  class OptionsReader protected () extends TouchBackendOptions {
    def this(incoming: TouchBackendOptions, context: TouchBackendContext) = this()
    
    var context: js.Any = js.native
    
    @JSName("delayMouseStart")
    var delayMouseStart_OptionsReader: Double = js.native
    
    @JSName("delayTouchStart")
    var delayTouchStart_OptionsReader: Double = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    @JSName("enableHoverOutsideTarget")
    var enableHoverOutsideTarget_OptionsReader: Boolean = js.native
    
    @JSName("enableKeyboardEvents")
    var enableKeyboardEvents_OptionsReader: Boolean = js.native
    
    @JSName("enableMouseEvents")
    var enableMouseEvents_OptionsReader: Boolean = js.native
    
    @JSName("enableTouchEvents")
    var enableTouchEvents_OptionsReader: Boolean = js.native
    
    @JSName("ignoreContextMenu")
    var ignoreContextMenu_OptionsReader: Boolean = js.native
    
    @JSName("touchSlop")
    var touchSlop_OptionsReader: Double = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}
