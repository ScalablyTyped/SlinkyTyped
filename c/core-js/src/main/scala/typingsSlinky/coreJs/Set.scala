package typingsSlinky.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[T] extends StObject {
  
  def toJSON(): js.Any = js.native
}
object Set {
  
  @scala.inline
  def apply[T](toJSON: () => js.Any): Set[T] = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Set[T]]
  }
  
  @scala.inline
  implicit class SetMutableBuilder[Self <: Set[_], T] (val x: Self with Set[T]) extends AnyVal {
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
