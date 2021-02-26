package typingsSlinky.heredatalens

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.heredatalens.H.datalens.HeatmapLayer.Aggregation
import typingsSlinky.heredatalens.H.datalens.HeatmapLayer.InputScale
import typingsSlinky.heredatalens.H.datalens.HeatmapLayer.Options
import typingsSlinky.heredatalens.H.datalens.HeatmapLayer.Row
import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.X
import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Y
import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsSlinky.heredatalens.H.datalens.RasterLayer.TilePoint
import typingsSlinky.heredatalens.H.datalens.Service.Data
import typingsSlinky.heremaps.H.map.Icon
import typingsSlinky.heremaps.H.map.provider.RemoteTileProvider
import typingsSlinky.heremaps.H.util.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object H {
    
    /**
      * Data Lens REST API connector for HERE Maps API
      * Data Lens JavaScript API is a module for HERE Maps API.
      * It connects Data Lens REST API and provides data-driven styling of data on a map.
      */
    object datalens {
      
      /**
        * Provides functionality of value-based heat map with density alpha mask.
        * Layer support different types of blending, including weighted average. Also it allows to apply alpha mask calculated by density.
        * In most cases, the layer consumes data grouped by 1x1 pixels buckets. For proper averaging it requires aggregated value and count (number of rows in bucket) for each bucket.
        * Blending of buckets is implemented via kernel density estimation (KDE) with a Gaussian kernel.
        */
      @JSGlobal("H.datalens.HeatmapLayer")
      @js.native
      class HeatmapLayer protected ()
        extends typingsSlinky.heredatalens.H.datalens.HeatmapLayer {
        /**
          * Constructor
          * @param provider - Source of tiled data
          * @param options - Configuration for data processing and rendering
          */
        def this(provider: typingsSlinky.heredatalens.H.datalens.QueryTileProvider, options: Options) = this()
      }
      object HeatmapLayer {
        
        @JSGlobal("H.datalens.HeatmapLayer")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Set of possible values for the aggregation option.
          * If the heat map input data is buckets, then different types of aggregation can be applied to the rows in a bucket.
          * The aggregation type is required for proper blending mode of the heat map. For the AVERAGE aggregation type, an averaged heat map is rendered.
          */
        @JSGlobal("H.datalens.HeatmapLayer.Aggregation")
        @js.native
        object Aggregation_ extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[Aggregation with Double] = js.native
          
          /* 1 */ val AVERAGE: typingsSlinky.heredatalens.H.datalens.HeatmapLayer.Aggregation.AVERAGE with Double = js.native
          
          /* 0 */ val SUM: typingsSlinky.heredatalens.H.datalens.HeatmapLayer.Aggregation.SUM with Double = js.native
        }
        
        /**
          * Set of possible values for the inputScale option.
          * The input scale is required for proper heat map blending. If the input scale is not linear, then the TilePoint.value is converted to linear scale before calculating the sum or average.
          */
        @JSGlobal("H.datalens.HeatmapLayer.InputScale")
        @js.native
        object InputScale_ extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[InputScale with Double] = js.native
          
          /* 0 */ val DB: typingsSlinky.heredatalens.H.datalens.HeatmapLayer.InputScale.DB with Double = js.native
          
          /* 1 */ val LINEAR: typingsSlinky.heredatalens.H.datalens.HeatmapLayer.InputScale.LINEAR with Double = js.native
          
          /* 2 */ val LOG: typingsSlinky.heredatalens.H.datalens.HeatmapLayer.InputScale.LOG with Double = js.native
        }
        
        /**
          * Set of possible values for the aggregation option
          */
        /* static member */
        @JSGlobal("H.datalens.HeatmapLayer.aggregation")
        @js.native
        def aggregation: Aggregation = js.native
        @scala.inline
        def aggregation_=(x: Aggregation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(x.asInstanceOf[js.Any])
        
        /**
          * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
          */
        /* static member */
        @JSGlobal("H.datalens.HeatmapLayer.defaultDataToRows")
        @js.native
        def defaultDataToRows: js.Function4[/* data */ Data, /* x */ X, /* y */ Y, /* zoom */ Zoom, js.Array[Row]] = js.native
        @scala.inline
        def defaultDataToRows_=(x: js.Function4[/* data */ Data, /* x */ X, /* y */ Y, /* zoom */ Zoom, js.Array[Row]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDataToRows")(x.asInstanceOf[js.Any])
        
        /**
          * Set of possible values for the inputScale option
          */
        /* static member */
        @JSGlobal("H.datalens.HeatmapLayer.inputScale")
        @js.native
        def inputScale: InputScale = js.native
        @scala.inline
        def inputScale_=(x: InputScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputScale")(x.asInstanceOf[js.Any])
      }
      
      /**
        * Presents data as points or spatial map objects with data-driven styles and client-side clustering.
        * Applicable for drawing interactive map objects like markers, polygons, circles and other instances of map.Object. Source of data can be either tiled or not tiled.
        * Styles for objects can be parametrized with data rows and zoom level. Allows to create data-driven icons for markers like donuts or bars.
        * Also enables clustering and data domains for visualizing up to 100k points or more.
        */
      @JSGlobal("H.datalens.ObjectLayer")
      @js.native
      class ObjectLayer protected ()
        extends typingsSlinky.heredatalens.H.datalens.ObjectLayer {
        def this(
          provider: typingsSlinky.heredatalens.H.datalens.Provider,
          options: typingsSlinky.heredatalens.H.datalens.ObjectLayer.Options
        ) = this()
        def this(
          provider: typingsSlinky.heredatalens.H.datalens.QueryProvider,
          options: typingsSlinky.heredatalens.H.datalens.ObjectLayer.Options
        ) = this()
        def this(
          provider: typingsSlinky.heredatalens.H.datalens.QueryTileProvider,
          options: typingsSlinky.heredatalens.H.datalens.ObjectLayer.Options
        ) = this()
        /**
          * Constructor
          * @param provider - Data source (tiled or not)
          * @param options - Defines data processing, clustering and data-driven styling
          */
        def this(provider: RemoteTileProvider, options: typingsSlinky.heredatalens.H.datalens.ObjectLayer.Options) = this()
      }
      object ObjectLayer {
        
        /**
          * A factory method for data-driven icons. The method allows you to build an icon from SVG markup or JsonML object. Provides caching of icons with the same markup.
          * @param svg - SVG presented as markup or JsonML Array
          * @param options - Icon options (eg size and anchor). Note that the default anchor is in the middle.
          * @param options.size - When the icon is a square, you can define the size as a number in pixels
          * @returns - Icon which can be used for marker or cluster
          */
        /* static member */
        @JSGlobal("H.datalens.ObjectLayer.createIcon")
        @js.native
        def createIcon(svg: String): Icon = js.native
        @JSGlobal("H.datalens.ObjectLayer.createIcon")
        @js.native
        def createIcon(svg: String, options: typingsSlinky.heremaps.H.map.Icon.Options): Icon = js.native
        @JSGlobal("H.datalens.ObjectLayer.createIcon")
        @js.native
        def createIcon(svg: js.Array[_]): Icon = js.native
        @JSGlobal("H.datalens.ObjectLayer.createIcon")
        @js.native
        def createIcon(svg: js.Array[_], options: typingsSlinky.heremaps.H.map.Icon.Options): Icon = js.native
        
        /**
          * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
          */
        /* static member */
        @JSGlobal("H.datalens.ObjectLayer.defaultDataToRows")
        @js.native
        def defaultDataToRows(data: Data): js.Array[typingsSlinky.heredatalens.H.datalens.ObjectLayer.Row] = js.native
        
        /**
          * Returns cache of icons created with the createIcon method. Can be used to clean the icon cache.
          * @return - Icon cache
          */
        /* static member */
        @JSGlobal("H.datalens.ObjectLayer.getIconCache")
        @js.native
        def getIconCache(): Cache = js.native
      }
      
      /**
        * Providers define interfaces for layers to access data.
        * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
        * This provider allows you to supply data stored locally or fetched using external tools.
        */
      @JSGlobal("H.datalens.Provider")
      @js.native
      /**
        * Constructor
        * @param data - JSON object
        * @param options - Configures data accessibility parameters
        */
      class Provider ()
        extends typingsSlinky.heredatalens.H.datalens.Provider {
        def this(data: Data) = this()
        def this(data: js.UndefOr[scala.Nothing], options: typingsSlinky.heremaps.H.map.provider.Provider.Options) = this()
        def this(data: Data, options: typingsSlinky.heremaps.H.map.provider.Provider.Options) = this()
      }
      
      /**
        * Defines the source of the data for layers from a Data Lens query.
        * Providers define interfaces for layers to access data.  The input data can be stored locally or loaded from the network.
        * Data can be loaded by tiles or in one chunk. This provider loads query data with the Data Lens REST API.
        * Note that this provider must be used only for non-tiled queries.
        */
      @JSGlobal("H.datalens.QueryProvider")
      @js.native
      class QueryProvider protected ()
        extends typingsSlinky.heredatalens.H.datalens.QueryProvider {
        /**
          * Constructor
          * @param service - Data Lens REST API service
          * @param options - Configures source query and data accessibility parameters
          */
        def this(data: Data) = this()
        def this(data: Data, options: typingsSlinky.heredatalens.H.datalens.QueryProvider.Options) = this()
      }
      
      /**
        * Providers define interfaces for layers to access data.
        * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
        * This provider loads tiled query data with the Data Lens REST API. Tiled queries are used to load data only for the current viewport.
        * This optimizes memory and network usage and enables progressive rendering.
        */
      @JSGlobal("H.datalens.QueryTileProvider")
      @js.native
      class QueryTileProvider protected ()
        extends typingsSlinky.heredatalens.H.datalens.QueryTileProvider {
        /**
          * Constructor
          * @param service - Data Lens REST API service
          * @param options - Configures source query and data accessibility parameters
          */
        def this(
          service: typingsSlinky.heredatalens.H.datalens.Service,
          options: typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Options
        ) = this()
      }
      
      /**
        * Provides pixel-wise rendering of data.
        * Layer used when you need to visualize more than 10k points. The layer requires source data to be located in pixel coordinates.
        * The rendering is implemented by drawing directly on a canvas.  The layer is often used together with a Data Lens query which groups rows by pixels.
        * This reduces the amount of data delivered to the client.
        */
      @JSGlobal("H.datalens.RasterLayer")
      @js.native
      /**
        * Constructor
        */
      class RasterLayer ()
        extends typingsSlinky.heredatalens.H.datalens.RasterLayer
      object RasterLayer {
        
        @JSGlobal("H.datalens.RasterLayer")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Default value for dataToRows callback option.
          * It represents each row as an object where property names correspond to data column names.
          */
        /* static member */
        @JSGlobal("H.datalens.RasterLayer.defaultDataToRows")
        @js.native
        def defaultDataToRows: js.Any = js.native
        @scala.inline
        def defaultDataToRows_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDataToRows")(x.asInstanceOf[js.Any])
        
        /**
          * This is a default implementation of renderTile callback. This method represents each point as a black 1x1 pixel square.
          * @param points - Input data points within a tile
          * @param canvas - The target canvas
          */
        /* static member */
        @JSGlobal("H.datalens.RasterLayer.defaultRenderTile")
        @js.native
        def defaultRenderTile(points: js.Array[TilePoint], canvas: HTMLCanvasElement): Unit = js.native
      }
      
      /**
        * Defines how to load data from a raw data file
        * This provider defines the interface for loading data, such as geometries or coordinates, from a local or remote data file in GeoJSON or CSV format
        */
      @JSGlobal("H.datalens.RawDataProvider")
      @js.native
      class RawDataProvider protected ()
        extends typingsSlinky.heredatalens.H.datalens.RawDataProvider {
        /**
          * Constructor
          * @param options - Configures options
          */
        def this(options: typingsSlinky.heredatalens.H.datalens.RawDataProvider.Options) = this()
      }
      
      /**
        * HERE Maps API and Data Lens JavaScript API can be used to visualize data from different network sources.
        * For each network source type, a service class is required. The service also stores API connection credentials.
        * The service instance must be configured with a service.Platform instance.
        */
      @JSGlobal("H.datalens.Service")
      @js.native
      /**
        * Constructor
        * @param options - Overrides the configuration from the service.Platform instance
        */
      class Service ()
        extends typingsSlinky.heredatalens.H.datalens.Service {
        def this(options: typingsSlinky.heredatalens.H.datalens.Service.Options) = this()
      }
      
      /**
        * Renders vector tiles using data-driven styles
        * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
        */
      @JSGlobal("H.datalens.SpatialLayer")
      @js.native
      class SpatialLayer protected ()
        extends typingsSlinky.heredatalens.H.datalens.SpatialLayer {
        /**
          * Constructor
          * @param dataProvider - Source of tiled data (pass in null if data come from feature properties)
          * @param spatialProvider - Source of geometry data
          * @param options - Configuration for data processing and rendering
          */
        def this(
          dataProvider: typingsSlinky.heredatalens.H.datalens.Provider,
          spatialProvider: typingsSlinky.heredatalens.H.datalens.SpatialTileProvider,
          options: typingsSlinky.heredatalens.H.datalens.SpatialLayer.Options
        ) = this()
      }
      object SpatialLayer {
        
        @JSGlobal("H.datalens.SpatialLayer")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("H.datalens.SpatialLayer.DEFAULT_STATE")
        @js.native
        def DEFAULT_STATE: js.Any = js.native
        @scala.inline
        def DEFAULT_STATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_STATE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("H.datalens.SpatialLayer.Spatial")
        @js.native
        def Spatial: js.Any = js.native
        @scala.inline
        def Spatial_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Spatial")(x.asInstanceOf[js.Any])
        
        /**
          * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
          */
        /* static member */
        @JSGlobal("H.datalens.SpatialLayer.defaultDataToRows")
        @js.native
        def defaultDataToRows: js.Any = js.native
        @scala.inline
        def defaultDataToRows_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDataToRows")(x.asInstanceOf[js.Any])
      }
      
      /**
        * Specifies how to access layer data (shapes, geometries) using the Data Lens REST API.
        * This provider defines the interface for accessing shape layers via the Data Lens REST API. The input data is provided as vector tiles in the MapBox format (Protobuf).
        * Data is loaded by tiles.
        */
      @JSGlobal("H.datalens.SpatialTileProvider")
      @js.native
      class SpatialTileProvider protected ()
        extends typingsSlinky.heredatalens.H.datalens.SpatialTileProvider {
        /**
          * Constructor
          * @param service - Data Lens REST API service
          * @param options - Configures layer name
          */
        def this(
          service: typingsSlinky.heredatalens.H.datalens.Service,
          options: typingsSlinky.heredatalens.H.datalens.SpatialTileProvider.Options
        ) = this()
      }
      object SpatialTileProvider {
        
        @JSGlobal("H.datalens.SpatialTileProvider")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("H.datalens.SpatialTileProvider.VectorTile")
        @js.native
        def VectorTile: js.Any = js.native
        @scala.inline
        def VectorTile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VectorTile")(x.asInstanceOf[js.Any])
      }
    }
  }
}
