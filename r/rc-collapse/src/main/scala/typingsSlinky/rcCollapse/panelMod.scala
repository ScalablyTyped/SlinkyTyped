package typingsSlinky.rcCollapse

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcCollapse.interfaceMod.CollapsePanelProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("rc-collapse/es/Panel", JSImport.Default)
  @js.native
  class default () extends CollapsePanel
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.forceRender")
      @js.native
      def forceRender: Boolean = js.native
      @scala.inline
      def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.headerClass")
      @js.native
      def headerClass: String = js.native
      @scala.inline
      def headerClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.isActive")
      @js.native
      def isActive: Boolean = js.native
      @scala.inline
      def isActive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isActive")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.onItemClick")
      @js.native
      def onItemClick(): Unit = js.native
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      @scala.inline
      def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollapsePanel
    extends Component[CollapsePanelProps, js.Any, js.Any] {
    
    def handleItemClick(): Unit = js.native
    
    def handleKeyPress(e: SyntheticKeyboardEvent[Element]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCollapsePanel(nextProps: CollapsePanelProps): Boolean = js.native
  }
}
