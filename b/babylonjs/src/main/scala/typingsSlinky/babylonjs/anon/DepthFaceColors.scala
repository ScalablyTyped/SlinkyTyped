package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthFaceColors extends StObject {
  
  var alignHorizontal: js.UndefOr[Double] = js.native
  
  var alignVertical: js.UndefOr[Double] = js.native
  
  var depth: Double = js.native
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var pattern: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DepthFaceColors {
  
  @scala.inline
  def apply(depth: Double): DepthFaceColors = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthFaceColors]
  }
  
  @scala.inline
  implicit class DepthFaceColorsMutableBuilder[Self <: DepthFaceColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignHorizontal(value: Double): Self = StObject.set(x, "alignHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignHorizontalUndefined: Self = StObject.set(x, "alignHorizontal", js.undefined)
    
    @scala.inline
    def setAlignVertical(value: Double): Self = StObject.set(x, "alignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignVerticalUndefined: Self = StObject.set(x, "alignVertical", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceColorsUndefined: Self = StObject.set(x, "faceColors", js.undefined)
    
    @scala.inline
    def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value :_*))
    
    @scala.inline
    def setFaceUV(value: js.Array[Vector4]): Self = StObject.set(x, "faceUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUVUndefined: Self = StObject.set(x, "faceUV", js.undefined)
    
    @scala.inline
    def setFaceUVVarargs(value: Vector4*): Self = StObject.set(x, "faceUV", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPattern(value: Double): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
