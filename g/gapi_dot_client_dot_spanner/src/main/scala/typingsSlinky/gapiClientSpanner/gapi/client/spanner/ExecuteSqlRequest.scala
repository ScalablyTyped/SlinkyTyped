package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSqlRequest extends js.Object {
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type
    * from a JSON value.  For example, values of type `BYTES` and values
    * of type `STRING` both appear in params as JSON strings.
    *
    * In these cases, `param_types` can be used to specify the exact
    * SQL type for some or all of the SQL query parameters. See the
    * definition of Type for more information
    * about SQL types.
    */
  var paramTypes: js.UndefOr[Record[String, Type]] = js.native
  /**
    * The SQL query string can contain parameter placeholders. A parameter
    * placeholder consists of `'@'` followed by the parameter
    * name. Parameter names consist of any combination of letters,
    * numbers, and underscores.
    *
    * Parameters can appear anywhere that a literal value is expected.  The same
    * parameter name can be used more than once, for example:
    * `"WHERE id > @msg_id AND id < @msg_id + 100"`
    *
    * It is an error to execute an SQL query with unbound parameters.
    *
    * Parameter values are specified using `params`, which is a JSON
    * object whose keys are parameter names, and whose values are the
    * corresponding parameter values.
    */
  var params: js.UndefOr[Record[String, _]] = js.native
  /**
    * Used to control the amount of debugging information returned in
    * ResultSetStats.
    */
  var queryMode: js.UndefOr[String] = js.native
  /**
    * If this request is resuming a previously interrupted SQL query
    * execution, `resume_token` should be copied from the last
    * PartialResultSet yielded before the interruption. Doing this
    * enables the new SQL query execution to resume where the last one left
    * off. The rest of the request parameters must exactly match the
    * request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /** Required. The SQL query string. */
  var sql: js.UndefOr[String] = js.native
  /**
    * The transaction to use. If none is provided, the default is a
    * temporary read-only transaction with strong concurrency.
    */
  var transaction: js.UndefOr[TransactionSelector] = js.native
}

object ExecuteSqlRequest {
  @scala.inline
  def apply(): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
  @scala.inline
  implicit class ExecuteSqlRequestOps[Self <: ExecuteSqlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParamTypes(value: Record[String, Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: Record[String, _]): Self = {
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
    def withQueryMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMode")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: TransactionSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

