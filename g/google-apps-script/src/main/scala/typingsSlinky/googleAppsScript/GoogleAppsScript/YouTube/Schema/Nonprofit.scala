package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nonprofit extends js.Object {
  var nonprofitId: js.UndefOr[NonprofitId] = js.native
  var nonprofitLegalName: js.UndefOr[String] = js.native
}

object Nonprofit {
  @scala.inline
  def apply(): Nonprofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nonprofit]
  }
  @scala.inline
  implicit class NonprofitOps[Self <: Nonprofit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonprofitId(value: NonprofitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonprofitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitId")(js.undefined)
        ret
    }
    @scala.inline
    def withNonprofitLegalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitLegalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonprofitLegalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitLegalName")(js.undefined)
        ret
    }
  }
  
}

