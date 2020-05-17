package typingsSlinky.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indent extends js.Object {
  var indent: js.UndefOr[Double] = js.native
}

object Indent {
  @scala.inline
  def apply(): Indent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indent]
  }
  @scala.inline
  implicit class IndentOps[Self <: Indent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
  }
  
}

