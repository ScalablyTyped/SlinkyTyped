package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompanionClickThroughOverride extends js.Object {
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  var creativeId: js.UndefOr[String] = js.native
}

object CompanionClickThroughOverride {
  @scala.inline
  def apply(): CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanionClickThroughOverride]
  }
  @scala.inline
  implicit class CompanionClickThroughOverrideOps[Self <: CompanionClickThroughOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThroughUrl(value: ClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
  }
  
}

