package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoDataPrimitive extends StObject {
  
  /** The number of vertex points used to define the polygon. */
  var NumPoints: String = js.native
  
  /** A unique ID associated with this polygon primitive. */
  var PrimitiveID: String = js.native
  
  /**
    * A comma-delimited sequence starting with the version number of the polygon set followed by a list of compressed polygon
    * "rings" (closed paths represented by sequences of latitude and-longitude points).
    */
  var Shape: String = js.native
  
  /**
    * An ID identifying the data provider that supplied the data. This ID number will reference one of the sources listed in the
    * array of CopyrightSources in the Copyright property of the GeoDataResultSet object.
    */
  var SourceID: String = js.native
}
object IGeoDataPrimitive {
  
  @scala.inline
  def apply(NumPoints: String, PrimitiveID: String, Shape: String, SourceID: String): IGeoDataPrimitive = {
    val __obj = js.Dynamic.literal(NumPoints = NumPoints.asInstanceOf[js.Any], PrimitiveID = PrimitiveID.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoDataPrimitive]
  }
  
  @scala.inline
  implicit class IGeoDataPrimitiveMutableBuilder[Self <: IGeoDataPrimitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumPoints(value: String): Self = StObject.set(x, "NumPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveID(value: String): Self = StObject.set(x, "PrimitiveID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceID(value: String): Self = StObject.set(x, "SourceID", value.asInstanceOf[js.Any])
  }
}
