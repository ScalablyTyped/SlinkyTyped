package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsolidationStrategy extends js.Object {
  var legacy: js.UndefOr[js.Any] = js.native
  var none: js.UndefOr[js.Any] = js.native
}

object ConsolidationStrategy {
  @scala.inline
  def apply(): ConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolidationStrategy]
  }
  @scala.inline
  implicit class ConsolidationStrategyOps[Self <: ConsolidationStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegacy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy")(js.undefined)
        ret
    }
    @scala.inline
    def withNone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(js.undefined)
        ret
    }
  }
  
}

