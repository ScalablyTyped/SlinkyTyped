package typingsSlinky.resolveOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowEmpty: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var base: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.native
  var buffer: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var cwd: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.native
  var deep: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var dirMode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.native
  var mode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.native
  var overwrite: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var passthrough: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var read: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var since: js.UndefOr[js.Date | Double | (js.Function1[/* repeated */ js.Any, js.Date | Double])] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmptyFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllowEmpty(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFunction1(value: /* repeated */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBase(value: String | (js.Function1[/* repeated */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuffer(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withCwdFunction1(value: /* repeated */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCwd(value: String | (js.Function1[/* repeated */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeep(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withDirModeFunction1(value: /* repeated */ js.Any => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDirMode(value: String | Double | (js.Function1[/* repeated */ js.Any, String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(js.undefined)
        ret
    }
    @scala.inline
    def withModeFunction1(value: /* repeated */ js.Any => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMode(value: String | Double | (js.Function1[/* repeated */ js.Any, String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPassthroughFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPassthrough(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withSinceDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinceFunction1(value: /* repeated */ js.Any => js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSince(value: js.Date | Double | (js.Function1[/* repeated */ js.Any, js.Date | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
  }
  
}

