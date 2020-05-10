package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.MappingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesConfigurationType extends js.Object {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.Array[MappingRule] | js.Iterable[MappingRule] = js.native
}

object RulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[MappingRule] | js.Iterable[MappingRule]): RulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigurationType]
  }
  @scala.inline
  implicit class RulesConfigurationTypeOps[Self <: RulesConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesIterable(value: js.Iterable[MappingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[MappingRule] | js.Iterable[MappingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

