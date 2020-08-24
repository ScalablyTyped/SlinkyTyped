package typingsSlinky.heremaps.global.H.map

import typingsSlinky.heremaps.H.clustering.Provider
import typingsSlinky.heremaps.H.map.layer.ITileLayer.Options
import typingsSlinky.heremaps.H.map.provider.MarkerTileProvider
import typingsSlinky.heremaps.H.map.provider.ObjectProvider
import typingsSlinky.heremaps.H.map.provider.TileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.map.layer")
@js.native
object layer extends js.Object {
  /**
    * BaseTileLayer encapsulates funcitonailty that is common to all layers that deliver tiles, such as H.map.layer.TileLayer. The functionality includes geo bounding box to grid
    * calculation, tile request management.
    */
  @js.native
  class BaseTileLayer protected ()
    extends typingsSlinky.heremaps.H.map.layer.BaseTileLayer {
    /**
      * Constructor
      * @param provider {H.map.provider.TileProvider} - data source for the TileLayer
      * @param opt_options {H.map.layer.ITileLayer.Options=} - additional options
      */
    def this(provider: TileProvider) = this()
    def this(provider: TileProvider, opt_options: Options) = this()
  }
  
  /**
    * The Layer class represents an object that is evaluated by the renderer in the order in which it is added to the layers collection. It provides the basic infrastructure for dispatching
    * update events to the renderer in case new data is available.
    */
  @js.native
  /**
    * Constructor
    * @param opt_options {H.map.layer.Layer.Options=} - optional configuration object
    */
  class Layer ()
    extends typingsSlinky.heremaps.H.map.layer.Layer {
    def this(opt_options: typingsSlinky.heremaps.H.map.layer.Layer.Options) = this()
  }
  
  /**
    * ObjectTileLayer represents map objects which are requested on a tile basis
    */
  @js.native
  class MarkerTileLayer protected ()
    extends typingsSlinky.heremaps.H.map.layer.MarkerTileLayer {
    /**
      * Constructor
      * @param provider {H.map.provider.MarkerTileProvider}
      * @param opt_options {H.map.layer.ITileLayer.Options=}
      */
    def this(provider: MarkerTileProvider) = this()
    def this(provider: MarkerTileProvider, opt_options: Options) = this()
  }
  
  /**
    * This class represents a layer which renders map objects. Spatial objects like polygons and polylines a rendered to tiles before being passed to the enigne. Point objects like markers
    * are provided as objects given an rectangular area.
    */
  @js.native
  class ObjectLayer protected ()
    extends typingsSlinky.heremaps.H.map.layer.ObjectLayer {
    def this(provider: Provider) = this()
    /**
      * Constructor
      * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
      * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
      */
    def this(provider: ObjectProvider) = this()
    def this(provider: Provider, opt_options: typingsSlinky.heremaps.H.map.layer.ObjectLayer.Options) = this()
    def this(provider: ObjectProvider, opt_options: typingsSlinky.heremaps.H.map.layer.ObjectLayer.Options) = this()
  }
  
  /**
    * Tile Layer, represents data shown on map on a tile basis. Can be used to show map tile images or other type of data which is partitioned into tiles.
    * @event update {H.util.Event}
    */
  @js.native
  class TileLayer protected ()
    extends typingsSlinky.heremaps.H.map.layer.TileLayer {
    /**
      * Constructor
      * @param provider {H.map.provider.TileProvider} - data source for the TileLayer
      * @param opt_options {H.map.layer.ITileLayer.Options=} - additional options
      */
    def this(provider: TileProvider) = this()
    def this(provider: TileProvider, opt_options: Options) = this()
  }
  
}

