package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayContaining[T]
  extends AsymmetricMatcher[js.Any] {
  
  var `new`: js.UndefOr[js.Function1[/* sample */ ArrayLike[T], ArrayLike[T]]] = js.native
}
object ArrayContaining {
  
  @scala.inline
  def apply[T](asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean): ArrayContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[ArrayContaining[T]]
  }
  
  @scala.inline
  implicit class ArrayContainingMutableBuilder[Self <: ArrayContaining[_], T] (val x: Self with ArrayContaining[T]) extends AnyVal {
    
    @scala.inline
    def setNew(value: /* sample */ ArrayLike[T] => ArrayLike[T]): Self = StObject.set(x, "new", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
  }
}
