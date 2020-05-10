package typingsSlinky.apigeeAccess.mod.ApigeeAccess

import typingsSlinky.apigeeAccess.apigeeAccessStrings.day
import typingsSlinky.apigeeAccess.apigeeAccessStrings.hour
import typingsSlinky.apigeeAccess.apigeeAccessStrings.minute
import typingsSlinky.apigeeAccess.apigeeAccessStrings.month
import typingsSlinky.apigeeAccess.apigeeAccessStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaServiceApplyOptions extends js.Object {
  var allow: Double = js.native
  var identifier: String = js.native
  var interval: js.UndefOr[Double] = js.native
  var timeUnit: minute | hour | day | week | month = js.native
  var weight: js.UndefOr[Double] = js.native
}

object QuotaServiceApplyOptions {
  @scala.inline
  def apply(allow: Double, identifier: String, timeUnit: minute | hour | day | week | month): QuotaServiceApplyOptions = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyOptions]
  }
  @scala.inline
  implicit class QuotaServiceApplyOptionsOps[Self <: QuotaServiceApplyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeUnit(value: minute | hour | day | week | month): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

