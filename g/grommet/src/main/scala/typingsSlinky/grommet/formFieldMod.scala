package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.Message
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.grommet.utilsMod.PlaceHolderType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/FormField", "FormField")
  @js.native
  class FormField protected ()
    extends Component[
          FormFieldProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: FormFieldProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ])) = this()
    def this(
      props: FormFieldProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/FormField", "FormField")
  @js.native
  val FormField: ReactComponentClass[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ])
  ] = js.native
  
  @js.native
  trait FormFieldProps extends StObject {
    
    var component: js.UndefOr[js.Any] = js.native
    
    var contentProps: js.UndefOr[BoxProps] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[String | ReactElement] = js.native
    
    var help: js.UndefOr[String | ReactElement] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[String | ReactElement] = js.native
    
    var label: js.UndefOr[String | ReactElement] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[js.Array[String]] = js.native
    
    var pad: js.UndefOr[Boolean] = js.native
    
    // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
    var placeholder: js.UndefOr[PlaceHolderType] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[
        Message | (js.Function1[/* repeated */ js.Any, _]) | (js.Array[Message | (js.Function1[/* repeated */ _, _])])
      ] = js.native
  }
  object FormFieldProps {
    
    @scala.inline
    def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    @scala.inline
    implicit class FormFieldPropsMutableBuilder[Self <: FormFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setContentProps(value: BoxProps): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: String | ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReactElement(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHelp(value: String | ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpReactElement(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setInfo(value: String | ReactElement): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoReactElement(value: ReactElement): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLabel(value: String | ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderReactElement(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setValidate(
        value: Message | (js.Function1[/* repeated */ js.Any, _]) | (js.Array[Message | (js.Function1[/* repeated */ _, _])])
      ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValidateVarargs(value: (Message | (js.Function1[js.Any, js.Any]))*): Self = StObject.set(x, "validate", js.Array(value :_*))
    }
  }
}
