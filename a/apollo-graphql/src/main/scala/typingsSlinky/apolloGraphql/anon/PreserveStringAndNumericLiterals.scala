package typingsSlinky.apolloGraphql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreserveStringAndNumericLiterals extends js.Object {
  var preserveStringAndNumericLiterals: Boolean = js.native
}

object PreserveStringAndNumericLiterals {
  @scala.inline
  def apply(preserveStringAndNumericLiterals: Boolean): PreserveStringAndNumericLiterals = {
    val __obj = js.Dynamic.literal(preserveStringAndNumericLiterals = preserveStringAndNumericLiterals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveStringAndNumericLiterals]
  }
  @scala.inline
  implicit class PreserveStringAndNumericLiteralsOps[Self <: PreserveStringAndNumericLiterals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveStringAndNumericLiterals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveStringAndNumericLiterals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

