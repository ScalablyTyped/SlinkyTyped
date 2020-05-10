package typingsSlinky.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeSelfParentFirst extends js.Object {
  var includeSelf: Boolean = js.native
  var parentFirst: js.UndefOr[Boolean] = js.native
}

object AnonIncludeSelfParentFirst {
  @scala.inline
  def apply(includeSelf: Boolean): AnonIncludeSelfParentFirst = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSelfParentFirst]
  }
  @scala.inline
  implicit class AnonIncludeSelfParentFirstOps[Self <: AnonIncludeSelfParentFirst] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutParentFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFirst")(js.undefined)
        ret
    }
  }
  
}

