package typingsSlinky.cannon.CANNON

import typingsSlinky.cannon.anon.Keys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TupleDictionary extends StObject {
  
  var data: Keys = js.native
  
  def get(i: Double, j: Double): Double = js.native
  
  def reset(): Unit = js.native
  
  def set(i: Double, j: Double, value: Double): Unit = js.native
}
object TupleDictionary {
  
  @scala.inline
  def apply(
    data: Keys,
    get: (Double, Double) => Double,
    reset: () => Unit,
    set: (Double, Double, Double) => Unit
  ): TupleDictionary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[TupleDictionary]
  }
  
  @scala.inline
  implicit class TupleDictionaryMutableBuilder[Self <: TupleDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Keys): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
  }
}
