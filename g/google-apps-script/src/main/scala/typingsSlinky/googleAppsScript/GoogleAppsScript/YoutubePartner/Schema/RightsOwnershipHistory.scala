package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsOwnershipHistory extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var origination: js.UndefOr[Origination] = js.native
  var ownership: js.UndefOr[RightsOwnership] = js.native
  var timeProvided: js.UndefOr[String] = js.native
}

object RightsOwnershipHistory {
  @scala.inline
  def apply(): RightsOwnershipHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsOwnershipHistory]
  }
  @scala.inline
  implicit class RightsOwnershipHistoryOps[Self <: RightsOwnershipHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigination(value: Origination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origination")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnership(value: RightsOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownership")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeProvided(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeProvided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeProvided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeProvided")(js.undefined)
        ret
    }
  }
  
}

