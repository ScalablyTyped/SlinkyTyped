package typingsSlinky.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required metadata associated with a ruleset.
  */
@js.native
trait RulesetMetadata extends js.Object {
  /**
    * Creation time of the `Ruleset` as a UTC timestamp string.
    */
  val createTime: String = js.native
  /**
    * Name of the `Ruleset` as a short string. This can be directly passed into APIs
    * like [`securityRules.getRuleset()`](admin.securityRules.SecurityRules#getRuleset)
    * and [`securityRules.deleteRuleset()`](admin.securityRules.SecurityRules#deleteRuleset).
    */
  val name: String = js.native
}

object RulesetMetadata {
  @scala.inline
  def apply(createTime: String, name: String): RulesetMetadata = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesetMetadata]
  }
  @scala.inline
  implicit class RulesetMetadataOps[Self <: RulesetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

