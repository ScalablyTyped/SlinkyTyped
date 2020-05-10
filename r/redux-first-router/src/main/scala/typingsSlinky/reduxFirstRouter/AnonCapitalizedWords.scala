package typingsSlinky.reduxFirstRouter

import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.reduxFirstRouter.mod.ConfirmLeave
import typingsSlinky.reduxFirstRouter.mod.Meta
import typingsSlinky.reduxFirstRouter.mod.Nullable
import typingsSlinky.reduxFirstRouter.mod.RouteThunk
import typingsSlinky.reduxFirstRouter.mod.StateGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCapitalizedWords[TState] extends js.Object {
  var capitalizedWords: js.UndefOr[Boolean] = js.native
  var coerceNumbers: js.UndefOr[Boolean] = js.native
  var confirmLeave: js.UndefOr[ConfirmLeave] = js.native
  var fromPath: js.UndefOr[js.Function2[/* path */ String, /* key */ js.UndefOr[String], String]] = js.native
  var meta: js.UndefOr[Meta] = js.native
  var navKey: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var thunk: js.UndefOr[RouteThunk[TState]] = js.native
  var toPath: js.UndefOr[js.Function2[/* param */ String, /* key */ js.UndefOr[String], String]] = js.native
}

object AnonCapitalizedWords {
  @scala.inline
  def apply[TState](): AnonCapitalizedWords[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCapitalizedWords[TState]]
  }
  @scala.inline
  implicit class AnonCapitalizedWordsOps[Self[tstate] <: AnonCapitalizedWords[tstate], TState] (val x: Self[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TState] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TState] with Other]
    @scala.inline
    def withCapitalizedWords(value: Boolean): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalizedWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapitalizedWords: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalizedWords")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerceNumbers(value: Boolean): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerceNumbers: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmLeave(value: (/* state */ js.Object, /* action */ js.Object) => Nullable[String]): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConfirmLeave: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withFromPath(value: (/* path */ String, /* key */ js.UndefOr[String]) => String): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFromPath: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: Meta): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withNavKey(value: String): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavKey: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withThunk(
      value: (/* dispatch */ Dispatch[js.Any], /* getState */ StateGetter[TState]) => js.Any | js.Promise[js.Any]
    ): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thunk")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThunk: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thunk")(js.undefined)
        ret
    }
    @scala.inline
    def withToPath(value: (/* param */ String, /* key */ js.UndefOr[String]) => String): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToPath: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPath")(js.undefined)
        ret
    }
  }
  
}

