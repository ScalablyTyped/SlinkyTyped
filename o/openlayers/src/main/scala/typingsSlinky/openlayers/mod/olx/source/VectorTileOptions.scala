package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.TileCoord
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import typingsSlinky.openlayers.mod.TileUrlFunctionType
import typingsSlinky.openlayers.mod.VectorTile
import typingsSlinky.openlayers.mod.format.Feature
import typingsSlinky.openlayers.mod.olx.LogoOptions
import typingsSlinky.openlayers.mod.proj.Projection
import typingsSlinky.openlayers.mod.source.State
import typingsSlinky.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[Feature] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var overlaps: js.UndefOr[Boolean] = js.native
  
  var projection: ProjectionLike = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ VectorTile, 
      /* coords */ TileCoord, 
      /* state */ typingsSlinky.openlayers.mod.Tile.State, 
      /* s */ String, 
      /* feature */ Feature, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.native
  
  var tileGrid: js.UndefOr[TileGrid] = js.native
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object VectorTileOptions {
  
  @scala.inline
  def apply(): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorTileOptions]
  }
  
  @scala.inline
  implicit class VectorTileOptionsMutableBuilder[Self <: VectorTileOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTileClass(
      value: (/* n */ VectorTile, /* coords */ TileCoord, /* state */ typingsSlinky.openlayers.mod.Tile.State, /* s */ String, /* feature */ Feature, /* type */ TileLoadFunctionType) => _
    ): Self = StObject.set(x, "tileClass", js.Any.fromFunction6(value))
    
    @scala.inline
    def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
    
    @scala.inline
    def setTileGrid(value: TileGrid): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTileUrlFunction(value: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
    
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
  }
}
