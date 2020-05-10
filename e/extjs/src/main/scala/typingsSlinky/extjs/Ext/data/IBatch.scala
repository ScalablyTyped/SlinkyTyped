package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatch extends IObservable {
  /** [Method] Adds a new operation to this batch at the end of the operations array
  		* @param operation Object The Operation object
  		* @returns Ext.data.Batch this
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.native
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[Array] = js.native
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.native
  /** [Method] Pauses execution of the batch but does not cancel the current operation
  		* @returns Ext.data.Batch this
  		*/
  var pause: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.native
  /** [Method] Kicks off execution of the batch continuing from the current operation
  		* @returns Ext.data.Batch this
  		*/
  var retry: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Executes an operation by its numeric index in the operations array
  		* @param index Number The operation index to run
  		* @returns Ext.data.Batch this
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
  		* @param index Object
  		* @returns Ext.data.Batch this
  		*/
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.native
}

object IBatch {
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  @scala.inline
  implicit class IBatchOps[Self <: IBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* operation */ js.UndefOr[js.Any] => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptions(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHasException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: () => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnException")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: () => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOperation(value: /* index */ js.UndefOr[Double] => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOperation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRunOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* index */ js.UndefOr[js.Any] => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

