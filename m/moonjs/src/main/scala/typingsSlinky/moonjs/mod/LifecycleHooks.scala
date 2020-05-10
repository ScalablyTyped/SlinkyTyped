package typingsSlinky.moonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHooks extends js.Object {
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var mounted: js.UndefOr[js.Function0[Unit]] = js.native
  var updated: js.UndefOr[js.Function0[Unit]] = js.native
}

object LifecycleHooks {
  @scala.inline
  def apply(): LifecycleHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHooks]
  }
  @scala.inline
  implicit class LifecycleHooksOps[Self <: LifecycleHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroyed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withMounted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

