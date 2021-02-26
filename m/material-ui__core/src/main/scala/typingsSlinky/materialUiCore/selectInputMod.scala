package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.materialUiCore.anon.PartialMenuProps
import typingsSlinky.materialUiCore.anon.Value
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectInputProps] = js.native
  
  @js.native
  trait SelectInputProps extends StObject {
    
    var IconComponent: js.UndefOr[ReactType[_]] = js.native
    
    var MenuProps: js.UndefOr[PartialMenuProps] = js.native
    
    var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoWidth: Boolean = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Value, Unit]] = js.native
    
    var multiple: Boolean = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var native: Boolean = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[_]] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactElement, Unit]
      ] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[_]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var renderValue: js.UndefOr[
        js.Function1[
          /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]), 
          ReactElement
        ]
      ] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
    
    var variant: js.UndefOr[standard | outlined | filled] = js.native
  }
  object SelectInputProps {
    
    @scala.inline
    def apply(
      autoWidth: Boolean,
      multiple: Boolean,
      native: Boolean,
      value: String | Double | Boolean | (js.Array[String | Double | Boolean])
    ): SelectInputProps = {
      val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInputProps]
    }
    
    @scala.inline
    implicit class SelectInputPropsMutableBuilder[Self <: SelectInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIconComponent(value: ReactType[_]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* ref */ HTMLSelectElement | Value => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMenuProps(value: PartialMenuProps): Self = StObject.set(x, "MenuProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPropsUndefined: Self = StObject.set(x, "MenuProps", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[_] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactElement) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[_] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRenderValue(
        value: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => ReactElement
      ): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      @scala.inline
      def setSelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "SelectDisplayProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectDisplayPropsUndefined: Self = StObject.set(x, "SelectDisplayProps", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectInputMod.foo` */
  override def _to: ReactComponentClass[SelectInputProps] = default
}
