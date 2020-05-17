package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeSelfBoolean extends js.Object {
  var includeSelf: Boolean = js.native
}

object IncludeSelfBoolean {
  @scala.inline
  def apply(includeSelf: Boolean): IncludeSelfBoolean = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelfBoolean]
  }
  @scala.inline
  implicit class IncludeSelfBooleanOps[Self <: IncludeSelfBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

