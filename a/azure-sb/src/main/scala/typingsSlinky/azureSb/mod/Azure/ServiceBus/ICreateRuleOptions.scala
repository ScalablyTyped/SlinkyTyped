package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateRuleOptions extends js.Object {
  var correlationIdFilter: String = js.native
  var falseFilter: String = js.native
  var sqlExpressionFilter: String = js.native
  var sqlRuleAction: String = js.native
  var trueFilter: String = js.native
}

object ICreateRuleOptions {
  @scala.inline
  def apply(
    correlationIdFilter: String,
    falseFilter: String,
    sqlExpressionFilter: String,
    sqlRuleAction: String,
    trueFilter: String
  ): ICreateRuleOptions = {
    val __obj = js.Dynamic.literal(correlationIdFilter = correlationIdFilter.asInstanceOf[js.Any], falseFilter = falseFilter.asInstanceOf[js.Any], sqlExpressionFilter = sqlExpressionFilter.asInstanceOf[js.Any], sqlRuleAction = sqlRuleAction.asInstanceOf[js.Any], trueFilter = trueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateRuleOptions]
  }
  @scala.inline
  implicit class ICreateRuleOptionsOps[Self <: ICreateRuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationIdFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationIdFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlExpressionFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExpressionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlRuleAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlRuleAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueFilter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

