package typingsSlinky.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Event context extension for tasks + transactions;
// See: http://vitaly-t.github.io/pg-promise/global.html#TaskContext
@js.native
trait ITaskContext extends js.Object {
  val connected: Boolean = js.native
  // these are set in the beginning of each task/transaction:
  val context: js.Any = js.native
  val dc: js.Any = js.native
  val duration: js.UndefOr[Double] = js.native
  // these are set at the end of each task/transaction:
  val finish: js.UndefOr[js.Date] = js.native
  val inTransaction: Boolean = js.native
  val isTX: Boolean = js.native
  val level: Double = js.native
  val parent: ITaskContext | Null = js.native
  val result: js.UndefOr[js.Any] = js.native
  val start: js.Date = js.native
  val success: js.UndefOr[Boolean] = js.native
  val tag: js.Any = js.native
  // this exists only inside transactions (isTX = true):
  val txLevel: js.UndefOr[Double] = js.native
  val useCount: Double = js.native
}

object ITaskContext {
  @scala.inline
  def apply(
    connected: Boolean,
    context: js.Any,
    dc: js.Any,
    inTransaction: Boolean,
    isTX: Boolean,
    level: Double,
    start: js.Date,
    tag: js.Any,
    useCount: Double
  ): ITaskContext = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], inTransaction = inTransaction.asInstanceOf[js.Any], isTX = isTX.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], useCount = useCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskContext]
  }
  @scala.inline
  implicit class ITaskContextOps[Self <: ITaskContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInTransaction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFinish(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: ITaskContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTxLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txLevel")(js.undefined)
        ret
    }
  }
  
}

