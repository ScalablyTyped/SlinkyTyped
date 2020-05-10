package typingsSlinky.jqueryAjaxfile.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
@js.native
trait ITest extends IRunnable {
  var parent: ISuite = js.native
  var pending: Boolean = js.native
  def fullTitle(): String = js.native
}

object ITest {
  @scala.inline
  def apply(
    async: Boolean,
    fn: js.Function,
    fullTitle: () => String,
    parent: ISuite,
    pending: Boolean,
    sync: Boolean,
    timedOut: Boolean,
    title: String
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], fullTitle = js.Any.fromFunction0(fullTitle), parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITest]
  }
  @scala.inline
  implicit class ITestOps[Self <: ITest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: ISuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

