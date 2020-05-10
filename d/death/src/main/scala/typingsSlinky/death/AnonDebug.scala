package typingsSlinky.death

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebug extends js.Object {
  var SIGHUP: js.UndefOr[Boolean] = js.native
  var SIGINT: js.UndefOr[Boolean] = js.native
  var SIGQUIT: js.UndefOr[Boolean] = js.native
  var SIGTERM: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var uncaughtException: js.UndefOr[Boolean] = js.native
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
    def withSIGHUP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGHUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGHUP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGHUP")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGINT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGINT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGINT")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGQUIT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGQUIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGQUIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGQUIT")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGTERM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTERM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGTERM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTERM")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withUncaughtException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncaughtException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(js.undefined)
        ret
    }
  }
  
}

