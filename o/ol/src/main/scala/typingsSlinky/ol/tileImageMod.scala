package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Tile
import typingsSlinky.ol.olTileMod.UrlFunction
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.projMod.ProjectionLike
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import typingsSlinky.ol.stateMod.State
import typingsSlinky.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileImageMod {
  
  @JSImport("ol/source/TileImage", JSImport.Default)
  @js.native
  class default protected () extends TileImage {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var imageSmoothing: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var opaque: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var tileClass: js.UndefOr[typingsSlinky.ol.imageTileMod.default] = js.native
    
    var tileGrid: js.UndefOr[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.native
    
    var tilePixelRatio: js.UndefOr[Double] = js.native
    
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
    
    var transition: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var urls: js.UndefOr[js.Array[String]] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zDirection: js.UndefOr[Double] = js.native
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
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTileClass(value: typingsSlinky.ol.imageTileMod.default): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      @scala.inline
      def setTileGrid(value: typingsSlinky.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      @scala.inline
      def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      @scala.inline
      def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      @scala.inline
      def setTileUrlFunction(
        value: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typingsSlinky.ol.projectionMod.default) => js.UndefOr[String]
      ): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
      
      @scala.inline
      def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      @scala.inline
      def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  @js.native
  trait TileImage
    extends typingsSlinky.ol.urlTileMod.default {
    
    var crossOrigin: String = js.native
    
    def getGutter(): Double = js.native
    
    /* protected */ def getTileInternal(
      z: Double,
      x: Double,
      y: Double,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projectionMod.default
    ): typingsSlinky.ol.olTileMod.default = js.native
    
    /**
      * Sets whether to render reprojection edges or not (usually for debugging).
      */
    def setRenderReprojectionEdges(render: Boolean): Unit = js.native
    
    /**
      * Sets the tile grid to use when reprojecting the tiles to the given
      * projection instead of the default tile grid for the projection.
      * This can be useful when the default tile grid cannot be created
      * (e.g. projection has no extent defined) or
      * for optimization reasons (custom tile size, resolutions, ...).
      */
    def setTileGridForProjection(projection: ProjectionLike, tilegrid: typingsSlinky.ol.tilegridTileGridMod.default): Unit = js.native
    
    var tileCacheForProjection: StringDictionary[typingsSlinky.ol.tileCacheMod.default] = js.native
    
    var tileClass: typingsSlinky.ol.imageTileMod.default = js.native
    
    var tileGridForProjection: StringDictionary[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
  }
}
