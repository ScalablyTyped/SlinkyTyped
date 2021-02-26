package typingsSlinky.reactMdTypography

import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTypography.textMod.TextElement
import typingsSlinky.reactMdTypography.textMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srOnlyMod {
  
  @JSImport("@react-md/typography/types/SrOnly", "SrOnly")
  @js.native
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps with RefAttributes[TextElement]] = js.native
  
  @js.native
  trait SrOnlyProps extends TextProps {
    
    /**
      * Boolean if the text should become visible when focused. If this prop is
      * enabled and the `tabIndex` prop is `undefined`, the `tabIndex` will be
      * updated to be `0`.
      */
    var focusable: js.UndefOr[Boolean] = js.native
  }
  object SrOnlyProps {
    
    @scala.inline
    def apply(): SrOnlyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SrOnlyProps]
    }
    
    @scala.inline
    implicit class SrOnlyPropsMutableBuilder[Self <: SrOnlyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    }
  }
}
