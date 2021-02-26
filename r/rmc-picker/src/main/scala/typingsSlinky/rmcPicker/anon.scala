package typingsSlinky.rmcPicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.SFCElement
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.rmcPicker.multiPickerPropsMod.IMultiPickerProps
import typingsSlinky.rmcPicker.pickerMixinMod.IItemProps
import typingsSlinky.rmcPicker.pickerTypesMod.IPickerProps
import typingsSlinky.rmcPicker.rmcPickerStrings.`box-none`
import typingsSlinky.rmcPicker.rmcPickerStrings.`box-only`
import typingsSlinky.rmcPicker.rmcPickerStrings.`no-hide-descendants`
import typingsSlinky.rmcPicker.rmcPickerStrings.assertive
import typingsSlinky.rmcPicker.rmcPickerStrings.auto
import typingsSlinky.rmcPicker.rmcPickerStrings.button
import typingsSlinky.rmcPicker.rmcPickerStrings.dialog
import typingsSlinky.rmcPicker.rmcPickerStrings.dropdown
import typingsSlinky.rmcPicker.rmcPickerStrings.no
import typingsSlinky.rmcPicker.rmcPickerStrings.none
import typingsSlinky.rmcPicker.rmcPickerStrings.polite
import typingsSlinky.rmcPicker.rmcPickerStrings.radiobutton_checked
import typingsSlinky.rmcPicker.rmcPickerStrings.radiobutton_unchecked
import typingsSlinky.rmcPicker.rmcPickerStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ComponentDidMount extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ Readonlydefault, 
          /* prevState */ js.Any, 
          /* prevContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Readonlydefault, /* nextContext */ js.Any, Unit]] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Readonlydefault, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var context: js.Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[_]): Unit = js.native
    
    def getValue(): js.Array[_] = js.native
    
    def onChange(i: js.Any, v: js.Any, cb: js.Any): Unit = js.native
    
    def onScrollChange(i: js.Any, v: js.Any): Unit = js.native
    
    def onValueChange(i: js.Any, v: js.Any): Unit = js.native
    
    var props: ReadonlychildrenReactNode = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): ReactElement = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Readonlydefault, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait ComponentDidUpdate extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyIPickerProps, 
          /* prevState */ js.Any, 
          /* prevContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[/* nextProps */ ReadonlyIPickerProps, /* nextContext */ js.Any, Unit]
      ] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    def computeChildIndex(top: js.Any, itemHeight: js.Any, childrenLength: js.Any): Double = js.native
    
    var context: js.Any = js.native
    
    def doScrollingComplete(top: js.Any, itemHeight: js.Any, fireValueChange: js.Any): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[_]): Unit = js.native
    
    var props: ReadonlychildrenReactNodeChildren = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): ReactElement = js.native
    
    def select(value: js.Any, itemHeight: js.Any, scrollTo: js.Any): Unit = js.native
    
    def selectByIndex(index: js.Any, itemHeight: js.Any, zscrollTo: js.Any): Unit = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait ComponentWillMount extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyIPopupPickerProps, 
          /* prevState */ js.Any, 
          /* prevContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    def componentWillReceiveProps(nextProps: js.Any): Unit = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPopupPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var context: js.Any = js.native
    
    def fireVisibleChange(visible: js.Any): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[_]): Unit = js.native
    
    def getContent(): String | ReactElement | SFCElement[Dictx] = js.native
    
    def getRender(): js.Any = js.native
    
    def hide(): Unit = js.native
    
    def onDismiss(): Unit = js.native
    
    def onOk(): Unit = js.native
    
    def onPickerChange(pickerValue: js.Any): Unit = js.native
    
    def onTriggerClick(e: js.Any): Unit = js.native
    
    var picker: js.Any = js.native
    
    var props: ReadonlychildrenReactNodeActionTextActiveOpacity = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): js.Any = js.native
    
    def saveRef(picker: js.Any): Unit = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
    
    def setVisibleState(visible: js.Any): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPopupPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait DefaultProps
    extends Instantiable1[/* props */ js.Any, ComponentWillMount] {
    
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  trait Dictx
    extends /* x */ StringDictionary[js.Any] {
    
    def ref(picker: js.Any): Unit = js.native
  }
  object Dictx {
    
    @scala.inline
    def apply(ref: js.Any => Unit): Dictx = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[Dictx]
    }
    
    @scala.inline
    implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable0[ComponentDidMount]
       with Instantiable1[/* props */ IMultiPickerProps, ComponentDidMount]
       with Instantiable2[js.UndefOr[/* props */ IMultiPickerProps], /* context */ js.Any, ComponentDidMount] {
    
    var defaultProps: OnValueChange = js.native
  }
  
  @js.native
  trait Item
    extends Instantiable0[ComponentDidUpdate]
       with Instantiable1[/* props */ IPickerProps, ComponentDidUpdate]
       with Instantiable2[js.UndefOr[/* props */ IPickerProps], /* context */ js.Any, ComponentDidUpdate] {
    
    def Item(_props: IItemProps): js.Any = js.native
  }
  
  @js.native
  trait OnValueChange extends StObject {
    
    def onValueChange(): Unit = js.native
    
    var prefixCls: String = js.native
  }
  object OnValueChange {
    
    @scala.inline
    def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnValueChange]
    }
    
    @scala.inline
    implicit class OnValueChangeMutableBuilder[Self <: OnValueChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnValueChange(value: () => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
  @js.native
  trait ReadonlyIPickerProps extends StObject {
    
    val className: js.UndefOr[String] = js.native
    
    val defaultSelectedValue: js.UndefOr[js.Any] = js.native
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val indicatorClassName: js.UndefOr[String] = js.native
    
    val indicatorStyle: js.UndefOr[js.Any] = js.native
    
    val itemStyle: js.UndefOr[js.Any] = js.native
    
    val noAnimate: js.UndefOr[Boolean] = js.native
    
    val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val selectedValue: js.UndefOr[js.Any] = js.native
    
    val style: js.UndefOr[js.Any] = js.native
  }
  object ReadonlyIPickerProps {
    
    @scala.inline
    def apply(): ReadonlyIPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIPickerProps]
    }
    
    @scala.inline
    implicit class ReadonlyIPickerPropsMutableBuilder[Self <: ReadonlyIPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
  @js.native
  trait ReadonlyIPopupPickerProps extends StObject {
    
    val WrapComponent: js.UndefOr[js.Any] = js.native
    
    val actionTextActiveOpacity: js.UndefOr[Double] = js.native
    
    val actionTextUnderlayColor: js.UndefOr[String] = js.native
    
    val className: js.UndefOr[String] = js.native
    
    val content: js.UndefOr[ReactElement | String] = js.native
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val dismissText: js.UndefOr[String | ReactElement] = js.native
    
    val maskTransitionName: js.UndefOr[String] = js.native
    
    val okText: js.UndefOr[String | ReactElement] = js.native
    
    val onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    
    val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    val picker: js.UndefOr[js.Any] = js.native
    
    val pickerValueChangeProp: js.UndefOr[String] = js.native
    
    val pickerValueProp: js.UndefOr[String] = js.native
    
    val popupTransitionName: js.UndefOr[String] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val style: js.UndefOr[js.Any] = js.native
    
    val styles: js.UndefOr[js.Any] = js.native
    
    val title: js.UndefOr[String | ReactElement] = js.native
    
    val transitionName: js.UndefOr[String] = js.native
    
    val triggerType: js.UndefOr[String] = js.native
    
    val value: js.UndefOr[js.Any] = js.native
    
    val visible: js.UndefOr[Boolean] = js.native
    
    val wrapStyle: js.UndefOr[CSSProperties] = js.native
  }
  object ReadonlyIPopupPickerProps {
    
    @scala.inline
    def apply(): ReadonlyIPopupPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIPopupPickerProps]
    }
    
    @scala.inline
    implicit class ReadonlyIPopupPickerPropsMutableBuilder[Self <: ReadonlyIPopupPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      @scala.inline
      def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextReactElement(value: ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextReactElement(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      @scala.inline
      def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapComponent(value: js.Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-native.react-native.PickerProps> */
  @js.native
  trait ReadonlyPickerProps extends StObject {
    
    val accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
    
    val accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
    
    val accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
    
    val accessibilityHint: js.UndefOr[String] = js.native
    
    val accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
    
    val accessibilityLabel: js.UndefOr[String] = js.native
    
    val accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
    
    val accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
    
    val accessibilityState: js.UndefOr[AccessibilityState] = js.native
    
    val accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
    
    val accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
    
    val accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
    
    val accessible: js.UndefOr[Boolean] = js.native
    
    val collapsable: js.UndefOr[Boolean] = js.native
    
    val enabled: js.UndefOr[Boolean] = js.native
    
    val focusable: js.UndefOr[Boolean] = js.native
    
    val hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
    
    val hitSlop: js.UndefOr[Insets] = js.native
    
    val importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
    
    val isTVSelectable: js.UndefOr[Boolean] = js.native
    
    val itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    val mode: js.UndefOr[dialog | dropdown] = js.native
    
    val nativeID: js.UndefOr[String] = js.native
    
    val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
    
    val onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
    
    val onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
    
    val onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    val onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
    
    val onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    val onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
    
    val onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
    
    val onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
    
    val onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
    
    val onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
    
    val onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    val onValueChange: js.UndefOr[js.Function2[/* itemValue */ js.Any, /* itemPosition */ Double, Unit]] = js.native
    
    val pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
    
    val prompt: js.UndefOr[String] = js.native
    
    val removeClippedSubviews: js.UndefOr[Boolean] = js.native
    
    val renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
    
    val selectedValue: js.UndefOr[js.Any] = js.native
    
    val shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
    
    val style: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    val testID: js.UndefOr[String] = js.native
    
    val testId: js.UndefOr[String] = js.native
    
    val tvParallaxMagnification: js.UndefOr[Double] = js.native
    
    val tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
    
    val tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
    
    val tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
    
    val tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  }
  object ReadonlyPickerProps {
    
    @scala.inline
    def apply(): ReadonlyPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPickerProps]
    }
    
    @scala.inline
    implicit class ReadonlyPickerPropsMutableBuilder[Self <: ReadonlyPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      @scala.inline
      def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setMode(value: dialog | dropdown): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* itemValue */ js.Any, /* itemPosition */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      @scala.inline
      def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      @scala.inline
      def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
  @js.native
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactElement] with js.UndefOr[js.Any] = js.native
    
    val className: js.UndefOr[String] = js.native
    
    val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
    
    val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val rootNativeProps: js.UndefOr[js.Any] = js.native
    
    val selectedValue: js.UndefOr[js.Array[_]] = js.native
    
    val style: js.UndefOr[js.Any] = js.native
  }
  object ReadonlychildrenReactNode {
    
    @scala.inline
    def apply(children: js.UndefOr[ReactElement] with js.UndefOr[js.Any]): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.UndefOr[ReactElement] with js.UndefOr[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Array[_]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setSelectedValueVarargs(value: js.Any*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
  @js.native
  trait ReadonlychildrenReactNodeActionTextActiveOpacity extends StObject {
    
    val WrapComponent: js.UndefOr[js.Any] = js.native
    
    val actionTextActiveOpacity: js.UndefOr[Double] = js.native
    
    val actionTextUnderlayColor: js.UndefOr[String] = js.native
    
    val children: js.UndefOr[ReactElement] = js.native
    
    val className: js.UndefOr[String] = js.native
    
    val content: js.UndefOr[ReactElement | String] = js.native
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val dismissText: js.UndefOr[String | ReactElement] = js.native
    
    val maskTransitionName: js.UndefOr[String] = js.native
    
    val okText: js.UndefOr[String | ReactElement] = js.native
    
    val onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    
    val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    val picker: js.UndefOr[js.Any] = js.native
    
    val pickerValueChangeProp: js.UndefOr[String] = js.native
    
    val pickerValueProp: js.UndefOr[String] = js.native
    
    val popupTransitionName: js.UndefOr[String] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val style: js.UndefOr[js.Any] = js.native
    
    val styles: js.UndefOr[js.Any] = js.native
    
    val title: js.UndefOr[String | ReactElement] = js.native
    
    val transitionName: js.UndefOr[String] = js.native
    
    val triggerType: js.UndefOr[String] = js.native
    
    val value: js.UndefOr[js.Any] = js.native
    
    val visible: js.UndefOr[Boolean] = js.native
    
    val wrapStyle: js.UndefOr[CSSProperties] = js.native
  }
  object ReadonlychildrenReactNodeActionTextActiveOpacity {
    
    @scala.inline
    def apply(): ReadonlychildrenReactNodeActionTextActiveOpacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNodeActionTextActiveOpacity]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeActionTextActiveOpacityMutableBuilder[Self <: ReadonlychildrenReactNodeActionTextActiveOpacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      @scala.inline
      def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextReactElement(value: ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextReactElement(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      @scala.inline
      def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapComponent(value: js.Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
  @js.native
  trait ReadonlychildrenReactNodeChildren extends StObject {
    
    val children: js.UndefOr[ReactElement] = js.native
    
    val className: js.UndefOr[String] = js.native
    
    val defaultSelectedValue: js.UndefOr[js.Any] = js.native
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val indicatorClassName: js.UndefOr[String] = js.native
    
    val indicatorStyle: js.UndefOr[js.Any] = js.native
    
    val itemStyle: js.UndefOr[js.Any] = js.native
    
    val noAnimate: js.UndefOr[Boolean] = js.native
    
    val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val selectedValue: js.UndefOr[js.Any] = js.native
    
    val style: js.UndefOr[js.Any] = js.native
  }
  object ReadonlychildrenReactNodeChildren {
    
    @scala.inline
    def apply(): ReadonlychildrenReactNodeChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNodeChildren]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeChildrenMutableBuilder[Self <: ReadonlychildrenReactNodeChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
  @js.native
  trait Readonlydefault extends StObject {
    
    val children: js.UndefOr[js.Any] = js.native
    
    val className: js.UndefOr[String] = js.native
    
    val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
    
    val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val rootNativeProps: js.UndefOr[js.Any] = js.native
    
    val selectedValue: js.UndefOr[js.Array[_]] = js.native
    
    val style: js.UndefOr[js.Any] = js.native
  }
  object Readonlydefault {
    
    @scala.inline
    def apply(): Readonlydefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Readonlydefault]
    }
    
    @scala.inline
    implicit class ReadonlydefaultMutableBuilder[Self <: Readonlydefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Array[_]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setSelectedValueVarargs(value: js.Any*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
