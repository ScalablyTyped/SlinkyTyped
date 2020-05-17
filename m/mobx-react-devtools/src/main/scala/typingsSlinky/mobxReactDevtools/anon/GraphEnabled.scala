package typingsSlinky.mobxReactDevtools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphEnabled extends js.Object {
  var graphEnabled: js.UndefOr[Boolean] = js.native
  var logEnabled: js.UndefOr[Boolean] = js.native
  var logFilter: js.UndefOr[js.Function1[/* p */ js.Any, Boolean]] = js.native
  var updatesEnabled: js.UndefOr[Boolean] = js.native
}

object GraphEnabled {
  @scala.inline
  def apply(): GraphEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphEnabled]
  }
  @scala.inline
  implicit class GraphEnabledOps[Self <: GraphEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFilter(value: /* p */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatesEnabled")(js.undefined)
        ret
    }
  }
  
}

