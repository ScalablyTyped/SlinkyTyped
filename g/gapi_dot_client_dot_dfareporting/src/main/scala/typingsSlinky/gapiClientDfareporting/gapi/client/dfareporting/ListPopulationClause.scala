package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPopulationClause extends js.Object {
  /** Terms of this list population clause. Each clause is made up of list population terms representing constraints and are joined by ORs. */
  var terms: js.UndefOr[js.Array[ListPopulationTerm]] = js.native
}

object ListPopulationClause {
  @scala.inline
  def apply(): ListPopulationClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPopulationClause]
  }
  @scala.inline
  implicit class ListPopulationClauseOps[Self <: ListPopulationClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerms(value: js.Array[ListPopulationTerm]): Self = {
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

