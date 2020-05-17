package typingsSlinky.amapJsSdk.AMap

import typingsSlinky.amapJsSdk.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBar
  extends EventBindable
     with MapControl {
  def doLocation(): Unit = js.native
  def getLocation(): Lat = js.native
  def getOffset(): Pixel = js.native
  def hideDirection(): Unit = js.native
  def hideLocation(): Unit = js.native
  def hideRuler(): Unit = js.native
  def setOffset(offset: Pixel): Unit = js.native
  def showDirection(): Unit = js.native
  def showLocation(): Unit = js.native
  def showRuler(): Unit = js.native
}

object ToolBar {
  @scala.inline
  def apply(
    doLocation: () => Unit,
    getLocation: () => Lat,
    getOffset: () => Pixel,
    hide: () => Unit,
    hideDirection: () => Unit,
    hideLocation: () => Unit,
    hideRuler: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setOffset: Pixel => Unit,
    show: () => Unit,
    showDirection: () => Unit,
    showLocation: () => Unit,
    showRuler: () => Unit
  ): ToolBar = {
    val __obj = js.Dynamic.literal(doLocation = js.Any.fromFunction0(doLocation), getLocation = js.Any.fromFunction0(getLocation), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), hideDirection = js.Any.fromFunction0(hideDirection), hideLocation = js.Any.fromFunction0(hideLocation), hideRuler = js.Any.fromFunction0(hideRuler), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show), showDirection = js.Any.fromFunction0(showDirection), showLocation = js.Any.fromFunction0(showLocation), showRuler = js.Any.fromFunction0(showRuler))
    __obj.asInstanceOf[ToolBar]
  }
  @scala.inline
  implicit class ToolBarOps[Self <: ToolBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoLocation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocation(value: () => Lat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffset(value: () => Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideDirection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideLocation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideRuler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRuler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOffset(value: Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowDirection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowLocation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowRuler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRuler")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

