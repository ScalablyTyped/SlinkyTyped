package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.anon.ColorsComponents
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.anon.Disabled
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.radio
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[RadioGroupProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/RadioGroup", "default.Button")
    @js.native
    def Button: RadioButton = js.native
    @scala.inline
    def Button_=(x: RadioButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/RadioGroup", "default.Radio")
    @js.native
    def Radio: typingsSlinky.cathoQuantum.radioGroupMod.Radio = js.native
    @scala.inline
    def Radio_=(x: Radio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Radio")(x.asInstanceOf[js.Any])
  }
  
  type Radio = ReactComponentClass[RadioProps]
  
  type RadioButton = ReactComponentClass[RadioButtonProps]
  
  @js.native
  trait RadioButtonProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
    
    var skin: js.UndefOr[neutral | primary | success | warning | error] = js.native
    
    var theme: js.UndefOr[ColorsComponents] = js.native
    
    var value: String = js.native
  }
  object RadioButtonProps {
    
    @scala.inline
    def apply(value: String): RadioButtonProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    @scala.inline
    implicit class RadioButtonPropsMutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTheme(value: ColorsComponents): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioGroup = ReactComponentClass[RadioGroupProps]
  
  @js.native
  trait RadioGroupProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var options: js.UndefOr[js.Array[Disabled]] = js.native
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
    
    var theme: js.UndefOr[ColorsSpacing] = js.native
    
    var `type`: js.UndefOr[radio | button] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object RadioGroupProps {
    
    @scala.inline
    def apply(name: String): RadioGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    @scala.inline
    implicit class RadioGroupPropsMutableBuilder[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Disabled]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Disabled*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: ColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: radio | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RadioProps extends StObject {
    
    var children: js.UndefOr[String | js.Array[ReactElement] | ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var theme: js.UndefOr[ColorsSpacing] = js.native
    
    var value: String = js.native
  }
  object RadioProps {
    
    @scala.inline
    def apply(value: String): RadioProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String | js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setTheme(value: ColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
