package typingsSlinky.grommet

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.grommet.anon.Fixed
import typingsSlinky.grommet.grommetStrings.icon
import typingsSlinky.grommet.grommetStrings.id
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.mask
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.name
import typingsSlinky.grommet.grommetStrings.onBlur
import typingsSlinky.grommet.grommetStrings.plain
import typingsSlinky.grommet.grommetStrings.reverse
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.value
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskedInputMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/MaskedInput", "MaskedInput")
  @js.native
  class MaskedInput protected ()
    extends Component[
          MaskedInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: MaskedInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ])) = this()
    def this(
      props: MaskedInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/MaskedInput", "MaskedInput")
  @js.native
  val MaskedInput: ReactComponentClass[
    MaskedInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | onBlur | plain | reverse | size | value
    ])
  ] = js.native
  
  @js.native
  trait MaskedInputProps extends StObject {
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[js.Array[Fixed]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[Element], _]] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object MaskedInputProps {
    
    @scala.inline
    def apply(): MaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    @scala.inline
    implicit class MaskedInputPropsMutableBuilder[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMask(value: js.Array[Fixed]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskVarargs(value: Fixed*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ SyntheticFocusEvent[Element] => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type MaskedInputType = MaskedInputProps with (Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    icon | id | mask | name | onBlur | plain | reverse | size | value
  ])
}
