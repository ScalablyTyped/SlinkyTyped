package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentFirst extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.native
  var parentFirst: js.UndefOr[Boolean] = js.native
}

object ParentFirst {
  @scala.inline
  def apply(): ParentFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentFirst]
  }
  @scala.inline
  implicit class ParentFirstOps[Self <: ParentFirst] (val x: Self) extends AnyVal {
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
    def withoutIncludeSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelf")(js.undefined)
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

