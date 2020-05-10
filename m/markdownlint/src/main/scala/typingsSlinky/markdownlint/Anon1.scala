package typingsSlinky.markdownlint

import typingsSlinky.markdownlint.markdownlintStrings.one
import typingsSlinky.markdownlint.markdownlintStrings.one_or_ordered
import typingsSlinky.markdownlint.markdownlintStrings.ordered
import typingsSlinky.markdownlint.markdownlintStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1 extends js.Object {
  var style: js.UndefOr[one | ordered | one_or_ordered | zero] = js.native
}

object Anon1 {
  @scala.inline
  def apply(): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon1]
  }
  @scala.inline
  implicit class Anon1Ops[Self <: Anon1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: one | ordered | one_or_ordered | zero): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

