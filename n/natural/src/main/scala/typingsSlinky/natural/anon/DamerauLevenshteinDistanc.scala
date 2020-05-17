package typingsSlinky.natural.anon

import typingsSlinky.natural.naturalBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search  :true} */
@js.native
trait DamerauLevenshteinDistanc extends js.Object {
  /** @default 1 */
  var deletion_cost: js.UndefOr[Double] = js.native
  /** @default 1 */
  var insertion_cost: js.UndefOr[Double] = js.native
  /** @default false */
  var restricted: js.UndefOr[Boolean] = js.native
  /** @default false */
  var search: js.UndefOr[Boolean with `true`] = js.native
  /** @default 1 */
  var substitution_cost: js.UndefOr[Double] = js.native
  /** @default 1 */
  var transposition_cost: js.UndefOr[Double] = js.native
}

object DamerauLevenshteinDistanc {
  @scala.inline
  def apply(): DamerauLevenshteinDistanc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DamerauLevenshteinDistanc]
  }
  @scala.inline
  implicit class DamerauLevenshteinDistancOps[Self <: DamerauLevenshteinDistanc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletion_cost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletion_cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletion_cost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletion_cost")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertion_cost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertion_cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertion_cost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertion_cost")(js.undefined)
        ret
    }
    @scala.inline
    def withRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitution_cost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitution_cost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_cost")(js.undefined)
        ret
    }
    @scala.inline
    def withTransposition_cost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposition_cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransposition_cost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposition_cost")(js.undefined)
        ret
    }
  }
  
}

