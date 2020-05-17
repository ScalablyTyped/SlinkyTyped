package typingsSlinky.officeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expand extends js.Object {
  var expand: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
}

object Expand {
  @scala.inline
  def apply(): Expand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand]
  }
  @scala.inline
  implicit class ExpandOps[Self <: Expand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

