package typingsSlinky.finch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedCallback extends js.Object {
  var load: js.UndefOr[FinchCallback] = js.native
  var setup: js.UndefOr[FinchCallback] = js.native
  var teardown: js.UndefOr[FinchCallback] = js.native
  var unload: js.UndefOr[FinchCallback] = js.native
}

object ExpandedCallback {
  @scala.inline
  def apply(): ExpandedCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandedCallback]
  }
  @scala.inline
  implicit class ExpandedCallbackOps[Self <: ExpandedCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withTeardown(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTeardown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.undefined)
        ret
    }
    @scala.inline
    def withUnload(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.undefined)
        ret
    }
  }
  
}

