package typingsSlinky.rcCollapse

import slinky.core.facade.ReactElement
import typingsSlinky.rcCollapse.anon.PartialCollapseState
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  @JSImport("rc-collapse/es/Collapse", JSImport.Default)
  @js.native
  class default protected () extends Collapse {
    def this(props: CollapseProps) = this()
  }
  object default {
    
    /* was `typeof CollapsePanel` */
    @JSImport("rc-collapse/es/Collapse", "default.Panel")
    @js.native
    class Panel ()
      extends typingsSlinky.rcCollapse.panelMod.default
    /* was `typeof CollapsePanel` */
    object Panel {
      
      /* static member */
      object defaultProps {
        
        @JSImport("rc-collapse/es/Collapse", "default.Panel.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("rc-collapse/es/Collapse", "default.Panel.defaultProps.forceRender")
        @js.native
        def forceRender: Boolean = js.native
        @scala.inline
        def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse/es/Collapse", "default.Panel.defaultProps.headerClass")
        @js.native
        def headerClass: String = js.native
        @scala.inline
        def headerClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse/es/Collapse", "default.Panel.defaultProps.isActive")
        @js.native
        def isActive: Boolean = js.native
        @scala.inline
        def isActive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isActive")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse/es/Collapse", "default.Panel.defaultProps.onItemClick")
        @js.native
        def onItemClick(): Unit = js.native
        
        @JSImport("rc-collapse/es/Collapse", "default.Panel.defaultProps.showArrow")
        @js.native
        def showArrow: Boolean = js.native
        @scala.inline
        def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      }
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-collapse/es/Collapse", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-collapse/es/Collapse", "default.defaultProps.accordion")
      @js.native
      def accordion: Boolean = js.native
      @scala.inline
      def accordion_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accordion")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Collapse", "default.defaultProps.destroyInactivePanel")
      @js.native
      def destroyInactivePanel: Boolean = js.native
      @scala.inline
      def destroyInactivePanel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyInactivePanel")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Collapse", "default.defaultProps.onChange")
      @js.native
      def onChange(): Unit = js.native
      
      @JSImport("rc-collapse/es/Collapse", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-collapse/es/Collapse", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: CollapseProps): PartialCollapseState = js.native
  }
  
  @js.native
  trait Collapse
    extends Component[CollapseProps, CollapseState, js.Any] {
    
    def getItems(): js.Array[ReactElement] = js.native
    
    def getNewChild(child: ReactElement, index: Double): ReactElement = js.native
    
    def onClickItem(key: Key): Unit = js.native
    
    def setActiveKey(activeKey: js.Array[Key]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCollapse(nextProps: CollapseProps, nextState: CollapseState): Boolean = js.native
  }
  object Collapse {
    
    /* was `typeof CollapsePanel` */
    object Panel
    /* was `typeof CollapsePanel` */
    type Panel = typingsSlinky.rcCollapse.panelMod.default
  }
  
  @js.native
  trait CollapseState extends StObject {
    
    var activeKey: js.Array[Key] = js.native
  }
  object CollapseState {
    
    @scala.inline
    def apply(activeKey: js.Array[Key]): CollapseState = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseState]
    }
    
    @scala.inline
    implicit class CollapseStateMutableBuilder[Self <: CollapseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
    }
  }
}
