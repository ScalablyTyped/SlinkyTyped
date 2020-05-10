package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group clause made up of list population terms representing constraints
  * joined by ORs.
  */
@js.native
trait SchemaListPopulationClause extends js.Object {
  /**
    * Terms of this list population clause. Each clause is made up of list
    * population terms representing constraints and are joined by ORs.
    */
  var terms: js.UndefOr[js.Array[SchemaListPopulationTerm]] = js.native
}

object SchemaListPopulationClause {
  @scala.inline
  def apply(): SchemaListPopulationClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationClause]
  }
  @scala.inline
  implicit class SchemaListPopulationClauseOps[Self <: SchemaListPopulationClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerms(value: js.Array[SchemaListPopulationTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
  }
  
}

