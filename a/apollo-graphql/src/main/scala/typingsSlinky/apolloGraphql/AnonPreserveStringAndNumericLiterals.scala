package typingsSlinky.apolloGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreserveStringAndNumericLiterals extends js.Object {
  var preserveStringAndNumericLiterals: Boolean = js.native
}

object AnonPreserveStringAndNumericLiterals {
  @scala.inline
  def apply(preserveStringAndNumericLiterals: Boolean): AnonPreserveStringAndNumericLiterals = {
    val __obj = js.Dynamic.literal(preserveStringAndNumericLiterals = preserveStringAndNumericLiterals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveStringAndNumericLiterals]
  }
  @scala.inline
  implicit class AnonPreserveStringAndNumericLiteralsOps[Self <: AnonPreserveStringAndNumericLiterals] (val x: Self) extends AnyVal {
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

