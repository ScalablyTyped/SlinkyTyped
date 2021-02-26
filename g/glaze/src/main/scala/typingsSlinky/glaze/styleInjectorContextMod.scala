package typingsSlinky.glaze

import slinky.core.facade.ReactElement
import typingsSlinky.glaze.styleInjectorMod.StyleInjector
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleInjectorContextMod {
  
  @JSImport("glaze/dist-types/StyleInjectorContext", "StyleInjectorContext")
  @js.native
  val StyleInjectorContext: Context[StyleInjector] = js.native
  
  @JSImport("glaze/dist-types/StyleInjectorContext", "StyleInjectorProvider")
  @js.native
  def StyleInjectorProvider(hasChildrenInjector: StyleInjectorProviderProps): ReactElement = js.native
  
  @js.native
  trait StyleInjectorProviderProps extends StObject {
    
    var children: ReactElement = js.native
    
    var injector: js.UndefOr[StyleInjector] = js.native
  }
  object StyleInjectorProviderProps {
    
    @scala.inline
    def apply(): StyleInjectorProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleInjectorProviderProps]
    }
    
    @scala.inline
    implicit class StyleInjectorProviderPropsMutableBuilder[Self <: StyleInjectorProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInjector(value: StyleInjector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    }
  }
}
