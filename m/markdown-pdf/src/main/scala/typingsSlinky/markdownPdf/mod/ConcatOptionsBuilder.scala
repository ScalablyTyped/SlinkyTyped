package typingsSlinky.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatOptionsBuilder extends js.Object {
  var from: ConcatFromOptionsBuilder = js.native
}

object ConcatOptionsBuilder {
  @scala.inline
  def apply(from: ConcatFromOptionsBuilder): ConcatOptionsBuilder = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatOptionsBuilder]
  }
  @scala.inline
  implicit class ConcatOptionsBuilderOps[Self <: ConcatOptionsBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: ConcatFromOptionsBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

