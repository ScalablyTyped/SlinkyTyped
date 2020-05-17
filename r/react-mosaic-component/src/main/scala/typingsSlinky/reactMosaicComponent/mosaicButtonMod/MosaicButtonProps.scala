package typingsSlinky.reactMosaicComponent.mosaicButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicButtonProps extends js.Object {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
}

object MosaicButtonProps {
  @scala.inline
  def apply(): MosaicButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MosaicButtonProps]
  }
  @scala.inline
  implicit class MosaicButtonPropsOps[Self <: MosaicButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

