package typingsSlinky.inboxsdk.mod.Router

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionView extends js.Object {
  var destroyed: Boolean = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  def remove(): Unit = js.native
}

object SectionView {
  @scala.inline
  def apply(destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit, remove: () => Unit): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SectionView]
  }
  @scala.inline
  implicit class SectionViewOps[Self <: SectionView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: (destroy, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

