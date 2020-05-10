package typingsSlinky.reactFrontload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrontloadProps extends js.Object {
  var noServerRender: js.UndefOr[Boolean] = js.native
}

object FrontloadProps {
  @scala.inline
  def apply(): FrontloadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrontloadProps]
  }
  @scala.inline
  implicit class FrontloadPropsOps[Self <: FrontloadProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoServerRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noServerRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoServerRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noServerRender")(js.undefined)
        ret
    }
  }
  
}

