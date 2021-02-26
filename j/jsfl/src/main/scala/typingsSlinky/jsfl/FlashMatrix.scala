package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashMatrix extends StObject {
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var c: Double = js.native
  
  var d: Double = js.native
  
  var tx: Double = js.native
  
  var ty: Double = js.native
}
object FlashMatrix {
  
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): FlashMatrix = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashMatrix]
  }
  
  @scala.inline
  implicit class FlashMatrixMutableBuilder[Self <: FlashMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTy(value: Double): Self = StObject.set(x, "ty", value.asInstanceOf[js.Any])
  }
}
