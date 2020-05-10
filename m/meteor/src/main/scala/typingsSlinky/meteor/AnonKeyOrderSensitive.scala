package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyOrderSensitive extends js.Object {
  var keyOrderSensitive: js.UndefOr[Boolean] = js.native
}

object AnonKeyOrderSensitive {
  @scala.inline
  def apply(): AnonKeyOrderSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKeyOrderSensitive]
  }
  @scala.inline
  implicit class AnonKeyOrderSensitiveOps[Self <: AnonKeyOrderSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyOrderSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOrderSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyOrderSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOrderSensitive")(js.undefined)
        ret
    }
  }
  
}

