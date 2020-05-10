package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information regarding the outcome of a successful connection.executeMany().
  */
@js.native
trait Results[T] extends js.Object {
  /**
    * An array of error objects that were reported during execution.
    *
    * The offset property of each error object corresponds to the 0-based index of the executeMany()
    * binds parameter array, indicating which record could not be processed.
    *
    * It will be present only if batchErrors was true in the executeMany() options parameter and there are
    * data errors to report. Some classes of execution error will always return via the executeMany()
    * callback error object, not in batchErrors.
    */
  var batchErrors: js.UndefOr[js.Array[DBError]] = js.native
  /**
    * An array of integers identifying the number of rows affected by each record of the binds parameter.
    *
    * It is present only if dmlRowCounts was true in the executeMany() options parameter and a DML statement
    * was executed.
    */
  var dmlRowCounts: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Contains the value of any returned IN OUT or OUT binds. It is an array of arrays, or an array of objects,
    * depending on the binds parameters structure. The length of the array will correspond to the length of
    * the array passed as the binds parameter. It will be present only if there is at least one OUT bind
    * variable identified.
    */
  var outBinds: js.UndefOr[js.Array[T]] = js.native
  /**
    * An integer identifying the total number of database rows affected by the processing of all records
    * of the binds parameter. It is only present if a DML statement was executed.
    */
  var rowsAffected: js.UndefOr[Double] = js.native
}

object Results {
  @scala.inline
  def apply[T](): Results[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Results[T]]
  }
  @scala.inline
  implicit class ResultsOps[Self[t] <: Results[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBatchErrors(value: js.Array[DBError]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchErrors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withDmlRowCounts(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmlRowCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDmlRowCounts: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmlRowCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutBinds(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outBinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutBinds: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outBinds")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsAffected(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsAffected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(js.undefined)
        ret
    }
  }
  
}

