package typingsSlinky.baidumapWebSdk.BMap

import typingsSlinky.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaLabel extends js.Object {
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def getAltitude(): Double = js.native
  def getContent(): String = js.native
  def getPosition(): Point = js.native
  def getPov(): PanoramaPov = js.native
  def hide(): Unit = js.native
  def onclick(event: Target): Unit = js.native
  def onmouseout(event: Target): Unit = js.native
  def onmouseover(event: Target): Unit = js.native
  def onremove(event: Target): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setAltitude(altitude: Double): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  def show(): Unit = js.native
}

object PanoramaLabel {
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    getAltitude: () => Double,
    getContent: () => String,
    getPosition: () => Point,
    getPov: () => PanoramaPov,
    hide: () => Unit,
    onclick: Target => Unit,
    onmouseout: Target => Unit,
    onmouseover: Target => Unit,
    onremove: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setAltitude: Double => Unit,
    setContent: String => Unit,
    setPosition: Point => Unit,
    show: () => Unit
  ): PanoramaLabel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getAltitude = js.Any.fromFunction0(getAltitude), getContent = js.Any.fromFunction0(getContent), getPosition = js.Any.fromFunction0(getPosition), getPov = js.Any.fromFunction0(getPov), hide = js.Any.fromFunction0(hide), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onremove = js.Any.fromFunction1(onremove), removeEventListener = js.Any.fromFunction2(removeEventListener), setAltitude = js.Any.fromFunction1(setAltitude), setContent = js.Any.fromFunction1(setContent), setPosition = js.Any.fromFunction1(setPosition), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PanoramaLabel]
  }
  @scala.inline
  implicit class PanoramaLabelOps[Self <: PanoramaLabel] (val x: Self) extends AnyVal {
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
    def withGetAltitude(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAltitude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPov(value: () => PanoramaPov): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPov")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnclick(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseout(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseover(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.Any.fromFunction1(value))
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
    def withSetAltitude(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAltitude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
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

