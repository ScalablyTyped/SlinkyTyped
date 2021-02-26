package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectInfo extends StObject {
  
  var qMeasure: String = js.native
  
  var qRangeHi: Double = js.native
  
  var qRangeLo: Double = js.native
}
object RangeSelectInfo {
  
  @scala.inline
  def apply(qMeasure: String, qRangeHi: Double, qRangeLo: Double): RangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasure = qMeasure.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectInfo]
  }
  
  @scala.inline
  implicit class RangeSelectInfoMutableBuilder[Self <: RangeSelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQMeasure(value: String): Self = StObject.set(x, "qMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeHi(value: Double): Self = StObject.set(x, "qRangeHi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeLo(value: Double): Self = StObject.set(x, "qRangeLo", value.asInstanceOf[js.Any])
  }
}
