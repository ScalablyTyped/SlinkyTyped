package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayer extends js.Object {
  def getCopyright(): Copyright = js.native
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String = js.native
  def isTransparentPng(): Boolean = js.native
}

object TileLayer {
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng))
    __obj.asInstanceOf[TileLayer]
  }
  @scala.inline
  implicit class TileLayerOps[Self <: TileLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCopyright(value: () => Copyright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCopyright")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTilesUrl(value: (Pixel, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTilesUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsTransparentPng(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransparentPng")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

