package typingsSlinky.octokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebug extends js.Object {
  var debug: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.native
  var error: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.native
  var info: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.native
  var warn: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.native
}

object AnonDebug {
  @scala.inline
  def apply(): AnonDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDebug]
  }
  @scala.inline
  implicit class AnonDebugOps[Self <: AnonDebug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withWarn(value: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
  }
  
}

