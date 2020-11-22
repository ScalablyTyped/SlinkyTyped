package typingsSlinky.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption extends js.Object {
  
  /**
    * Keyword defined by open source detection systems like Snort or Suricata for stateful rule inspection.
    * See [Snort General Rule Options](http://manual-snort-org.s3-website-us-east-1.amazonaws.com/node31.html) or [Suricata Rule Options](https://suricata.readthedocs.io/en/suricata-5.0.1/rules/intro.html#rule-options) for more details.
    */
  var keyword: String = js.native
  
  /**
    * Set of strings for additional settings to use in stateful rule inspection.
    */
  var settings: js.UndefOr[js.Array[String]] = js.native
}
object RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption {
  
  @scala.inline
  def apply(keyword: String): RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionOps[Self <: RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: String*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[String]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
