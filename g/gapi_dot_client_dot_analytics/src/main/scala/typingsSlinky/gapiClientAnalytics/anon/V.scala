package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V extends js.Object {
  var v: js.UndefOr[String] = js.native
}

object V {
  @scala.inline
  def apply(): V = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V]
  }
  @scala.inline
  implicit class VOps[Self <: V] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(js.undefined)
        ret
    }
  }
  
}

