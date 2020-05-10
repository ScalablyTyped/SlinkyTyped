package typingsSlinky.driftless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomClearTimeout extends js.Object {
  var customClearTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}

object AnonCustomClearTimeout {
  @scala.inline
  def apply(): AnonCustomClearTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCustomClearTimeout]
  }
  @scala.inline
  implicit class AnonCustomClearTimeoutOps[Self <: AnonCustomClearTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomClearTimeout(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClearTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomClearTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClearTimeout")(js.undefined)
        ret
    }
  }
  
}

