package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a criterion describing how an object must match some rules that specify (part of) a search. */
@js.native
trait SearchCriterium extends js.Object {
  /** a number of rule terms. */
  var Terms: SafeArray[RuleTerm] = js.native
}

object SearchCriterium {
  @scala.inline
  def apply(Terms: SafeArray[RuleTerm]): SearchCriterium = {
    val __obj = js.Dynamic.literal(Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriterium]
  }
  @scala.inline
  implicit class SearchCriteriumOps[Self <: SearchCriterium] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerms(value: SafeArray[RuleTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

