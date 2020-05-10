package typingsSlinky.reduxPromiseListener.mod.ReduxPromiseListener

import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var getError: js.UndefOr[js.Function1[/* action */ AnyAction, _]] = js.native
  var getPayload: js.UndefOr[js.Function1[/* action */ AnyAction, _]] = js.native
  var reject: String | ActionMatcher = js.native
  var resolve: String | ActionMatcher = js.native
  var setPayload: js.UndefOr[js.Function2[/* action */ AnyAction, /* payload */ js.Any, AnyAction]] = js.native
  var start: String = js.native
}

object Config {
  @scala.inline
  def apply(reject: String | ActionMatcher, resolve: String | ActionMatcher, start: String): Config = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRejectFunction1(value: /* action */ AnyAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReject(value: String | ActionMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveFunction1(value: /* action */ AnyAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve(value: String | ActionMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetError(value: /* action */ AnyAction => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPayload(value: /* action */ AnyAction => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPayload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPayload(value: (/* action */ AnyAction, /* payload */ js.Any) => AnyAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPayload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPayload")(js.undefined)
        ret
    }
  }
  
}

