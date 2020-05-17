package typingsSlinky.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Private extends js.Object {
  def `private`(key: String): String = js.native
  def shared(key: String): String = js.native
}

object Private {
  @scala.inline
  def apply(`private`: String => String, shared: String => String): Private = {
    val __obj = js.Dynamic.literal(shared = js.Any.fromFunction1(shared))
    __obj.updateDynamic("private")(js.Any.fromFunction1(`private`))
    __obj.asInstanceOf[Private]
  }
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivate(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShared(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

