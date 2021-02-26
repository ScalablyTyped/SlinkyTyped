package typingsSlinky.assertEqualJsx

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assert-equal-jsx", JSImport.Namespace)
  @js.native
  def apply(actual: ReactElement, expected: ReactElement): Unit = js.native
  @JSImport("assert-equal-jsx", JSImport.Namespace)
  @js.native
  def apply(actual: ReactElement, expected: ReactElement, opts: AsssertOptions): Unit = js.native
  
  @js.native
  trait AsssertOptions extends StObject {
    
    var sanitize: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  }
  object AsssertOptions {
    
    @scala.inline
    def apply(): AsssertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsssertOptions]
    }
    
    @scala.inline
    implicit class AsssertOptionsMutableBuilder[Self <: AsssertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSanitize(value: /* str */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    }
  }
}
