package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartQueryExecutionInput extends js.Object {
  /**
    * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once). If another StartQueryExecution request is received, the same response is returned and another query is not created. If a parameter has changed, for example, the QueryString, an error is returned.  This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.native
  /**
    * The database within which the query executes.
    */
  var QueryExecutionContext: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecutionContext] = js.native
  /**
    * The SQL query statements to be executed.
    */
  var QueryString: typingsSlinky.awsSdk.athenaMod.QueryString = js.native
  /**
    * Specifies information about where and how to save the results of the query execution. If the query runs in a workgroup, then workgroup's settings may override query settings. This affects the query results location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var ResultConfiguration: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultConfiguration] = js.native
  /**
    * The name of the workgroup in which the query is being started.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object StartQueryExecutionInput {
  @scala.inline
  def apply(QueryString: QueryString): StartQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryExecutionInput]
  }
  @scala.inline
  implicit class StartQueryExecutionInputOps[Self <: StartQueryExecutionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryString(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
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

