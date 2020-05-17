package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEWindow extends GEEventEmitter {
  /**
    * Removes focus from the Google Earth object.
    */
  def blur(): Unit = js.native
  /**
    * Gives the Google Earth object focus.
    */
  def focus(): Unit = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def getVisibility(): Boolean = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def setVisibility(visibility: Boolean): Unit = js.native
}

object GEWindow {
  @scala.inline
  def apply(
    blur: () => Unit,
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    focus: () => Unit,
    getVisibility: () => Boolean,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    setVisibility: Boolean => Unit
  ): GEWindow = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), focus = js.Any.fromFunction0(focus), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[GEWindow]
  }
  @scala.inline
  implicit class GEWindowOps[Self <: GEWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibility(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibility")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetVisibility(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibility")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

