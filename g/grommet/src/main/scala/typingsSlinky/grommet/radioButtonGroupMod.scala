package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.Disabled
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonGroupMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RadioButtonGroup", "RadioButtonGroup")
  @js.native
  class RadioButtonGroup protected ()
    extends Component[
          RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/RadioButtonGroup", "RadioButtonGroup")
  @js.native
  val RadioButtonGroup: ReactComponentClass[
    RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait RadioButtonGroupProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.native
    
    var options: js.Array[String | Double | Boolean | Disabled] = js.native
    
    var value: js.UndefOr[String | Double | Boolean | js.Object] = js.native
  }
  object RadioButtonGroupProps {
    
    @scala.inline
    def apply(name: String, options: js.Array[String | Double | Boolean | Disabled]): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    @scala.inline
    implicit class RadioButtonGroupPropsMutableBuilder[Self <: RadioButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: /* event */ ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[String | Double | Boolean | Disabled]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (String | Double | Boolean | Disabled)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String | Double | Boolean | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
