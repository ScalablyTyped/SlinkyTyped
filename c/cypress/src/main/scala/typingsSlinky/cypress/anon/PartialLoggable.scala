package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable> */
@js.native
trait PartialLoggable extends js.Object {
  var log: js.UndefOr[Boolean] = js.native
}

object PartialLoggable {
  @scala.inline
  def apply(): PartialLoggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggable]
  }
  @scala.inline
  implicit class PartialLoggableOps[Self <: PartialLoggable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
  }
  
}

