package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeNewline extends js.Object {
  var includeNewline: js.UndefOr[Boolean] = js.native
}

object AnonIncludeNewline {
  @scala.inline
  def apply(): AnonIncludeNewline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeNewline]
  }
  @scala.inline
  implicit class AnonIncludeNewlineOps[Self <: AnonIncludeNewline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeNewline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNewline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNewline")(js.undefined)
        ret
    }
  }
  
}

