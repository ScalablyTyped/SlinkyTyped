package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.baseui.anon.CloseListbox
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxMod {
  
  @JSImport("baseui/combobox", "Combobox")
  @js.native
  val Combobox: ReactComponentClass[PropsT[js.Any]] = js.native
  
  @js.native
  trait SIZE extends StObject {
    
    var default: default_ = js.native
    
    var compact: typingsSlinky.baseui.baseuiStrings.compact = js.native
    
    var large: large_ = js.native
    
    var mini: typingsSlinky.baseui.baseuiStrings.mini = js.native
  }
  object SIZE {
    
    @JSImport("baseui/combobox", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComboboxOverrides extends StObject {
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var InputContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var ListBox: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var ListItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Popover: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object ComboboxOverrides {
    
    @scala.inline
    def apply(): ComboboxOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxOverrides]
    }
    
    @scala.inline
    implicit class ComboboxOverridesMutableBuilder[Self <: ComboboxOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setListBox(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ListBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListBoxUndefined: Self = StObject.set(x, "ListBox", js.undefined)
      
      @scala.inline
      def setListItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
      
      @scala.inline
      def setPopover(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverUndefined: Self = StObject.set(x, "Popover", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait PropsT[OptionT] extends StObject {
    
    var autocomplete: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var mapOptionToNode: js.UndefOr[js.Function1[/* hasIsSelectedOption */ js.Any, ReactElement]] = js.native
    
    def mapOptionToString(OptionT: js.Any): String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLInputElement], _]] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* value */ String, /* option */ OptionT | Null, _]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLInputElement], _]] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* params */ CloseListbox, _]] = js.native
    
    var options: OptionT = js.native
    
    var overrides: js.UndefOr[ComboboxOverrides] = js.native
    
    var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
    
    var value: String = js.native
  }
  object PropsT {
    
    @scala.inline
    def apply[OptionT](mapOptionToString: js.Any => String, options: OptionT, value: String): PropsT[OptionT] = {
      val __obj = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsT[OptionT]]
    }
    
    @scala.inline
    implicit class PropsTMutableBuilder[Self <: PropsT[_], OptionT] (val x: Self with PropsT[OptionT]) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMapOptionToNode(value: /* hasIsSelectedOption */ js.Any => ReactElement): Self = StObject.set(x, "mapOptionToNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapOptionToNodeUndefined: Self = StObject.set(x, "mapOptionToNode", js.undefined)
      
      @scala.inline
      def setMapOptionToString(value: js.Any => String): Self = StObject.set(x, "mapOptionToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* option */ OptionT | Null) => _): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => _): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* params */ CloseListbox => _): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionT): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: ComboboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
