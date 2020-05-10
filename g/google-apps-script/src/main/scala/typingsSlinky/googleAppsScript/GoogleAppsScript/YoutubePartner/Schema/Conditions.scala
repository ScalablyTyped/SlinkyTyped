package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conditions extends js.Object {
  var contentMatchType: js.UndefOr[js.Array[String]] = js.native
  var matchDuration: js.UndefOr[js.Array[IntervalCondition]] = js.native
  var matchPercent: js.UndefOr[js.Array[IntervalCondition]] = js.native
  var referenceDuration: js.UndefOr[js.Array[IntervalCondition]] = js.native
  var referencePercent: js.UndefOr[js.Array[IntervalCondition]] = js.native
  var requiredTerritories: js.UndefOr[TerritoryCondition] = js.native
}

object Conditions {
  @scala.inline
  def apply(): Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conditions]
  }
  @scala.inline
  implicit class ConditionsOps[Self <: Conditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentMatchType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMatchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMatchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMatchType")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchDuration(value: js.Array[IntervalCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPercent(value: js.Array[IntervalCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDuration(value: js.Array[IntervalCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencePercent(value: js.Array[IntervalCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredTerritories(value: TerritoryCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredTerritories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredTerritories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredTerritories")(js.undefined)
        ret
    }
  }
  
}

