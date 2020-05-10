package typingsSlinky.rcDialog.dialogMod

import typingsSlinky.rcDialog.idialogproptypesMod.IDialogPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogChildProps extends IDialogPropTypes {
  var switchScrollingEffect: js.UndefOr[js.Function0[Unit]] = js.native
  def getOpenCount(): Double = js.native
}

object IDialogChildProps {
  @scala.inline
  def apply(getOpenCount: () => Double): IDialogChildProps = {
    val __obj = js.Dynamic.literal(getOpenCount = js.Any.fromFunction0(getOpenCount))
    __obj.asInstanceOf[IDialogChildProps]
  }
  @scala.inline
  implicit class IDialogChildPropsOps[Self <: IDialogChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetOpenCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSwitchScrollingEffect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchScrollingEffect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSwitchScrollingEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchScrollingEffect")(js.undefined)
        ret
    }
  }
  
}

