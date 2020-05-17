package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline extends EventBindable {
  def getBounds(): Bounds = js.native
  def getExtData(): js.Any = js.native
  def getLength(): Double = js.native
  def getOptions(): PolylineOptions = js.native
  def getPath(): js.Array[LngLat] = js.native
  def hide(): Unit = js.native
  def setExtData(ext: js.Any): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(opt: PolylineOptions): Unit = js.native
  def setPath(path: js.Array[LngLat]): Unit = js.native
  def show(): Unit = js.native
}

object Polyline {
  @scala.inline
  def apply(
    getBounds: () => Bounds,
    getExtData: () => js.Any,
    getLength: () => Double,
    getOptions: () => PolylineOptions,
    getPath: () => js.Array[LngLat],
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setExtData: js.Any => Unit,
    setMap: Map => Unit,
    setOptions: PolylineOptions => Unit,
    setPath: js.Array[LngLat] => Unit,
    show: () => Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getExtData = js.Any.fromFunction0(getExtData), getLength = js.Any.fromFunction0(getLength), getOptions = js.Any.fromFunction0(getOptions), getPath = js.Any.fromFunction0(getPath), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setPath = js.Any.fromFunction1(setPath), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Polyline]
  }
  @scala.inline
  implicit class PolylineOps[Self <: Polyline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBounds(value: () => Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptions(value: () => PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPath(value: () => js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetExtData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMap(value: Map => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: PolylineOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPath(value: js.Array[LngLat] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPath")(js.Any.fromFunction1(value))
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

