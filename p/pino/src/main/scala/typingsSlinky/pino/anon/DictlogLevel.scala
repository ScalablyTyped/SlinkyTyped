package typingsSlinky.pino.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pino.mod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictlogLevel extends /* logLevel */ StringDictionary[WriteFn] {
  var debug: js.UndefOr[WriteFn] = js.native
  var error: js.UndefOr[WriteFn] = js.native
  var fatal: js.UndefOr[WriteFn] = js.native
  var info: js.UndefOr[WriteFn] = js.native
  var trace: js.UndefOr[WriteFn] = js.native
  var warn: js.UndefOr[WriteFn] = js.native
}

object DictlogLevel {
  @scala.inline
  def apply(): DictlogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictlogLevel]
  }
  @scala.inline
  implicit class DictlogLevelOps[Self <: DictlogLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: /* o */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* o */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFatal(value: /* o */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFatal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: /* o */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: /* o */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withWarn(value: /* o */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
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

