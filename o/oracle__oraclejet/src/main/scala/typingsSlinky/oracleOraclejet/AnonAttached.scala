package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttached extends js.Object {
  def attached(param0: js.Object): Unit = js.native
}

object AnonAttached {
  @scala.inline
  def apply(attached: js.Object => Unit): AnonAttached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[AnonAttached]
  }
  @scala.inline
  implicit class AnonAttachedOps[Self <: AnonAttached] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

