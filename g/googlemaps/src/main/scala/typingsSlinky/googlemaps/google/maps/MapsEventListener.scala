package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Events *****/
@js.native
trait MapsEventListener extends js.Object {
  /**
    * Removes the listener.  Equivalent to calling
    * google.maps.event.removeListener(listener).
    */
  def remove(): Unit = js.native
}

object MapsEventListener {
  @scala.inline
  def apply(remove: () => Unit): MapsEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[MapsEventListener]
  }
  @scala.inline
  implicit class MapsEventListenerOps[Self <: MapsEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

