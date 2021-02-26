package typingsSlinky.rcCollapse

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rcCollapse.anon.PartialCollapseState
import typingsSlinky.rcCollapse.anon.Typeofdefault
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-collapse", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.rcCollapse.collapseMod.default {
    def this(props: CollapseProps) = this()
  }
  object default {
    
    /* was `typeof CollapsePanel` */
    @JSImport("rc-collapse", "default.Panel")
    @js.native
    class Panel ()
      extends typingsSlinky.rcCollapse.collapseMod.default.Panel
    /* was `typeof CollapsePanel` */
    object Panel {
      
      /* static member */
      object defaultProps {
        
        @JSImport("rc-collapse", "default.Panel.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.forceRender")
        @js.native
        def forceRender: Boolean = js.native
        @scala.inline
        def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.headerClass")
        @js.native
        def headerClass: String = js.native
        @scala.inline
        def headerClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.isActive")
        @js.native
        def isActive: Boolean = js.native
        @scala.inline
        def isActive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isActive")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.onItemClick")
        @js.native
        def onItemClick(): Unit = js.native
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.showArrow")
        @js.native
        def showArrow: Boolean = js.native
        @scala.inline
        def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      }
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-collapse", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-collapse", "default.defaultProps.accordion")
      @js.native
      def accordion: Boolean = js.native
      @scala.inline
      def accordion_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accordion")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse", "default.defaultProps.destroyInactivePanel")
      @js.native
      def destroyInactivePanel: Boolean = js.native
      @scala.inline
      def destroyInactivePanel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyInactivePanel")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse", "default.defaultProps.onChange")
      @js.native
      def onChange(): Unit = js.native
      
      @JSImport("rc-collapse", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-collapse", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: CollapseProps): PartialCollapseState = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-collapse", "Panel")
  @js.native
  class Panel ()
    extends typingsSlinky.rcCollapse.panelMod.default
  @JSImport("rc-collapse", "Panel")
  @js.native
  val Panel: Instantiable0[typingsSlinky.rcCollapse.panelMod.default] with Typeofdefault = js.native
}
