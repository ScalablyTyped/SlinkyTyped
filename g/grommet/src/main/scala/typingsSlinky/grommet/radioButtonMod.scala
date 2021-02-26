package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RadioButton", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends Component[
          RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])) = this()
    def this(
      props: RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/RadioButton", "RadioButton")
  @js.native
  val RadioButton: ReactComponentClass[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  @js.native
  trait RadioButtonProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var name: String = js.native
  }
  object RadioButtonProps {
    
    @scala.inline
    def apply(name: String): RadioButtonProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    @scala.inline
    implicit class RadioButtonPropsMutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
