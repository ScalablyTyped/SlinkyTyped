package typingsSlinky.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinationOperators extends js.Object {
  /** Matches if all the selectors in the array match. */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[Selector]] = js.native
  /** Matches if none of the selectors in the array match. */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[Selector]] = js.native
  /** Matches if the given selector does not match. */
  @JSName("$not")
  var $not: js.UndefOr[Selector] = js.native
  /** Matches if any of the selectors in the array match. All selectors must use the same index. */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[Selector]] = js.native
}

object CombinationOperators {
  @scala.inline
  def apply(): CombinationOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinationOperators]
  }
  @scala.inline
  implicit class CombinationOperatorsOps[Self <: CombinationOperators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$and(value: js.Array[Selector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$and: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(js.undefined)
        ret
    }
    @scala.inline
    def with$nor(value: js.Array[Selector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(js.undefined)
        ret
    }
    @scala.inline
    def with$not(value: Selector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$not: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(js.undefined)
        ret
    }
    @scala.inline
    def with$or(value: js.Array[Selector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$or: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(js.undefined)
        ret
    }
  }
  
}

