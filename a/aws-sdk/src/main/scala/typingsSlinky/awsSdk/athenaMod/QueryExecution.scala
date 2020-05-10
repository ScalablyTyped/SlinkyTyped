package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecution extends js.Object {
  /**
    * The SQL query statements which the query execution ran.
    */
  var Query: js.UndefOr[QueryString] = js.native
  /**
    * The database in which the query execution occurred.
    */
  var QueryExecutionContext: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecutionContext] = js.native
  /**
    * The unique identifier for each query execution.
    */
  var QueryExecutionId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecutionId] = js.native
  /**
    * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup.
    */
  var ResultConfiguration: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultConfiguration] = js.native
  /**
    * The type of query statement that was run. DDL indicates DDL query statements. DML indicates DML (Data Manipulation Language) query statements, such as CREATE TABLE AS SELECT. UTILITY indicates query statements other than DDL and DML, such as SHOW CREATE TABLE, or DESCRIBE &lt;table&gt;.
    */
  var StatementType: js.UndefOr[typingsSlinky.awsSdk.athenaMod.StatementType] = js.native
  /**
    * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.
    */
  var Statistics: js.UndefOr[QueryExecutionStatistics] = js.native
  /**
    * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  var Status: js.UndefOr[QueryExecutionStatus] = js.native
  /**
    * The name of the workgroup in which the query ran.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object QueryExecution {
  @scala.inline
  def apply(): QueryExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecution]
  }
  @scala.inline
  implicit class QueryExecutionOps[Self <: QueryExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryExecutionContext(value: QueryExecutionContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryExecutionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionContext")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryExecutionId(value: QueryExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withResultConfiguration(value: ResultConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementType(value: StatementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: QueryExecutionStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: QueryExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkGroup(value: WorkGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(js.undefined)
        ret
    }
  }
  
}

