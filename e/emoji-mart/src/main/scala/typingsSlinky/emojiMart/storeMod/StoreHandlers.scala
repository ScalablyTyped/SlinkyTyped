package typingsSlinky.emojiMart.storeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreHandlers extends js.Object {
  var getter: js.UndefOr[js.Function1[/* key */ String, _]] = js.native
  var setter: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.native
}

object StoreHandlers {
  @scala.inline
  def apply(): StoreHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreHandlers]
  }
  @scala.inline
  implicit class StoreHandlersOps[Self <: StoreHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetter(value: /* key */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetter(value: (/* key */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.undefined)
        ret
    }
  }
  
}

