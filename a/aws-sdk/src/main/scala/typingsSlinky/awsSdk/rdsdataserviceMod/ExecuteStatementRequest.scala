package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementRequest extends js.Object {
  /**
    * A value that indicates whether to continue running the statement after the call times out. By default, the statement stops running when the call times out.  For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement terminates before it is finished running, it can result in errors and possibly corrupted data structures. 
    */
  var continueAfterTimeout: js.UndefOr[Boolean] = js.native
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  /**
    * A value that indicates whether to include metadata in the results.
    */
  var includeResultMetadata: js.UndefOr[Boolean] = js.native
  /**
    * The parameters for the SQL statement.
    */
  var parameters: js.UndefOr[SqlParametersList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn = js.native
  /**
    * Options that control how the result set is returned.
    */
  var resultSetOptions: js.UndefOr[ResultSetOptions] = js.native
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.native
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn = js.native
  /**
    * The SQL statement to run.
    */
  var sql: SqlStatement = js.native
  /**
    * The identifier of a transaction that was started by using the BeginTransaction operation. Specify the transaction ID of the transaction that you want to include the SQL statement in. If the SQL statement is not part of a transaction, don't set this parameter.
    */
  var transactionId: js.UndefOr[Id] = js.native
}

object ExecuteStatementRequest {
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, sql: SqlStatement): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  @scala.inline
  implicit class ExecuteStatementRequestOps[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSql(value: SqlStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueAfterTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueAfterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueAfterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueAfterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: DbName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResultMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResultMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResultMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResultMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: SqlParametersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSetOptions(value: ResultSetOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: DbName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
  }
  
}

