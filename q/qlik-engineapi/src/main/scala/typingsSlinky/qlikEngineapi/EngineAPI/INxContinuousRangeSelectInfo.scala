package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxContinuousRangeSelectInfo with extends of RangeSelectInfo
  */
@js.native
trait INxContinuousRangeSelectInfo extends IRangeSelectInfo {
  
  /**
    * Dimension index.
    */
  var qDimIx: Double = js.native
}
object INxContinuousRangeSelectInfo {
  
  @scala.inline
  def apply(qDimIx: Double, qRange: IRange): INxContinuousRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qDimIx = qDimIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContinuousRangeSelectInfo]
  }
  
  @scala.inline
  implicit class INxContinuousRangeSelectInfoMutableBuilder[Self <: INxContinuousRangeSelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDimIx(value: Double): Self = StObject.set(x, "qDimIx", value.asInstanceOf[js.Any])
  }
}
