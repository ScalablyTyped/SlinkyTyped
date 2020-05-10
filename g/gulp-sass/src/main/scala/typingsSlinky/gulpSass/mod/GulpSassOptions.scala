package typingsSlinky.gulpSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpSassOptions extends SassOptions {
  var errLogToConsole: js.UndefOr[Boolean] = js.native
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.native
  var onSuccess: js.UndefOr[js.Function1[/* css */ String, _]] = js.native
  var sync: js.UndefOr[Boolean] = js.native
}

object GulpSassOptions {
  @scala.inline
  def apply(): GulpSassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpSassOptions]
  }
  @scala.inline
  implicit class GulpSassOptionsOps[Self <: GulpSassOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrLogToConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errLogToConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrLogToConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errLogToConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: /* css */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

