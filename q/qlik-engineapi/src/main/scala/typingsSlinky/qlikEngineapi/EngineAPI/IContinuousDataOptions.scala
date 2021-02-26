package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait IContinuousDataOptions extends StObject {
  
  /**
    * End value.
    */
  var qEnd: Double = js.native
  
  /**
    * Maximum number of ticks.
    */
  var qMaxNbrTicks: Double = js.native
  
  /**
    * Number of bins for binning.
    */
  var qNbrPoints: Double = js.native
  
  /**
    * Start value.
    */
  var qStart: Double = js.native
}
object IContinuousDataOptions {
  
  @scala.inline
  def apply(qEnd: Double, qMaxNbrTicks: Double, qNbrPoints: Double, qStart: Double): IContinuousDataOptions = {
    val __obj = js.Dynamic.literal(qEnd = qEnd.asInstanceOf[js.Any], qMaxNbrTicks = qMaxNbrTicks.asInstanceOf[js.Any], qNbrPoints = qNbrPoints.asInstanceOf[js.Any], qStart = qStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContinuousDataOptions]
  }
  
  @scala.inline
  implicit class IContinuousDataOptionsMutableBuilder[Self <: IContinuousDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQEnd(value: Double): Self = StObject.set(x, "qEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMaxNbrTicks(value: Double): Self = StObject.set(x, "qMaxNbrTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNbrPoints(value: Double): Self = StObject.set(x, "qNbrPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStart(value: Double): Self = StObject.set(x, "qStart", value.asInstanceOf[js.Any])
  }
}
