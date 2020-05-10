package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing List Population Rule.
  */
@js.native
trait SchemaListPopulationRule extends js.Object {
  /**
    * Floodlight activity ID associated with this rule. This field can be left
    * blank.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /**
    * Name of floodlight activity associated with this rule. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityName: js.UndefOr[String] = js.native
  /**
    * Clauses that make up this list population rule. Clauses are joined by
    * ANDs, and the clauses themselves are made up of list population terms
    * which are joined by ORs.
    */
  var listPopulationClauses: js.UndefOr[js.Array[SchemaListPopulationClause]] = js.native
}

object SchemaListPopulationRule {
  @scala.inline
  def apply(): SchemaListPopulationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationRule]
  }
  @scala.inline
  implicit class SchemaListPopulationRuleOps[Self <: SchemaListPopulationRule] (val x: Self) extends AnyVal {
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
    def withListPopulationClauses(value: js.Array[SchemaListPopulationClause]): Self = {
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

