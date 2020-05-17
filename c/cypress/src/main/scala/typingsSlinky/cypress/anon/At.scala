package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait At extends js.Object {
  var at: js.UndefOr[Double] = js.native
  var next: String = js.native
}

object At {
  @scala.inline
  def apply(next: String): At = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[At]
  }
  @scala.inline
  implicit class AtOps[Self <: At] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
  }
  
}

