package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainsFocus extends js.Object {
  var containsFocus: js.UndefOr[Boolean] = js.native
}

object ContainsFocus {
  @scala.inline
  def apply(): ContainsFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsFocus]
  }
  @scala.inline
  implicit class ContainsFocusOps[Self <: ContainsFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsFocus")(js.undefined)
        ret
    }
  }
  
}

