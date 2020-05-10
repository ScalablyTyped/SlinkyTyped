package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[String] = js.native
  var startUtcSec: js.UndefOr[String] = js.native
}

object AnonEndUtcSec {
  @scala.inline
  def apply(): AnonEndUtcSec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEndUtcSec]
  }
  @scala.inline
  implicit class AnonEndUtcSecOps[Self <: AnonEndUtcSec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndUtcSec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endUtcSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndUtcSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endUtcSec")(js.undefined)
        ret
    }
    @scala.inline
    def withStartUtcSec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUtcSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartUtcSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUtcSec")(js.undefined)
        ret
    }
  }
  
}

