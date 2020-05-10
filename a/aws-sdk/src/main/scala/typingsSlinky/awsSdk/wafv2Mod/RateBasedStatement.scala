package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedStatement extends js.Object {
  /**
    * Setting that indicates how to aggregate the request counts. Currently, you must set this to IP. The request counts are aggregated on IP addresses. 
    */
  var AggregateKeyType: RateBasedStatementAggregateKeyType = js.native
  /**
    * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a ScopDownStatement, this limit is applied only to the requests that match the statement.
    */
  var Limit: RateLimit = js.native
  /**
    * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement.
    */
  var ScopeDownStatement: js.UndefOr[Statement] = js.native
}

object RateBasedStatement {
  @scala.inline
  def apply(AggregateKeyType: RateBasedStatementAggregateKeyType, Limit: RateLimit): RateBasedStatement = {
    val __obj = js.Dynamic.literal(AggregateKeyType = AggregateKeyType.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedStatement]
  }
  @scala.inline
  implicit class RateBasedStatementOps[Self <: RateBasedStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateKeyType(value: RateBasedStatementAggregateKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: RateLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDownStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScopeDownStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeDownStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScopeDownStatement")(js.undefined)
        ret
    }
  }
  
}

