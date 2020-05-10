package typingsSlinky.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockerDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.native
  var disable: js.Any = js.native
  var disableScroll: js.Any = js.native
  var id: js.Any = js.native
  def block(): Unit = js.native
  def destroy(): Unit = js.native
  def unblock(): Unit = js.native
}

object BlockerDelegate {
  @scala.inline
  def apply(
    block: () => Unit,
    destroy: () => Unit,
    disable: js.Any,
    disableScroll: js.Any,
    id: js.Any,
    unblock: () => Unit
  ): BlockerDelegate = {
    val __obj = js.Dynamic.literal(block = js.Any.fromFunction0(block), destroy = js.Any.fromFunction0(destroy), disable = disable.asInstanceOf[js.Any], disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unblock = js.Any.fromFunction0(unblock))
    __obj.asInstanceOf[BlockerDelegate]
  }
  @scala.inline
  implicit class BlockerDelegateOps[Self <: BlockerDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnblock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCtrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(js.undefined)
        ret
    }
  }
  
}

