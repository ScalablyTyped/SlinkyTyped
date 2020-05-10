package typingsSlinky.angularRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExact extends js.Object {
  var exact: Boolean = js.native
}

object AnonExact {
  @scala.inline
  def apply(exact: Boolean): AnonExact = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExact]
  }
  @scala.inline
  implicit class AnonExactOps[Self <: AnonExact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

