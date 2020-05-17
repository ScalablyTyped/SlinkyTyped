package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeSelf extends js.Object {
  var includeSelf: Boolean = js.native
  var parentFirst: Boolean = js.native
}

object IncludeSelf {
  @scala.inline
  def apply(includeSelf: Boolean, parentFirst: Boolean): IncludeSelf = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelf]
  }
  @scala.inline
  implicit class IncludeSelfOps[Self <: IncludeSelf] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withParentFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFirst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

