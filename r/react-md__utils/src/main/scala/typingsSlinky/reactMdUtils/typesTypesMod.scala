package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactMdUtils.anon.Ref
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.`aria-label`
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.`aria-labelledby`
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
  type ClassNameCloneableChild[T] = ReactElement
  
  @js.native
  trait LabelA11y extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
  }
  object LabelA11y {
    
    @scala.inline
    def apply(): LabelA11y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelA11y]
    }
    
    @scala.inline
    implicit class LabelA11yMutableBuilder[Self <: LabelA11y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    }
  }
  
  type LabelRequiredForA11y[Props /* <: LabelA11y */] = RequireAtLeastOne[Props, `aria-label` | `aria-labelledby`]
  
  type Maybe[T, NotFound] = T | NotFound
  
  type PropsWithRef[P /* <: js.Object */, E /* <: HTMLElement */] = P with Ref[E]
  
  type RequireAtLeastOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
}
