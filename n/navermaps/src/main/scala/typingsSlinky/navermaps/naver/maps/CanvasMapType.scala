package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map.MapType
@js.native
trait CanvasMapType extends MapType {
  
  def getMapTypeOptions(): CanvasMapTypeOptions = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getName(): String = js.native
  
  def getTileData(x: Double, y: Double, z: Double): ImageData = js.native
  
  def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): Unit = js.native
}
object CanvasMapType {
  
  @scala.inline
  def apply(
    getMapTypeOptions: () => CanvasMapTypeOptions,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    getTileData: (Double, Double, Double) => ImageData,
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    setMapTypeOptions: CanvasMapTypeOptions => Unit,
    tileSize: Size
  ): CanvasMapType = {
    val __obj = js.Dynamic.literal(getMapTypeOptions = js.Any.fromFunction0(getMapTypeOptions), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getTile = js.Any.fromFunction3(getTile), getTileData = js.Any.fromFunction3(getTileData), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], setMapTypeOptions = js.Any.fromFunction1(setMapTypeOptions), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasMapType]
  }
  
  @scala.inline
  implicit class CanvasMapTypeMutableBuilder[Self <: CanvasMapType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMapTypeOptions(value: () => CanvasMapTypeOptions): Self = StObject.set(x, "getMapTypeOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileData(value: (Double, Double, Double) => ImageData): Self = StObject.set(x, "getTileData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMapTypeOptions(value: CanvasMapTypeOptions => Unit): Self = StObject.set(x, "setMapTypeOptions", js.Any.fromFunction1(value))
  }
}
