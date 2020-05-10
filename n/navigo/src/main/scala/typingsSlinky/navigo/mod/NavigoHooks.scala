package typingsSlinky.navigo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigoHooks extends js.Object {
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
  var already: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
      /* params */ js.UndefOr[Params], 
      Unit
    ]
  ] = js.native
  var leave: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.native
}

object NavigoHooks {
  @scala.inline
  def apply(): NavigoHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigoHooks]
  }
  @scala.inline
  implicit class NavigoHooksOps[Self <: NavigoHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: /* params */ js.UndefOr[Params] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAlready(value: /* params */ js.UndefOr[Params] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("already")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAlready: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("already")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(
      value: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: /* params */ js.UndefOr[Params] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
  }
  
}

