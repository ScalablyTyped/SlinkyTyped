package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementOnLine
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The location on a line where a marker will be placed. The direction of the line is determined by the direction in which the line was digitized.
    */
  var relativeTo: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementOnLineRelativeTo * / any */ String
  ] = js.native
  
  /**
    * The distances from a specified location on a line that a marker will be placed.
    */
  var startPointOffset: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementOnLine: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine = js.native
}
object CIMMarkerPlacementOnLine {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine): CIMMarkerPlacementOnLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementOnLine]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementOnLineMutableBuilder[Self <: CIMMarkerPlacementOnLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelativeTo(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementOnLineRelativeTo * / any */ String
    ): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    @scala.inline
    def setStartPointOffset(value: Double): Self = StObject.set(x, "startPointOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPointOffsetUndefined: Self = StObject.set(x, "startPointOffset", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
