package typingsSlinky.rcCascader

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcCascader.cascaderMod.CascaderFieldNames
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menusMod {
  
  @JSImport("rc-cascader/es/Menus", JSImport.Default)
  @js.native
  class default () extends Menus
  object default {
    
    @JSImport("rc-cascader/es/Menus", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-cascader/es/Menus", "default.defaultProps")
    @js.native
    def defaultProps: MenusProps = js.native
    @scala.inline
    def defaultProps_=(x: MenusProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type MenuItems = NumberDictionary[HTMLLIElement]
  
  @js.native
  trait Menus
    extends Component[MenusProps, js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MMenus(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMenus(prevProps: MenusProps): Unit = js.native
    
    def delayOnSelect(onSelect: js.Any, args: js.Any*): Unit = js.native
    
    var delayTimer: Double = js.native
    
    def getActiveOptions(): js.Array[CascaderOption] = js.native
    def getActiveOptions(values: js.Array[CascaderOption]): js.Array[CascaderOption] = js.native
    
    def getFieldName(name: js.Any): js.Any = js.native
    
    def getOption(option: CascaderOption, menuIndex: Double): ReactElement = js.native
    
    def getShowOptions(): js.Array[js.Array[CascaderOption]] = js.native
    
    def isActiveOption(option: js.Any, menuIndex: js.Any): Boolean = js.native
    
    var menuItems: MenuItems = js.native
    
    def saveMenuItem(index: js.Any): js.Function1[/* node */ js.Any, Unit] = js.native
    
    def scrollActiveItemToView(): Unit = js.native
  }
  
  @js.native
  trait MenusProps extends StObject {
    
    var activeValue: js.UndefOr[js.Array[String | Double]] = js.native
    
    var defaultFieldNames: js.UndefOr[CascaderFieldNames] = js.native
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
    
    var expandIcon: js.UndefOr[ReactElement] = js.native
    
    var expandTrigger: js.UndefOr[String] = js.native
    
    var fieldNames: js.UndefOr[CascaderFieldNames] = js.native
    
    var loadingIcon: js.UndefOr[ReactElement] = js.native
    
    var onItemDoubleClick: js.UndefOr[
        js.Function3[
          /* targetOption */ js.Array[String], 
          /* index */ Double, 
          /* e */ SyntheticMouseEvent[HTMLElement], 
          Unit
        ]
      ] = js.native
    
    var onSelect: js.UndefOr[
        js.Function3[
          /* targetOption */ js.Array[String], 
          /* index */ Double, 
          /* e */ SyntheticKeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.native
    
    var options: js.UndefOr[js.Array[CascaderOption]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Array[String | Double]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object MenusProps {
    
    @scala.inline
    def apply(): MenusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenusProps]
    }
    
    @scala.inline
    implicit class MenusPropsMutableBuilder[Self <: MenusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveValue(value: js.Array[String | Double]): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveValueUndefined: Self = StObject.set(x, "activeValue", js.undefined)
      
      @scala.inline
      def setActiveValueVarargs(value: (String | Double)*): Self = StObject.set(x, "activeValue", js.Array(value :_*))
      
      @scala.inline
      def setDefaultFieldNames(value: CascaderFieldNames): Self = StObject.set(x, "defaultFieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFieldNamesUndefined: Self = StObject.set(x, "defaultFieldNames", js.undefined)
      
      @scala.inline
      def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconReactElement(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExpandTrigger(value: String): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      @scala.inline
      def setFieldNames(value: CascaderFieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setLoadingIcon(value: ReactElement): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconReactElement(value: ReactElement): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setOnItemDoubleClick(
        value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "onItemDoubleClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnItemDoubleClickUndefined: Self = StObject.set(x, "onItemDoubleClick", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticKeyboardEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[CascaderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: CascaderOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[String | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
