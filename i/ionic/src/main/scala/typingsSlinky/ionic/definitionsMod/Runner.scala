package typingsSlinky.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Runner[T /* <: js.Object */, U] extends StObject {
  
  def run(options: T): js.Promise[U] = js.native
}
object Runner {
  
  @scala.inline
  def apply[T /* <: js.Object */, U](run: T => js.Promise[U]): Runner[T, U] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Runner[T, U]]
  }
  
  @scala.inline
  implicit class RunnerMutableBuilder[Self <: Runner[_, _], T /* <: js.Object */, U] (val x: Self with (Runner[T, U])) extends AnyVal {
    
    @scala.inline
    def setRun(value: T => js.Promise[U]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
