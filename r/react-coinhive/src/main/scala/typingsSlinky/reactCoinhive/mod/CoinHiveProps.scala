package typingsSlinky.reactCoinhive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoinHiveProps extends js.Object {
  var autoThreads: js.UndefOr[Boolean] = js.native
  var onInit: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
  var onStart: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
  var onStop: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
  var run: js.UndefOr[Boolean] = js.native
  var siteKey: String = js.native
  var src: js.UndefOr[String] = js.native
  var threads: js.UndefOr[Double] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var userName: js.UndefOr[String] = js.native
}

object CoinHiveProps {
  @scala.inline
  def apply(siteKey: String): CoinHiveProps = {
    val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinHiveProps]
  }
  @scala.inline
  implicit class CoinHivePropsOps[Self <: CoinHiveProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSiteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoThreads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoThreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoThreads")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: /* callback */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* callback */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: /* callback */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

