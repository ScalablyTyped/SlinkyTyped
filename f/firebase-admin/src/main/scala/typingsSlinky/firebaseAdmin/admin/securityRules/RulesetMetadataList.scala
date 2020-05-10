package typingsSlinky.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesetMetadataList extends js.Object {
  /**
    * The next page token if available. This is needed to retrieve the next batch.
    */
  val nextPageToken: js.UndefOr[String] = js.native
  /**
    * A batch of ruleset metadata.
    */
  val rulesets: js.Array[RulesetMetadata] = js.native
}

object RulesetMetadataList {
  @scala.inline
  def apply(rulesets: js.Array[RulesetMetadata]): RulesetMetadataList = {
    val __obj = js.Dynamic.literal(rulesets = rulesets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesetMetadataList]
  }
  @scala.inline
  implicit class RulesetMetadataListOps[Self <: RulesetMetadataList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesets(value: js.Array[RulesetMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

