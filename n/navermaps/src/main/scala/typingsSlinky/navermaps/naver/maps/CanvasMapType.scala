package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CanvasMapTypeOps[Self <: CanvasMapType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMapTypeOptions(value: () => CanvasMapTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMapTypeOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxZoom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinZoom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTileData(value: (Double, Double, Double) => ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMapTypeOptions(value: CanvasMapTypeOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapTypeOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

