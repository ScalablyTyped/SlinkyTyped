package typingsSlinky.reactMdl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FABButtonProps extends ButtonProps {
  var mini: js.UndefOr[Boolean] = js.native
}

object FABButtonProps {
  @scala.inline
  def apply(): FABButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FABButtonProps]
  }
  @scala.inline
  implicit class FABButtonPropsOps[Self <: FABButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMini(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(js.undefined)
        ret
    }
  }
  
}

