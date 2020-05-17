package typingsSlinky.jqueryAjaxfile.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
@js.native
trait IRunnable extends js.Object {
  var async: Boolean = js.native
  var fn: js.Function = js.native
  var sync: Boolean = js.native
  var timedOut: Boolean = js.native
  var title: String = js.native
}

object IRunnable {
  @scala.inline
  def apply(async: Boolean, fn: js.Function, sync: Boolean, timedOut: Boolean, title: String): IRunnable = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunnable]
  }
  @scala.inline
  implicit class IRunnableOps[Self <: IRunnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

