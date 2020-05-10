package typingsSlinky.googlemapsInfobubble.google.maps.infobubble

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.googlemaps.google.maps.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoBubble extends js.Object {
  /**
    * Closes the infobubble
    */
  def close(): Unit = js.native
  /**
    * Returns the position of the InfoBubble
    */
  def getPosition(): LatLng = js.native
  /**
    * Checks if the infobubble is currently open
    */
  def isOpen(): Boolean = js.native
  /**
    * Opens the infobubble
    * @map The google map object
    * @marker The marker used for anchoring the infobubble to
    */
  def open(map: Map[Element], marker: Marker): Unit = js.native
}

object InfoBubble {
  @scala.inline
  def apply(
    close: () => Unit,
    getPosition: () => LatLng,
    isOpen: () => Boolean,
    open: (Map[Element], Marker) => Unit
  ): InfoBubble = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPosition = js.Any.fromFunction0(getPosition), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction2(open))
    __obj.asInstanceOf[InfoBubble]
  }
  @scala.inline
  implicit class InfoBubbleOps[Self <: InfoBubble] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: (Map[Element], Marker) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

