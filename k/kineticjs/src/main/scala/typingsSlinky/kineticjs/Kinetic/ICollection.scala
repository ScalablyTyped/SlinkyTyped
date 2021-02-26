package typingsSlinky.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollection extends StObject {
  
  @JSName("apply")
  def apply(method: js.Function, `val`: js.Any): js.Any = js.native
  
  def each(func: js.Function0[_]): js.Any = js.native
}
object ICollection {
  
  @scala.inline
  def apply(apply: (js.Function, js.Any) => js.Any, each: js.Function0[_] => js.Any): ICollection = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), each = js.Any.fromFunction1(each))
    __obj.asInstanceOf[ICollection]
  }
  
  @scala.inline
  implicit class ICollectionMutableBuilder[Self <: ICollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: (js.Function, js.Any) => js.Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEach(value: js.Function0[_] => js.Any): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
  }
}
