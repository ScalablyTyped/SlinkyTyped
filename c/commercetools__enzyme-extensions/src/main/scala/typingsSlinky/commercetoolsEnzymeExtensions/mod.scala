package typingsSlinky.commercetoolsEnzymeExtensions

import org.scalablytyped.runtime.Instantiable1
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.EnzymeSelector
import typingsSlinky.enzyme.mod.ShallowWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commercetools/enzyme-extensions", JSImport.Namespace)
  @js.native
  def apply(
    s: Instantiable1[
      /* nodes */ js.Array[ReactElement], 
      ShallowWrapper[js.Object, js.Object, js.Object]
    ]
  ): Unit = js.native
  
  /* augmented module */
  object enzymeAugmentingMod {
    
    @js.native
    trait ShallowWrapper[P] extends StObject {
      
      def drill(
        expander: js.Function1[
              /* props */ js.Any, 
              typingsSlinky.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[js.Object]
            ]
      ): typingsSlinky.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
      
      def renderProp(propName: String, args: js.Any*): typingsSlinky.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
      
      def until(selector: EnzymeSelector): typingsSlinky.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
      def until(selector: EnzymeSelector, options: UntilOptions): typingsSlinky.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
    }
    
    @js.native
    trait UntilOptions extends StObject {
      
      var maxDepth: Double = js.native
    }
    object UntilOptions {
      
      @scala.inline
      def apply(maxDepth: Double): UntilOptions = {
        val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
        __obj.asInstanceOf[UntilOptions]
      }
      
      @scala.inline
      implicit class UntilOptionsMutableBuilder[Self <: UntilOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      }
    }
  }
}
