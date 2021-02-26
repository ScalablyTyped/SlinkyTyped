package typingsSlinky.materialUiCore

import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.EnzymeSelector
import typingsSlinky.materialUiCore.anon.Fn1
import typingsSlinky.materialUiCore.anon.PartialShallowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createShallowMod {
  
  @JSImport("@material-ui/core/test-utils/createShallow", JSImport.Default)
  @js.native
  def default(): Fn1 = js.native
  @JSImport("@material-ui/core/test-utils/createShallow", JSImport.Default)
  @js.native
  def default(options: PartialShallowOptions): Fn1 = js.native
  
  @js.native
  trait ShallowOptions extends StObject {
    
    var dive: Boolean = js.native
    
    var shallow: Fn1 = js.native
    
    var untilSelector: EnzymeSelector = js.native
  }
  object ShallowOptions {
    
    @scala.inline
    def apply(dive: Boolean, shallow: Fn1, untilSelector: EnzymeSelector): ShallowOptions = {
      val __obj = js.Dynamic.literal(dive = dive.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], untilSelector = untilSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShallowOptions]
    }
    
    @scala.inline
    implicit class ShallowOptionsMutableBuilder[Self <: ShallowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDive(value: Boolean): Self = StObject.set(x, "dive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShallow(value: Fn1): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilSelector(value: EnzymeSelector): Self = StObject.set(x, "untilSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilSelectorFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => ReactElement | Null): Self = StObject.set(x, "untilSelector", js.Any.fromFunction2(value))
    }
  }
}
