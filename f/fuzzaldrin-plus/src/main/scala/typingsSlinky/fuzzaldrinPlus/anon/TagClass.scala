package typingsSlinky.fuzzaldrinPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagClass extends js.Object {
  var tagClass: js.UndefOr[String] = js.native
  var tagClose: js.UndefOr[String] = js.native
  var tagOpen: js.UndefOr[String] = js.native
}

object TagClass {
  @scala.inline
  def apply(): TagClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagClass]
  }
  @scala.inline
  implicit class TagClassOps[Self <: TagClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTagClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTagOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagOpen")(js.undefined)
        ret
    }
  }
  
}

