package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateRuleOptions> */
@js.native
trait CreateRuleOptions extends js.Object {
  var correlationIdFilter: js.UndefOr[String] = js.native
  var falseFilter: js.UndefOr[String] = js.native
  var sqlExpressionFilter: js.UndefOr[String] = js.native
  var sqlRuleAction: js.UndefOr[String] = js.native
  var trueFilter: js.UndefOr[String] = js.native
}

object CreateRuleOptions {
  @scala.inline
  def apply(): CreateRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleOptions]
  }
  @scala.inline
  implicit class CreateRuleOptionsOps[Self <: CreateRuleOptions] (val x: Self) extends AnyVal {
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
    def withoutCorrelationIdFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationIdFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFalseFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlExpressionFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExpressionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlExpressionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExpressionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlRuleAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlRuleAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlRuleAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlRuleAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueFilter")(js.undefined)
        ret
    }
  }
  
}

