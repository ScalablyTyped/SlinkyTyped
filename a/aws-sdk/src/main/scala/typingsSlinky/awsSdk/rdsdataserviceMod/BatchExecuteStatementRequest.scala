package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchExecuteStatementRequest extends js.Object {
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  /**
    * The parameter set for the batch operation. The maximum number of parameters in a parameter set is 1,000.
    */
  var parameterSets: js.UndefOr[SqlParameterSets] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn = js.native
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

object BatchExecuteStatementRequest {
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, sql: SqlStatement): BatchExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchExecuteStatementRequest]
  }
  @scala.inline
  implicit class BatchExecuteStatementRequestOps[Self <: BatchExecuteStatementRequest] (val x: Self) extends AnyVal {
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
    def withParameterSets(value: SqlParameterSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterSets")(js.undefined)
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

