package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapType extends MapType {
  
  def getMapTypeOptions(): ImageMapTypeOptions = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getName(): String = js.native
  
  def getTileUrls(x: Double, y: Double, z: Double): js.Array[String] = js.native
  
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit = js.native
}
object ImageMapType {
  
  @scala.inline
  def apply(
    getMapTypeOptions: () => ImageMapTypeOptions,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    getTileUrls: (Double, Double, Double) => js.Array[String],
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    setMapTypeOptions: ImageMapTypeOptions => Unit,
    tileSize: Size
  ): ImageMapType = {
    val __obj = js.Dynamic.literal(getMapTypeOptions = js.Any.fromFunction0(getMapTypeOptions), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getTile = js.Any.fromFunction3(getTile), getTileUrls = js.Any.fromFunction3(getTileUrls), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], setMapTypeOptions = js.Any.fromFunction1(setMapTypeOptions), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapType]
  }
  
  @scala.inline
  implicit class ImageMapTypeMutableBuilder[Self <: ImageMapType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMapTypeOptions(value: () => ImageMapTypeOptions): Self = StObject.set(x, "getMapTypeOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileUrls(value: (Double, Double, Double) => js.Array[String]): Self = StObject.set(x, "getTileUrls", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMapTypeOptions(value: ImageMapTypeOptions => Unit): Self = StObject.set(x, "setMapTypeOptions", js.Any.fromFunction1(value))
  }
}
