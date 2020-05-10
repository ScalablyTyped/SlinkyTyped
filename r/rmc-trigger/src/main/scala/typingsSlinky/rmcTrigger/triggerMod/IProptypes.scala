package typingsSlinky.rmcTrigger.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProptypes extends js.Object {
  var visible: Boolean = js.native
  def onClose(): Unit = js.native
  def onTargetClick(): Unit = js.native
}

object IProptypes {
  @scala.inline
  def apply(onClose: () => Unit, onTargetClick: () => Unit, visible: Boolean): IProptypes = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onTargetClick = js.Any.fromFunction0(onTargetClick), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProptypes]
  }
  @scala.inline
  implicit class IProptypesOps[Self <: IProptypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTargetClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTargetClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

