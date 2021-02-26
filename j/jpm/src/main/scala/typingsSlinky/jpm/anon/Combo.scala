package typingsSlinky.jpm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Combo extends StObject {
  
  var combo: String = js.native
  
  def onPress(): Unit = js.native
}
object Combo {
  
  @scala.inline
  def apply(combo: String, onPress: () => Unit): Combo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Combo]
  }
  
  @scala.inline
  implicit class ComboMutableBuilder[Self <: Combo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
  }
}
