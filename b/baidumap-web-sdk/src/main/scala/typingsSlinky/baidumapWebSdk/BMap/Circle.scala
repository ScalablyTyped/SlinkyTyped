package typingsSlinky.baidumapWebSdk.BMap

import typingsSlinky.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends Overlay {
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def disableEditing(): Unit = js.native
  def disableMassClear(): Unit = js.native
  def enableEditing(): Unit = js.native
  def enableMassClear(): Unit = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Point = js.native
  def getFillColor(): String = js.native
  def getFillOpacity(): Double = js.native
  def getMap(): Map = js.native
  def getRadius(): Double = js.native
  def getStrokeColor(): String = js.native
  def getStrokeOpacity(): Double = js.native
  def getStrokeStyle(): String = js.native
  def getStrokeWeight(): Double = js.native
  def onclick(event: Target): Unit = js.native
  def ondblclick(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def onlineupdate(event: Target): Unit = js.native
  def onmousedown(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def onmouseout(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def onmouseover(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def onmouseup(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def onremove(event: Target): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setCenter(center: Point): Unit = js.native
  def setFillColor(color: String): Unit = js.native
  def setFillOpacity(opacity: Double): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  def setStrokeColor(color: String): Unit = js.native
  def setStrokeOpacity(opacity: Double): Unit = js.native
  def setStrokeStyle(style: String): Unit = js.native
  def setStrokeWeight(weight: Double): Unit = js.native
}

object Circle {
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    disableEditing: () => Unit,
    disableMassClear: () => Unit,
    enableEditing: () => Unit,
    enableMassClear: () => Unit,
    getBounds: () => Bounds,
    getCenter: () => Point,
    getFillColor: () => String,
    getFillOpacity: () => Double,
    getMap: () => Map,
    getRadius: () => Double,
    getStrokeColor: () => String,
    getStrokeOpacity: () => Double,
    getStrokeStyle: () => String,
    getStrokeWeight: () => Double,
    onclick: Target => Unit,
    ondblclick: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    onlineupdate: Target => Unit,
    onmousedown: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    onmouseout: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    onmouseover: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    onmouseup: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    onremove: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setCenter: Point => Unit,
    setFillColor: String => Unit,
    setFillOpacity: Double => Unit,
    setRadius: Double => Unit,
    setStrokeColor: String => Unit,
    setStrokeOpacity: Double => Unit,
    setStrokeStyle: String => Unit,
    setStrokeWeight: Double => Unit
  ): Circle = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableEditing = js.Any.fromFunction0(disableEditing), disableMassClear = js.Any.fromFunction0(disableMassClear), enableEditing = js.Any.fromFunction0(enableEditing), enableMassClear = js.Any.fromFunction0(enableMassClear), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getFillColor = js.Any.fromFunction0(getFillColor), getFillOpacity = js.Any.fromFunction0(getFillOpacity), getMap = js.Any.fromFunction0(getMap), getRadius = js.Any.fromFunction0(getRadius), getStrokeColor = js.Any.fromFunction0(getStrokeColor), getStrokeOpacity = js.Any.fromFunction0(getStrokeOpacity), getStrokeStyle = js.Any.fromFunction0(getStrokeStyle), getStrokeWeight = js.Any.fromFunction0(getStrokeWeight), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onlineupdate = js.Any.fromFunction1(onlineupdate), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), removeEventListener = js.Any.fromFunction2(removeEventListener), setCenter = js.Any.fromFunction1(setCenter), setFillColor = js.Any.fromFunction1(setFillColor), setFillOpacity = js.Any.fromFunction1(setFillOpacity), setRadius = js.Any.fromFunction1(setRadius), setStrokeColor = js.Any.fromFunction1(setStrokeColor), setStrokeOpacity = js.Any.fromFunction1(setStrokeOpacity), setStrokeStyle = js.Any.fromFunction1(setStrokeStyle), setStrokeWeight = js.Any.fromFunction1(setStrokeWeight))
    __obj.asInstanceOf[Circle]
  }
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, Callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisableEditing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableMassClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMassClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableEditing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEditing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableMassClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMassClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBounds(value: () => Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCenter(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFillColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFillColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFillOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFillOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMap(value: () => Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRadius(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRadius")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeStyle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeWeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeWeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnclick(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOndblclick(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlineupdate(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineupdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmousedown(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseout(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseover(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseup(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnremove(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, Callback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCenter(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFillColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFillColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFillOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFillOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRadius(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeStyle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeWeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeWeight")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

