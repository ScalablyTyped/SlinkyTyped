package typingsSlinky.expressBrute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reset extends js.Object {
  var reset: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
}

object Reset {
  @scala.inline
  def apply(): Reset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reset]
  }
  @scala.inline
  implicit class ResetOps[Self <: Reset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
  }
  
}

