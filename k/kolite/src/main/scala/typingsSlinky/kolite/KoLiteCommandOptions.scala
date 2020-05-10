package typingsSlinky.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoLiteCommandOptions extends js.Object {
  var canExecute: js.UndefOr[js.Function1[/* isExecuting */ Boolean, _]] = js.native
  def execute(args: js.Any*): js.Any = js.native
}

object KoLiteCommandOptions {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
  @scala.inline
  implicit class KoLiteCommandOptionsOps[Self <: KoLiteCommandOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanExecute(value: /* isExecuting */ Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExecute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExecute")(js.undefined)
        ret
    }
  }
  
}

