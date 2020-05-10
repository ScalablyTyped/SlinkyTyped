package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGenericsearchterm extends js.Object {
  //  Filter parameters
  var generic_search_term: String = js.native
}

object AnonGenericsearchterm {
  @scala.inline
  def apply(generic_search_term: String): AnonGenericsearchterm = {
    val __obj = js.Dynamic.literal(generic_search_term = generic_search_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenericsearchterm]
  }
  @scala.inline
  implicit class AnonGenericsearchtermOps[Self <: AnonGenericsearchterm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneric_search_term(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic_search_term")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

