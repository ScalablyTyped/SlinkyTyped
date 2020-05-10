package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsOwnership extends js.Object {
  var general: js.UndefOr[js.Array[TerritoryOwners]] = js.native
  var kind: js.UndefOr[String] = js.native
  var mechanical: js.UndefOr[js.Array[TerritoryOwners]] = js.native
  var performance: js.UndefOr[js.Array[TerritoryOwners]] = js.native
  var synchronization: js.UndefOr[js.Array[TerritoryOwners]] = js.native
}

object RightsOwnership {
  @scala.inline
  def apply(): RightsOwnership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsOwnership]
  }
  @scala.inline
  implicit class RightsOwnershipOps[Self <: RightsOwnership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneral(value: js.Array[TerritoryOwners]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general")(js.undefined)
        ret
    }
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
    def withMechanical(value: js.Array[TerritoryOwners]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMechanical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanical")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: js.Array[TerritoryOwners]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronization(value: js.Array[TerritoryOwners]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronization")(js.undefined)
        ret
    }
  }
  
}

