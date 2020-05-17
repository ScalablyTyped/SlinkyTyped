package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupInterval extends js.Object {
  var groupInterval: js.UndefOr[String | Double] = js.native
  var target: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double | js.Date] = js.native
  var valueText: js.UndefOr[String] = js.native
}

object GroupInterval {
  @scala.inline
  def apply(): GroupInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupInterval]
  }
  @scala.inline
  implicit class GroupIntervalOps[Self <: GroupInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupInterval(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(js.undefined)
        ret
    }
  }
  
}

