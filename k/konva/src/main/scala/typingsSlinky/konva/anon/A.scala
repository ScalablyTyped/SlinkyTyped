package typingsSlinky.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A extends StObject {
  
  var a: Double = js.native
  
  var b: js.Any = js.native
  
  var g: js.Any = js.native
  
  var r: js.Any = js.native
}
object A {
  
  @scala.inline
  def apply(a: Double, b: js.Any, g: js.Any, r: js.Any): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  @scala.inline
  implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: js.Any): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: js.Any): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
