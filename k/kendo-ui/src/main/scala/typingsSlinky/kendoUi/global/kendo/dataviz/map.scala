package typingsSlinky.kendoUi.global.kendo.dataviz

import typingsSlinky.kendoUi.kendo.dataviz.map.BingLayerOptions
import typingsSlinky.kendoUi.kendo.dataviz.map.LayerOptions
import typingsSlinky.kendoUi.kendo.dataviz.map.MarkerLayerOptions
import typingsSlinky.kendoUi.kendo.dataviz.map.MarkerOptions
import typingsSlinky.kendoUi.kendo.dataviz.map.ShapeLayerOptions
import typingsSlinky.kendoUi.kendo.dataviz.map.TileLayerOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object map {
  
  @JSGlobal("kendo.dataviz.map.BingLayer")
  @js.native
  class BingLayer protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.BingLayer {
    def this(map: Map) = this()
    def this(map: Map, options: BingLayerOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.map.Extent")
  @js.native
  class Extent protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.Extent {
    def this(nw: js.Any, se: js.Any) = this()
    def this(nw: js.Any, se: typingsSlinky.kendoUi.kendo.dataviz.map.Location) = this()
    def this(nw: typingsSlinky.kendoUi.kendo.dataviz.map.Location, se: js.Any) = this()
    def this(
      nw: typingsSlinky.kendoUi.kendo.dataviz.map.Location,
      se: typingsSlinky.kendoUi.kendo.dataviz.map.Location
    ) = this()
  }
  object Extent {
    
    /* static member */
    @JSGlobal("kendo.dataviz.map.Extent.create")
    @js.native
    def create(a: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
    @JSGlobal("kendo.dataviz.map.Extent.create")
    @js.native
    def create(a: js.Any, b: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
    @JSGlobal("kendo.dataviz.map.Extent.create")
    @js.native
    def create(a: js.Any, b: typingsSlinky.kendoUi.kendo.dataviz.map.Location): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.map.Extent.create")
    @js.native
    def create(a: typingsSlinky.kendoUi.kendo.dataviz.map.Location): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
    @JSGlobal("kendo.dataviz.map.Extent.create")
    @js.native
    def create(a: typingsSlinky.kendoUi.kendo.dataviz.map.Location, b: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
    @JSGlobal("kendo.dataviz.map.Extent.create")
    @js.native
    def create(
      a: typingsSlinky.kendoUi.kendo.dataviz.map.Location,
      b: typingsSlinky.kendoUi.kendo.dataviz.map.Location
    ): typingsSlinky.kendoUi.kendo.dataviz.map.Extent = js.native
  }
  
  @JSGlobal("kendo.dataviz.map.Layer")
  @js.native
  class Layer_ protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.Layer_ {
    def this(map: Map) = this()
    def this(map: Map, options: LayerOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.map.Location")
  @js.native
  class Location protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.Location {
    def this(lat: Double, lng: Double) = this()
  }
  object Location {
    
    /* static member */
    @JSGlobal("kendo.dataviz.map.Location.create")
    @js.native
    def create(lat: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    @JSGlobal("kendo.dataviz.map.Location.create")
    @js.native
    def create(lat: js.Any, lng: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.map.Location.create")
    @js.native
    def create(lat: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    @JSGlobal("kendo.dataviz.map.Location.create")
    @js.native
    def create(lat: Double, lng: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.map.Location.create")
    @js.native
    def create(lat: typingsSlinky.kendoUi.kendo.dataviz.map.Location): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    @JSGlobal("kendo.dataviz.map.Location.create")
    @js.native
    def create(lat: typingsSlinky.kendoUi.kendo.dataviz.map.Location, lng: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.map.Location.fromLatLng")
    @js.native
    def fromLatLng(lnglat: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.map.Location.fromLngLat")
    @js.native
    def fromLngLat(lnglat: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  }
  
  @JSGlobal("kendo.dataviz.map.Marker")
  @js.native
  class Marker ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.Marker {
    def this(options: MarkerOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.map.MarkerLayer")
  @js.native
  class MarkerLayer protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.MarkerLayer {
    def this(map: Map) = this()
    def this(map: Map, options: MarkerLayerOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.map.ShapeLayer")
  @js.native
  class ShapeLayer protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.ShapeLayer {
    def this(map: Map) = this()
    def this(map: Map, options: ShapeLayerOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.map.TileLayer")
  @js.native
  class TileLayer protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.map.TileLayer {
    def this(map: Map) = this()
    def this(map: Map, options: TileLayerOptions) = this()
  }
  
  object layer {
    
    @JSGlobal("kendo.dataviz.map.layer.Shape")
    @js.native
    class Shape ()
      extends typingsSlinky.kendoUi.kendo.dataviz.map.layer.Shape
  }
}
