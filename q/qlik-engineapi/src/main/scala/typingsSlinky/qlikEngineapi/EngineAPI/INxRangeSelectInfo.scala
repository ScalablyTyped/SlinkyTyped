package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxRangeSelectInfo with extends of RangeSelectInfo
  */
@js.native
trait INxRangeSelectInfo extends IRangeSelectInfo {
  
  /**
    * Number of the measure to select.
    * Numbering starts from 0.
    */
  var qMeasureIx: Double = js.native
}
object INxRangeSelectInfo {
  
  @scala.inline
  def apply(qMeasureIx: Double, qRange: IRange): INxRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasureIx = qMeasureIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxRangeSelectInfo]
  }
  
  @scala.inline
  implicit class INxRangeSelectInfoMutableBuilder[Self <: INxRangeSelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQMeasureIx(value: Double): Self = StObject.set(x, "qMeasureIx", value.asInstanceOf[js.Any])
  }
}
