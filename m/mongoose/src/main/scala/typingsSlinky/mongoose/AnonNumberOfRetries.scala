package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNumberOfRetries extends js.Object {
  var numberOfRetries: js.UndefOr[Double] = js.native
  var tailableRetryInterval: js.UndefOr[Double] = js.native
}

object AnonNumberOfRetries {
  @scala.inline
  def apply(): AnonNumberOfRetries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNumberOfRetries]
  }
  @scala.inline
  implicit class AnonNumberOfRetriesOps[Self <: AnonNumberOfRetries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withTailableRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailableRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTailableRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailableRetryInterval")(js.undefined)
        ret
    }
  }
  
}

