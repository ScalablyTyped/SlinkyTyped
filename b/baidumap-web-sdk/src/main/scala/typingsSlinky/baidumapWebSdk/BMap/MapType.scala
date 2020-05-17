package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapType extends js.Object {
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  def getProjection(): Projection = js.native
  def getTextColor(): String = js.native
  def getTileLayer(): TileLayer = js.native
  def getTips(): String = js.native
}

object MapType {
  @scala.inline
  def apply(
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getProjection: () => Projection,
    getTextColor: () => String,
    getTileLayer: () => TileLayer,
    getTips: () => String
  ): MapType = {
    val __obj = js.Dynamic.literal(getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getProjection = js.Any.fromFunction0(getProjection), getTextColor = js.Any.fromFunction0(getTextColor), getTileLayer = js.Any.fromFunction0(getTileLayer), getTips = js.Any.fromFunction0(getTips))
    __obj.asInstanceOf[MapType]
  }
  @scala.inline
  implicit class MapTypeOps[Self <: MapType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetProjection(value: () => Projection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTileLayer(value: () => TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileLayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTips(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTips")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

