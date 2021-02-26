package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLLabelElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.labelLabelMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingLabelMod {
  
  @JSImport("@react-md/form/types/label/FloatingLabel", "FloatingLabel")
  @js.native
  val FloatingLabel: ForwardRefExoticComponent[FloatingLabelProps with RefAttributes[HTMLLabelElement]] = js.native
  
  @js.native
  trait FloatingLabelProps extends LabelProps {
    
    /**
      * Boolean if it should use the dense spec.
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the label is currently floating over the text field.
      */
    var floating: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the text input or textarea currently have a value.
      */
    var valued: Boolean = js.native
  }
  object FloatingLabelProps {
    
    @scala.inline
    def apply(htmlFor: String, valued: Boolean): FloatingLabelProps = {
      val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any], valued = valued.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingLabelProps]
    }
    
    @scala.inline
    implicit class FloatingLabelPropsMutableBuilder[Self <: FloatingLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      @scala.inline
      def setValued(value: Boolean): Self = StObject.set(x, "valued", value.asInstanceOf[js.Any])
    }
  }
}
