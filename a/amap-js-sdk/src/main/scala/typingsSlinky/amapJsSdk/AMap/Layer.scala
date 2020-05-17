package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends EventBindable {
  def getTiles(): js.Array[String] = js.native
  def getZooms(): js.Array[Double] = js.native
  def hide(): Unit = js.native
  def reload(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOpacity(alpha: Double): Unit = js.native
  def setTileUrl(): Unit = js.native
  def setzIndex(index: Double): Unit = js.native
  def show(): Unit = js.native
}

object Layer {
  @scala.inline
  def apply(
    getTiles: () => js.Array[String],
    getZooms: () => js.Array[Double],
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    reload: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setTileUrl: () => Unit,
    setzIndex: Double => Unit,
    show: () => Unit
  ): Layer = {
    val __obj = js.Dynamic.literal(getTiles = js.Any.fromFunction0(getTiles), getZooms = js.Any.fromFunction0(getZooms), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), reload = js.Any.fromFunction0(reload), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setTileUrl = js.Any.fromFunction0(setTileUrl), setzIndex = js.Any.fromFunction1(setzIndex), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTiles(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZooms(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZooms")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMap(value: Map => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTileUrl(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTileUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetzIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setzIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

