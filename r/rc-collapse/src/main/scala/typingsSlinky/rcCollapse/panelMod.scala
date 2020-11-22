package typingsSlinky.rcCollapse

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcCollapse.anon.ForceRender
import typingsSlinky.rcCollapse.interfaceMod.CollapsePanelProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-collapse/es/Panel", JSImport.Namespace)
@js.native
object panelMod extends js.Object {
  
  @js.native
  trait CollapsePanel
    extends Component[CollapsePanelProps, js.Any, js.Any] {
    
    def handleItemClick(): Unit = js.native
    
    def handleKeyPress(e: SyntheticKeyboardEvent[Element]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCollapsePanel(nextProps: CollapsePanelProps): Boolean = js.native
  }
  
  @js.native
  class default () extends CollapsePanel
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: ForceRender = js.native
  }
}
