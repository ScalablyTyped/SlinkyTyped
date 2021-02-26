package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.SelectHTMLAttributes
import typingsSlinky.reactMdForm.textFieldContainerMod.TextFieldContainerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectMod {
  
  @JSImport("@react-md/form/types/select/NativeSelect", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  
  @js.native
  trait NativeSelectProps
    extends SelectHTMLAttributes[HTMLSelectElement]
       with TextFieldContainerOptions {
    
    /**
      * An optional ref to apply to the text field's container div element. The
      * default ref is forwarded on to the `input` element.
      */
    var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * The default value for the text field which will make it uncontrolled. If
      * you manually change the `defaultValue` prop, the input's value **will not
      * change** unless you provide a different `key` as well. Use the `value` prop
      * instead for a controlled input.
      *
      * If the `multiple` prop is enabled, this **must** be a list of strings.
      */
    @JSName("defaultValue")
    var defaultValue_NativeSelectProps: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * An optional icon to display to the right of the select. This should
      * normally be a dropdown icon to replace the native select's dropdown icon.
      * If this is set to `null`, the native select's dropdown icon will be
      * displayed instead.
      *
      * This defaults to the `IconProvider`'s dropdown icon from the
      * `@react-md/icon` package.
      */
    var icon: js.UndefOr[ReactElement] = js.native
    
    /**
      * The id for the select. This is required for accessibility.
      */
    @JSName("id")
    var id_NativeSelectProps: String = js.native
    
    /**
      * An optional floating label to use for the text field. This should really
      * only be used when the `theme` prop is not set to `"none"`. This will be
      * wrapped in the `<Label>` component itself and automatically apply the
      * `htmlFor` prop for this text field.
      */
    var label: js.UndefOr[ReactElement] = js.native
    
    /**
      * An optional className to apply to the label wrapper.
      */
    var labelClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional style to apply to the label wrapper.
      */
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * An optional className to apply to the select itself. The `className` prop
      * will be applied to the container `<div>` instead.
      */
    var selectClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional style to apply to the select itself. The `style` prop will be
      * applied to the container `<div>` instead.
      */
    var selectStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * The value to use for the text field. This will make the component
      * controlled and require the `onChange` prop to be provided as well otherwise
      * this will act as a read only text field.
      *
      * If the `multiple` prop is enabled, this **must** be a list of strings.
      */
    @JSName("value")
    var value_NativeSelectProps: js.UndefOr[String | js.Array[String]] = js.native
  }
  object NativeSelectProps {
    
    @scala.inline
    def apply(id: String): NativeSelectProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSelectProps]
    }
    
    @scala.inline
    implicit class NativeSelectPropsMutableBuilder[Self <: NativeSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "containerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      @scala.inline
      def setContainerRefRefObject(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassNameUndefined: Self = StObject.set(x, "labelClassName", js.undefined)
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSelectClassName(value: String): Self = StObject.set(x, "selectClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectClassNameUndefined: Self = StObject.set(x, "selectClassName", js.undefined)
      
      @scala.inline
      def setSelectStyle(value: CSSProperties): Self = StObject.set(x, "selectStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectStyleUndefined: Self = StObject.set(x, "selectStyle", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
