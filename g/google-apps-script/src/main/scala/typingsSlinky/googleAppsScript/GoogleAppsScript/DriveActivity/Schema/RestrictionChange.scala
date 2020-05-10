package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictionChange extends js.Object {
  var feature: js.UndefOr[String] = js.native
  var newRestriction: js.UndefOr[String] = js.native
}

object RestrictionChange {
  @scala.inline
  def apply(): RestrictionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictionChange]
  }
  @scala.inline
  implicit class RestrictionChangeOps[Self <: RestrictionChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(js.undefined)
        ret
    }
    @scala.inline
    def withNewRestriction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRestriction")(js.undefined)
        ret
    }
  }
  
}

