package typingsSlinky.es6Collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForEachable[T] extends StObject {
  
  def forEach(callbackfn: js.Function1[/* value */ T, Unit]): Unit = js.native
}
object ForEachable {
  
  @scala.inline
  def apply[T](forEach: js.Function1[/* value */ T, Unit] => Unit): ForEachable[T] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEachable[T]]
  }
  
  @scala.inline
  implicit class ForEachableMutableBuilder[Self <: ForEachable[_], T] (val x: Self with ForEachable[T]) extends AnyVal {
    
    @scala.inline
    def setForEach(value: js.Function1[/* value */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
