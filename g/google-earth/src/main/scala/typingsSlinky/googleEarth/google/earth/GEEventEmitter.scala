package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEEventEmitter extends js.Object {
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  def click(event: KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  def dblclick(event: KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  def mousedown(event: KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  def mousemove(event: KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  def mouseout(event: KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  def mouseover(event: KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  def mouseup(event: KmlMouseEvent): Unit = js.native
}

object GEEventEmitter {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit
  ): GEEventEmitter = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup))
    __obj.asInstanceOf[GEEventEmitter]
  }
  @scala.inline
  implicit class GEEventEmitterOps[Self <: GEEventEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDblclick(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMousedown(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMousemove(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMouseout(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMouseover(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMouseup(value: KmlMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

