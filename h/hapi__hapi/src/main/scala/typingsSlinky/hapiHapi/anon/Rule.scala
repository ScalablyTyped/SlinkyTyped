package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.hapiHapiStrings.`allow-from`
import typingsSlinky.hapiHapi.hapiHapiStrings.deny
import typingsSlinky.hapiHapi.hapiHapiStrings.sameorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * an object for specifying the 'allow-from' rule,
    */
  var rule: deny | sameorigin | `allow-from` = js.native
  /**
    * when rule is 'allow-from' this is used to form the rest of the header, otherwise this field is ignored. If rule is 'allow-from' but source is unset, the rule will be automatically changed
    * to 'sameorigin'.
    */
  var source: String = js.native
}

object Rule {
  @scala.inline
  def apply(rule: deny | sameorigin | `allow-from`, source: String): Rule = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: deny | sameorigin | `allow-from`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

