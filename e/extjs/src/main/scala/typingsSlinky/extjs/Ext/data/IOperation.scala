package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Property] (RegExp) */
  var actionCommitRecordsRe: js.UndefOr[js.RegExp] = js.native
  /** [Property] (RegExp) */
  var actionSkipSyncRe: js.UndefOr[js.RegExp] = js.native
  /** [Method] Checks whether this operation should cause writing to occur
  		* @returns Boolean Whether the operation should cause a write to occur.
  		*/
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.native
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  /** [Method] This method is called to commit data to this instance s records given the records in the server response
  		* @param serverRecords Ext.data.Model[] An array of Ext.data.Model objects returned by the server.
  		*/
  var commitRecords: js.UndefOr[js.Function1[/* serverRecords */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns the error string or object that was set using setException
  		* @returns String/Object The error object
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the records associated with this operation
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the ResultSet object if set by the Proxy
  		* @returns Ext.data.ResultSet The ResultSet object
  		*/
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.native
  /** [Config Option] (Ext.util.Grouper[]) */
  var groupers: js.UndefOr[Array] = js.native
  /** [Method] Returns true if this Operation encountered an exception see also getError
  		* @returns Boolean True if there was an exception
  		*/
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been completed
  		* @returns Boolean True if the Operation is complete
  		*/
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started but has not yet completed
  		* @returns Boolean True if the Operation is currently running
  		*/
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started
  		* @returns Boolean True if the Operation has started
  		*/
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as having experienced an exception
  		* @param error String/Object error string/object
  		*/
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.native
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the Operation has completed and was successful
  		* @returns Boolean True if successful
  		*/
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IOperation {
  @scala.inline
  def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  @scala.inline
  implicit class IOperationOps[Self <: IOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActionCommitRecordsRe(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCommitRecordsRe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCommitRecordsRe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCommitRecordsRe")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSkipSyncRe(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSkipSyncRe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionSkipSyncRe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSkipSyncRe")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowWrite(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWrite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAllowWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch(value: IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitRecords(value: /* serverRecords */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCommitRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetError(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResultSet(value: () => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResultSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetResultSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResultSet")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupers(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupers")(js.undefined)
        ret
    }
    @scala.inline
    def withHasException(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComplete(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRunning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStarted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCompleted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withSetException(value: /* error */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setException")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSuccessful(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessful")(js.undefined)
        ret
    }
    @scala.inline
    def withSorters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withWasSuccessful(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasSuccessful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWasSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasSuccessful")(js.undefined)
        ret
    }
  }
  
}

