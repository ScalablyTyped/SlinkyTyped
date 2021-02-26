package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxSimpleDimValue extends StObject {
  
  var qElemNo: Double = js.native
  
  var qText: String = js.native
}
object NxSimpleDimValue {
  
  @scala.inline
  def apply(qElemNo: Double, qText: String): NxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxSimpleDimValue]
  }
  
  @scala.inline
  implicit class NxSimpleDimValueMutableBuilder[Self <: NxSimpleDimValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
