package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAtRatioPositions
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The distance from the beginning of a line that the marker will be placed.
    */
  var beginPosition: js.UndefOr[Double] = js.native
  
  /**
    * The distance from the end of a line that the marker will be placed. The ending of a line is determined by the direction in which the line was digitized.
    */
  var endPosition: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether only the first marker will be rotated 180 degrees.
    */
  var flipFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * The array of positions.
    */
  var positionArray: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAtRatioPositions: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions = js.native
}
object CIMMarkerPlacementAtRatioPositions {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions): CIMMarkerPlacementAtRatioPositions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAtRatioPositions]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAtRatioPositionsMutableBuilder[Self <: CIMMarkerPlacementAtRatioPositions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginPosition(value: Double): Self = StObject.set(x, "beginPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginPositionUndefined: Self = StObject.set(x, "beginPosition", js.undefined)
    
    @scala.inline
    def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    @scala.inline
    def setFlipFirst(value: Boolean): Self = StObject.set(x, "flipFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipFirstUndefined: Self = StObject.set(x, "flipFirst", js.undefined)
    
    @scala.inline
    def setPositionArray(value: js.Array[Double]): Self = StObject.set(x, "positionArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionArrayUndefined: Self = StObject.set(x, "positionArray", js.undefined)
    
    @scala.inline
    def setPositionArrayVarargs(value: Double*): Self = StObject.set(x, "positionArray", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
