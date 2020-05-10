package typingsSlinky.angularStrap.mgcrea.ngStrap.affix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAffix extends js.Object {
  def checkPosition(): Unit = js.native
  def checkPositionWithEventLoop(): Unit = js.native
  def destroy(): Unit = js.native
  def init(): Unit = js.native
}

object IAffix {
  @scala.inline
  def apply(
    checkPosition: () => Unit,
    checkPositionWithEventLoop: () => Unit,
    destroy: () => Unit,
    init: () => Unit
  ): IAffix = {
    val __obj = js.Dynamic.literal(checkPosition = js.Any.fromFunction0(checkPosition), checkPositionWithEventLoop = js.Any.fromFunction0(checkPositionWithEventLoop), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[IAffix]
  }
  @scala.inline
  implicit class IAffixOps[Self <: IAffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckPosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckPositionWithEventLoop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPositionWithEventLoop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

