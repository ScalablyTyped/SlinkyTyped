package typingsSlinky.iitc

import typingsSlinky.leaflet.mod.CircleMarkerOptions
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iitc", "DataCache")
  @js.native
  class DataCache ()
    extends typingsSlinky.iitc.dataCacheMod.DataCache
  
  object IITC {
    
    /** Field-Polygon */
    @JSImport("iitc", "IITC.Field")
    @js.native
    class Field protected ()
      extends typingsSlinky.iitc.iitctypesMod.IITC.Field {
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
    }
    
    /** Link-Marker */
    @JSImport("iitc", "IITC.Link")
    @js.native
    class Link protected ()
      extends typingsSlinky.iitc.iitctypesMod.IITC.Link {
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
    }
    
    /** Portal-Marker */
    @JSImport("iitc", "IITC.Portal")
    @js.native
    class Portal protected ()
      extends typingsSlinky.iitc.iitctypesMod.IITC.Portal {
      def this(latlng: LatLngExpression) = this()
      def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
    }
  }
  
  @JSImport("iitc", "MapDataRequest")
  @js.native
  class MapDataRequest ()
    extends typingsSlinky.iitc.mapDataRequestMod.MapDataRequest
  
  @JSImport("iitc", "Render")
  @js.native
  class Render ()
    extends typingsSlinky.iitc.mapDataRenderMod.Render
  
  @JSImport("iitc", "RenderDebugTiles")
  @js.native
  class RenderDebugTiles ()
    extends typingsSlinky.iitc.mapDataDebugMod.RenderDebugTiles
}
