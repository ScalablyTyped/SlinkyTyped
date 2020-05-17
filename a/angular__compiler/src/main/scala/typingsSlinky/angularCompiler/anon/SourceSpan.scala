package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSpan extends js.Object {
  var sourceSpan: ParseSourceSpan | Null = js.native
}

object SourceSpan {
  @scala.inline
  def apply(): SourceSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSpan]
  }
  @scala.inline
  implicit class SourceSpanOps[Self <: SourceSpan] (val x: Self) extends AnyVal {
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

