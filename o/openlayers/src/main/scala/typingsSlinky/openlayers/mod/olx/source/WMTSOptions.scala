package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.ImageTile
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.Tile.State
import typingsSlinky.openlayers.mod.TileCoord
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import typingsSlinky.openlayers.mod.olx.LogoOptions
import typingsSlinky.openlayers.mod.source.WMTSRequestEncoding
import typingsSlinky.openlayers.mod.tilegrid.WMTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTSOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var dimensions: js.UndefOr[GlobalObject] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var layer: String = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var matrixSet: String = js.native
  
  var projection: ProjectionLike = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.native
  
  var style: String = js.native
  
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.native
  
  var tileGrid: WMTS = js.native
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  
  var tilePixelRatio: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object WMTSOptions {
  
  @scala.inline
  def apply(layer: String, matrixSet: String, style: String, tileGrid: WMTS): WMTSOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSOptions]
  }
  
  @scala.inline
  implicit class WMTSOptionsMutableBuilder[Self <: WMTSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setDimensions(value: GlobalObject): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setMatrixSet(value: String): Self = StObject.set(x, "matrixSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setRequestEncoding(value: WMTSRequestEncoding | String): Self = StObject.set(x, "requestEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEncodingUndefined: Self = StObject.set(x, "requestEncoding", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileClass(
      value: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => _
    ): Self = StObject.set(x, "tileClass", js.Any.fromFunction6(value))
    
    @scala.inline
    def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
    
    @scala.inline
    def setTileGrid(value: WMTS): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
    
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
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
