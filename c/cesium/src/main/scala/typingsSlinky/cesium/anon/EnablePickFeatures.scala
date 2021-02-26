package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnablePickFeatures extends StObject {
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var enablePickFeatures: js.UndefOr[Boolean] = js.native
  
  var maximumLevel: js.UndefOr[Double] = js.native
  
  var proxy: js.UndefOr[typingsSlinky.cesium.mod.Proxy] = js.native
  
  var rectangle: js.UndefOr[typingsSlinky.cesium.mod.Rectangle] = js.native
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var tilingScheme: js.UndefOr[typingsSlinky.cesium.mod.TilingScheme] = js.native
  
  var url: String = js.native
  
  var usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.native
}
object EnablePickFeatures {
  
  @scala.inline
  def apply(url: String): EnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnablePickFeatures]
  }
  
  @scala.inline
  implicit class EnablePickFeaturesMutableBuilder[Self <: EnablePickFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setProxy(value: typingsSlinky.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRectangle(value: typingsSlinky.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    @scala.inline
    def setTilingScheme(value: typingsSlinky.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePreCachedTilesIfAvailable(value: Boolean): Self = StObject.set(x, "usePreCachedTilesIfAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePreCachedTilesIfAvailableUndefined: Self = StObject.set(x, "usePreCachedTilesIfAvailable", js.undefined)
  }
}
