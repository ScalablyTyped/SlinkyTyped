package typingsSlinky.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.heremaps.H.map.layer.TileLayer
import typingsSlinky.heremaps.H.map.provider.RemoteTileProvider
import typingsSlinky.heremaps.H.service.metaInfo.Service.Info
import typingsSlinky.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metaInfo {
  
  /**
    * This class encapsulates a Metainfo Tile end point of the HERE Map Tile API.
    */
  @js.native
  trait Service
    extends EventTarget
       with IConfigurable {
    
    /**
      * This method creates a tile layer. This layer can be used as a layer on a map's data model.
      * @param tileSize {number} - The tile size
      * @param pixelRatio {number} - The tile's pixel ratio, should be aligned with base map tile
      * @param opt_categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
      * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the meta info service
      * @param opt_tileType {string=} - the tile type (default is 'maptile')
      * @param opt_scheme {string=} - the scheme for which the meta info tiles a requested (default is 'normal.day')
      * @returns {H.map.layer.TileLayer} - the tile layer
      */
    def createTileLayer(tileSize: Double, pixelRatio: Double): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(tileSize: Double, pixelRatio: Double, opt_categoryFilter: js.Array[String]): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): TileLayer = js.native
    def createTileLayer(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): TileLayer = js.native
    
    /**
      * This method creates a tile provider which uses the meta info tile backend. This provider can be used as a data source for an TileLayer.
      * @param tileSize {number} - The tile size
      * @param pixelRatio {number} - The tile's pixel ratio, should be aligned with base map tile
      * @param opt_categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
      * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the meta info service
      * @param opt_tileType {string=} - the tile type (default is 'maptile')
      * @param opt_scheme {string=} - the scheme for which the meta info tiles a requested (default is 'normal.day')
      * @returns {H.map.provider.TileProvider} - the tile provider
      */
    def createTileProvider(tileSize: Double, pixelRatio: Double): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String,
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.UndefOr[scala.Nothing],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(tileSize: Double, pixelRatio: Double, opt_categoryFilter: js.Array[String]): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: js.UndefOr[scala.Nothing],
      opt_tileType: String,
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: js.UndefOr[scala.Nothing],
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    def createTileProvider(
      tileSize: Double,
      pixelRatio: Double,
      opt_categoryFilter: js.Array[String],
      opt_additionalParameters: ServiceParameters,
      opt_tileType: String,
      opt_scheme: String
    ): typingsSlinky.heremaps.H.map.provider.TileProvider = js.native
    
    /**
      * This method returns the meta info tile service's meta information. The method will return an object once the map tile service's data has been fetched.
      * @returns {(H.service.metaInfo.Service.Info | undefined)} - meta information for this meta info tile service
      */
    def getInfo(): Info | Unit = js.native
    
    /**
      * This method returns the meta info tile service's newest version hash.
      * @returns {string} - meta information for this map tile service
      */
    def getVersion(): String = js.native
  }
  object Service {
    
    /**
      * @property maps {Object<string, Object>} -
      * @property schemes {Object<string, Object>} -
      * @property tiletypes {Object<string, Object>} -
      * @property formats {Object<string, Object>} -
      * @property resolutions {Object<string, Object>} -
      * @property languages {Object<string, Object>} -
      */
    @js.native
    trait Info extends StObject {
      
      var formats: StringDictionary[js.Any] = js.native
      
      var languages: StringDictionary[js.Any] = js.native
      
      var maps: StringDictionary[js.Any] = js.native
      
      var resolutions: StringDictionary[js.Any] = js.native
      
      var schemes: StringDictionary[js.Any] = js.native
      
      var tiletypes: StringDictionary[js.Any] = js.native
    }
    object Info {
      
      @scala.inline
      def apply(
        formats: StringDictionary[js.Any],
        languages: StringDictionary[js.Any],
        maps: StringDictionary[js.Any],
        resolutions: StringDictionary[js.Any],
        schemes: StringDictionary[js.Any],
        tiletypes: StringDictionary[js.Any]
      ): Info = {
        val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any], tiletypes = tiletypes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Info]
      }
      
      @scala.inline
      implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormats(value: StringDictionary[js.Any]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguages(value: StringDictionary[js.Any]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaps(value: StringDictionary[js.Any]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolutions(value: StringDictionary[js.Any]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchemes(value: StringDictionary[js.Any]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTiletypes(value: StringDictionary[js.Any]): Self = StObject.set(x, "tiletypes", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @property type {string=} - the type of the map tile service to communicate with, e.g. 'base' (default), 'aerial', etc. (refer to the Map Tile REST API documentation for
      * available types)
      * @property version {string=} - the map version hash to use for retrieving tiles, default is newest and will be automatically updated
      * @property subDomain {string=} - the sub-domain of the map tile service relative to the platform's base URL, default is 'maps'
      */
    @js.native
    trait Options extends StObject {
      
      var subDomain: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var version: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
  }
  
  object TileProvider {
    
    /**
      * Configuration object which can be used to initialize the TileProvider.
      * @property tileType {string=} - The tile type for which to request meta info
      * @property scheme {string=} - The map scheme for which to request meta info
      * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
      * @property tileSize {number=} - The size of the tiles rendered by this provider (must be power of 2, default is 256)
      * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
      * @property categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
      */
    @js.native
    trait Options extends StObject {
      
      var categoryFilter: js.UndefOr[js.Array[String]] = js.native
      
      var pixelRatio: js.UndefOr[Double] = js.native
      
      var scheme: js.UndefOr[String] = js.native
      
      var tileCacheSize: js.UndefOr[Double] = js.native
      
      var tileSize: js.UndefOr[Double] = js.native
      
      var tileType: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategoryFilter(value: js.Array[String]): Self = StObject.set(x, "categoryFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoryFilterUndefined: Self = StObject.set(x, "categoryFilter", js.undefined)
        
        @scala.inline
        def setCategoryFilterVarargs(value: String*): Self = StObject.set(x, "categoryFilter", js.Array(value :_*))
        
        @scala.inline
        def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
        
        @scala.inline
        def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
        
        @scala.inline
        def setTileCacheSize(value: Double): Self = StObject.set(x, "tileCacheSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileCacheSizeUndefined: Self = StObject.set(x, "tileCacheSize", js.undefined)
        
        @scala.inline
        def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        @scala.inline
        def setTileType(value: String): Self = StObject.set(x, "tileType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileTypeUndefined: Self = StObject.set(x, "tileType", js.undefined)
      }
    }
  }
  /**
    * This class utilizes Metainfo Tiles functionality provided by the Map Tile API to load meta information about map objects (buildings, labels, public transport etc.).
    */
  type TileProvider = RemoteTileProvider
}
