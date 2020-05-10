package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxParseResult extends js.Object {
  var errors: js.Array[String] = js.native
  var parseable: Boolean = js.native
}

object SyntaxParseResult {
  @scala.inline
  def apply(errors: js.Array[String], parseable: Boolean): SyntaxParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseable = parseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseResult]
  }
  @scala.inline
  implicit class SyntaxParseResultOps[Self <: SyntaxParseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

