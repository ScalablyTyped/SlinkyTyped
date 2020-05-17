package typingsSlinky.chromecastCafSender

import typingsSlinky.chromecastCafSender.anon.Typeofcast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Global object
////////////////////
@js.native
trait Window extends js.Object {
  var cast: Typeofcast = js.native
  def __onGCastApiAvailable(available: Boolean): Unit = js.native
}

object Window {
  @scala.inline
  def apply(__onGCastApiAvailable: Boolean => Unit, cast: Typeofcast): Window = {
    val __obj = js.Dynamic.literal(__onGCastApiAvailable = js.Any.fromFunction1(__onGCastApiAvailable), cast = cast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__onGCastApiAvailable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__onGCastApiAvailable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCast(value: Typeofcast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

