package typingsSlinky.arangodb.anon

import typingsSlinky.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentThreshold extends StObject {
  
  var segmentThreshold: Double = js.native
  
  var threshold: Double = js.native
  
  var `type`: ArangoSearchViewConsolidationType = js.native
}
object SegmentThreshold {
  
  @scala.inline
  def apply(segmentThreshold: Double, threshold: Double, `type`: ArangoSearchViewConsolidationType): SegmentThreshold = {
    val __obj = js.Dynamic.literal(segmentThreshold = segmentThreshold.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentThreshold]
  }
  
  @scala.inline
  implicit class SegmentThresholdMutableBuilder[Self <: SegmentThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentThreshold(value: Double): Self = StObject.set(x, "segmentThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArangoSearchViewConsolidationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
