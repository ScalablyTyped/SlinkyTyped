package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseTask extends StObject {
  
  def gen(): js.Promise[_] = js.native
  
  var name: String = js.native
}
object PromiseTask {
  
  @scala.inline
  def apply(gen: () => js.Promise[_], name: String): PromiseTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTask]
  }
  
  @scala.inline
  implicit class PromiseTaskMutableBuilder[Self <: PromiseTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGen(value: () => js.Promise[_]): Self = StObject.set(x, "gen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
