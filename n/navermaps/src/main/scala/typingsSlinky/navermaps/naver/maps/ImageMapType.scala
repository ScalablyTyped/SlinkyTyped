package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ImageMapTypeOps[Self <: ImageMapType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMapTypeOptions(value: () => ImageMapTypeOptions): Self = {
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
    def withGetTileUrls(value: (Double, Double, Double) => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrls")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMapTypeOptions(value: ImageMapTypeOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapTypeOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

