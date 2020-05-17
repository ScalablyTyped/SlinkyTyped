package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.HookError
import typingsSlinky.octokitRest.mod.Octokit.HookOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  def after(name: String, callback: js.Function2[/* response */ Response[_], /* options */ HookOptions, Unit]): Unit = js.native
  def before(name: String, callback: js.Function1[/* options */ HookOptions, Unit]): Unit = js.native
  def error(name: String, callback: js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]): Unit = js.native
  def wrap(
    name: String,
    callback: js.Function2[
      /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[_]]], 
      /* options */ HookOptions, 
      Unit
    ]
  ): Unit = js.native
}

object After {
  @scala.inline
  def apply(
    after: (String, js.Function2[/* response */ Response[_], /* options */ HookOptions, Unit]) => Unit,
    before: (String, js.Function1[/* options */ HookOptions, Unit]) => Unit,
    error: (String, js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]) => Unit,
    wrap: (String, js.Function2[
      /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[_]]], 
      /* options */ HookOptions, 
      Unit
    ]) => Unit
  ): After = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), before = js.Any.fromFunction2(before), error = js.Any.fromFunction2(error), wrap = js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: (String, js.Function2[/* response */ Response[_], /* options */ HookOptions, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBefore(value: (String, js.Function1[/* options */ HookOptions, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withError(value: (String, js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWrap(
      value: (String, js.Function2[
          /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[_]]], 
          /* options */ HookOptions, 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

