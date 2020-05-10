package typingsSlinky.nivoAnnotations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbs extends js.Object {
  var abs: Double | String = js.native
}

object AnonAbs {
  @scala.inline
  def apply(abs: Double | String): AnonAbs = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbs]
  }
  @scala.inline
  implicit class AnonAbsOps[Self <: AnonAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbs(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

