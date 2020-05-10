package typingsSlinky.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatabadge extends js.Object {
  var `data-badge`: js.UndefOr[String | Double] = js.native
}

object AnonDatabadge {
  @scala.inline
  def apply(): AnonDatabadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDatabadge]
  }
  @scala.inline
  implicit class AnonDatabadgeOps[Self <: AnonDatabadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withData-badge`(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-badge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-badge")(js.undefined)
        ret
    }
  }
  
}

