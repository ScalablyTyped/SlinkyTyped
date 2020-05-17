package typingsSlinky.jsonRulesEngine.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionProperties extends NestedCondition {
  var fact: String = js.native
  var operator: String = js.native
  var params: js.UndefOr[Record[String, _]] = js.native
  var path: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var value: typingsSlinky.jsonRulesEngine.anon.Fact | js.Any = js.native
}

object ConditionProperties {
  @scala.inline
  def apply(fact: String, operator: String, value: typingsSlinky.jsonRulesEngine.anon.Fact | js.Any): ConditionProperties = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionProperties]
  }
  @scala.inline
  implicit class ConditionPropertiesOps[Self <: ConditionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: typingsSlinky.jsonRulesEngine.anon.Fact | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

