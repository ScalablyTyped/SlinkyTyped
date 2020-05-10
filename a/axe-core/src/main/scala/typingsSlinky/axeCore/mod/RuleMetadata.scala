package typingsSlinky.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleMetadata extends js.Object {
  var description: String = js.native
  var help: String = js.native
  var helpUrl: String = js.native
  var ruleId: String = js.native
  var tags: js.Array[String] = js.native
}

object RuleMetadata {
  @scala.inline
  def apply(description: String, help: String, helpUrl: String, ruleId: String, tags: js.Array[String]): RuleMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMetadata]
  }
  @scala.inline
  implicit class RuleMetadataOps[Self <: RuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

