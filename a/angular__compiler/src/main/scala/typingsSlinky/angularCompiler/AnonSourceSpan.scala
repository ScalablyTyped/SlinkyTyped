package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceSpan extends js.Object {
  var sourceSpan: ParseSourceSpan | Null = js.native
}

object AnonSourceSpan {
  @scala.inline
  def apply(): AnonSourceSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSourceSpan]
  }
  @scala.inline
  implicit class AnonSourceSpanOps[Self <: AnonSourceSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceSpan(value: ParseSourceSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSpanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSpan")(null)
        ret
    }
  }
  
}

