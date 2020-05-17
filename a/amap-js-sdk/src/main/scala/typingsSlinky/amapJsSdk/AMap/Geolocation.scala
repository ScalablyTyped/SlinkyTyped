package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation extends EventBindable {
  def clearWatch(watchId: Double): Double = js.native
  def getCurrentPosition(): Unit = js.native
  def isSupported(): Boolean = js.native
  def watchPosition(): Double = js.native
}

object Geolocation {
  @scala.inline
  def apply(
    clearWatch: Double => Double,
    getCurrentPosition: () => Unit,
    isSupported: () => Boolean,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    watchPosition: () => Double
  ): Geolocation = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentPosition = js.Any.fromFunction0(getCurrentPosition), isSupported = js.Any.fromFunction0(isSupported), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), watchPosition = js.Any.fromFunction0(watchPosition))
    __obj.asInstanceOf[Geolocation]
  }
  @scala.inline
  implicit class GeolocationOps[Self <: Geolocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearWatch(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearWatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentPosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSupported(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWatchPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPosition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

