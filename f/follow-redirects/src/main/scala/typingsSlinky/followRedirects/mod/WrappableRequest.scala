package typingsSlinky.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappableRequest extends js.Object {
  var abort: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var flushHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var getHeader: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var setNoDelay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var setSocketKeepAlive: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var setTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  def removeHeader(args: js.Any*): js.Any = js.native
  def setHeader(args: js.Any*): js.Any = js.native
}

object WrappableRequest {
  @scala.inline
  def apply(removeHeader: /* repeated */ js.Any => js.Any, setHeader: /* repeated */ js.Any => js.Any): WrappableRequest = {
    val __obj = js.Dynamic.literal(removeHeader = js.Any.fromFunction1(removeHeader), setHeader = js.Any.fromFunction1(setHeader))
    __obj.asInstanceOf[WrappableRequest]
  }
  @scala.inline
  implicit class WrappableRequestOps[Self <: WrappableRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveHeader(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeader(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAbort(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withFlushHeaders(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFlushHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeader(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNoDelay(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNoDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSocketKeepAlive(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSocketKeepAlive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSocketKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSocketKeepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimeout(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.undefined)
        ret
    }
  }
  
}

