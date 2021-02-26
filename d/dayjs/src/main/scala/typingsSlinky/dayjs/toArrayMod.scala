package typingsSlinky.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toArrayMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/toArray", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `toArrayMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def toArray(): js.Array[Double] = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(toArray: () => js.Array[Double]): Dayjs = {
        val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToArray(value: () => js.Array[Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      }
    }
  }
}
