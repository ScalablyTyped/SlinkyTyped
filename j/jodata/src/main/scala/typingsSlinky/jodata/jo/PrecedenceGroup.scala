package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecedenceGroup extends js.Object {
  def andFilter(filterClause: FilterClause): FilterClause = js.native
  def orFilter(filterClause: FilterClause): FilterClause = js.native
}

object PrecedenceGroup {
  @scala.inline
  def apply(andFilter: FilterClause => FilterClause, orFilter: FilterClause => FilterClause): PrecedenceGroup = {
    val __obj = js.Dynamic.literal(andFilter = js.Any.fromFunction1(andFilter), orFilter = js.Any.fromFunction1(orFilter))
    __obj.asInstanceOf[PrecedenceGroup]
  }
  @scala.inline
  implicit class PrecedenceGroupOps[Self <: PrecedenceGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndFilter(value: FilterClause => FilterClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrFilter(value: FilterClause => FilterClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orFilter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

