package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends js.Object {
  def contains(point: LngLat): Boolean = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): LngLat = js.native
  def getExtData(): js.Any = js.native
  def getOptions(): CircleOptions = js.native
  def getRadius(): Double = js.native
  def hide(): Unit = js.native
  def setCenter(lnglat: LngLat): Unit = js.native
  def setExtData(ext: js.Any): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(circleopt: CircleOptions): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  def show(): Unit = js.native
}

object Circle {
  @scala.inline
  def apply(
    contains: LngLat => Boolean,
    getBounds: () => Bounds,
    getCenter: () => LngLat,
    getExtData: () => js.Any,
    getOptions: () => CircleOptions,
    getRadius: () => Double,
    hide: () => Unit,
    setCenter: LngLat => Unit,
    setExtData: js.Any => Unit,
    setMap: Map => Unit,
    setOptions: CircleOptions => Unit,
    setRadius: Double => Unit,
    show: () => Unit
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getExtData = js.Any.fromFunction0(getExtData), getOptions = js.Any.fromFunction0(getOptions), getRadius = js.Any.fromFunction0(getRadius), hide = js.Any.fromFunction0(hide), setCenter = js.Any.fromFunction1(setCenter), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setRadius = js.Any.fromFunction1(setRadius), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Circle]
  }
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: LngLat => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBounds(value: () => Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCenter(value: () => LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptions(value: () => CircleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRadius(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRadius")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCenter(value: LngLat => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCenter")(js.Any.fromFunction1(value))
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
    def withSetOptions(value: CircleOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRadius(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRadius")(js.Any.fromFunction1(value))
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

