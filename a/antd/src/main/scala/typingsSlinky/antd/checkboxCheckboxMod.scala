package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CheckboxProps with RefAttributes[_]] = js.native
  
  @js.native
  trait AbstractCheckboxProps[T] extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ T, Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object AbstractCheckboxProps {
    
    @scala.inline
    def apply[T](): AbstractCheckboxProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractCheckboxProps[T]]
    }
    
    @scala.inline
    implicit class AbstractCheckboxPropsMutableBuilder[Self <: AbstractCheckboxProps[_], T] (val x: Self with AbstractCheckboxProps[T]) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
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
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CheckboxChangeEvent extends StObject {
    
    var nativeEvent: MouseEvent = js.native
    
    def preventDefault(): Unit = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: CheckboxChangeEventTarget = js.native
  }
  object CheckboxChangeEvent {
    
    @scala.inline
    def apply(
      nativeEvent: MouseEvent,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: CheckboxChangeEventTarget
    ): CheckboxChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxChangeEvent]
    }
    
    @scala.inline
    implicit class CheckboxChangeEventMutableBuilder[Self <: CheckboxChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: CheckboxChangeEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckboxChangeEventTarget extends CheckboxProps {
    
    @JSName("checked")
    var checked_CheckboxChangeEventTarget: Boolean = js.native
  }
  object CheckboxChangeEventTarget {
    
    @scala.inline
    def apply(checked: Boolean): CheckboxChangeEventTarget = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxChangeEventTarget]
    }
    
    @scala.inline
    implicit class CheckboxChangeEventTargetMutableBuilder[Self <: CheckboxChangeEventTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckboxProps extends AbstractCheckboxProps[CheckboxChangeEvent] {
    
    var indeterminate: js.UndefOr[Boolean] = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[CheckboxProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxCheckboxMod.foo` */
  override def _to: ForwardRefExoticComponent[CheckboxProps with RefAttributes[_]] = default
}
