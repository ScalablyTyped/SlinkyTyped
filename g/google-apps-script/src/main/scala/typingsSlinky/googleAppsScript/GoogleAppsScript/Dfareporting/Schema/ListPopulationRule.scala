package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPopulationRule extends js.Object {
  var floodlightActivityId: js.UndefOr[String] = js.native
  var floodlightActivityName: js.UndefOr[String] = js.native
  var listPopulationClauses: js.UndefOr[js.Array[ListPopulationClause]] = js.native
}

object ListPopulationRule {
  @scala.inline
  def apply(): ListPopulationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPopulationRule]
  }
  @scala.inline
  implicit class ListPopulationRuleOps[Self <: ListPopulationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloodlightActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityName")(js.undefined)
        ret
    }
    @scala.inline
    def withListPopulationClauses(value: js.Array[ListPopulationClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPopulationClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPopulationClauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPopulationClauses")(js.undefined)
        ret
    }
  }
  
}

