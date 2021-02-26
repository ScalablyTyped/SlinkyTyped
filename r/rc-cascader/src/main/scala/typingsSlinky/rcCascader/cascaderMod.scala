package typingsSlinky.rcCascader

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcCascader.anon.Visible
import typingsSlinky.rcTrigger.interfaceMod.BuildInPlacements
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderMod {
  
  @JSImport("rc-cascader/es/Cascader", JSImport.Default)
  @js.native
  class default protected () extends Cascader {
    def this(props: CascaderProps) = this()
  }
  object default {
    
    @JSImport("rc-cascader/es/Cascader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-cascader/es/Cascader", "default.defaultProps")
    @js.native
    def defaultProps: CascaderProps = js.native
    @scala.inline
    def defaultProps_=(x: CascaderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("rc-cascader/es/Cascader", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: CascaderProps, prevState: CascaderState): CascaderState = js.native
  }
  
  @js.native
  trait Cascader
    extends Component[CascaderProps, CascaderState, js.Any] {
    
    var defaultFieldNames: js.Object = js.native
    
    def getActiveOptions(activeValue: CascaderValueType): js.Array[CascaderOption] = js.native
    
    def getCurrentLevelOptions(): js.Array[CascaderOption] = js.native
    
    def getFieldName(name: String): String = js.native
    
    def getFieldNames(): CascaderFieldNames = js.native
    
    def getPopupDOMNode(): js.Any = js.native
    
    def handleChange(options: js.Array[CascaderOption], hasVisible: Visible, e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    def handleItemDoubleClick(): Unit = js.native
    
    def handleKeyDown(e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    def handleMenuSelect(targetOption: CascaderOption, menuIndex: Double, e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
    
    def saveTrigger(node: js.Any): Unit = js.native
    
    def setPopupVisible(popupVisible: Boolean): Unit = js.native
    
    var trigger: js.Any = js.native
  }
  
  @js.native
  trait CascaderFieldNames extends StObject {
    
    var children: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object CascaderFieldNames {
    
    @scala.inline
    def apply(): CascaderFieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderFieldNames]
    }
    
    @scala.inline
    implicit class CascaderFieldNamesMutableBuilder[Self <: CascaderFieldNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CascaderOption
    extends /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Array[CascaderOption]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object CascaderOption {
    
    @scala.inline
    def apply(): CascaderOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderOption]
    }
    
    @scala.inline
    implicit class CascaderOptionMutableBuilder[Self <: CascaderOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[CascaderOption]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: CascaderOption*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'getPopupContainer'> */
  @js.native
  trait CascaderProps extends StObject {
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
    
    var changeOnSelect: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var defaultValue: js.UndefOr[CascaderValueType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
    
    var expandIcon: js.UndefOr[ReactElement] = js.native
    
    var expandTrigger: js.UndefOr[String] = js.native
    
    var fieldNames: js.UndefOr[CascaderFieldNames] = js.native
    
    var filedNames: js.UndefOr[CascaderFieldNames] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[CascaderOption], Unit]] = js.native
    
    var loadingIcon: js.UndefOr[ReactElement] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ CascaderValueType, /* selectOptions */ js.Array[CascaderOption], Unit]
      ] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.native
    
    var options: js.UndefOr[js.Array[CascaderOption]] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var popupPlacement: js.UndefOr[String] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[CascaderValueType] = js.native
  }
  object CascaderProps {
    
    @scala.inline
    def apply(): CascaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderProps]
    }
    
    @scala.inline
    implicit class CascaderPropsMutableBuilder[Self <: CascaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: CascaderValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      @scala.inline
      def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
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
      def setFiledNames(value: CascaderFieldNames): Self = StObject.set(x, "filedNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiledNamesUndefined: Self = StObject.set(x, "filedNames", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* selectOptions */ js.Array[CascaderOption] => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoadingIcon(value: ReactElement): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconReactElement(value: ReactElement): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ CascaderValueType, /* selectOptions */ js.Array[CascaderOption]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[CascaderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: CascaderOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CascaderState extends StObject {
    
    var activeValue: js.UndefOr[CascaderValueType] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prevProps: js.UndefOr[CascaderProps] = js.native
    
    var value: js.UndefOr[CascaderValueType] = js.native
  }
  object CascaderState {
    
    @scala.inline
    def apply(): CascaderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderState]
    }
    
    @scala.inline
    implicit class CascaderStateMutableBuilder[Self <: CascaderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveValue(value: CascaderValueType): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveValueUndefined: Self = StObject.set(x, "activeValue", js.undefined)
      
      @scala.inline
      def setActiveValueVarargs(value: (String | Double)*): Self = StObject.set(x, "activeValue", js.Array(value :_*))
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrevProps(value: CascaderProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CascaderValueType = js.Array[String | Double]
}
