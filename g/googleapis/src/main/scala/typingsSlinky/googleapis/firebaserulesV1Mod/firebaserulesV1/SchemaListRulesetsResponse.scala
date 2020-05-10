package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.ListRulesets.
  */
@js.native
trait SchemaListRulesetsResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of `Ruleset` instances.
    */
  var rulesets: js.UndefOr[js.Array[SchemaRuleset]] = js.native
}

object SchemaListRulesetsResponse {
  @scala.inline
  def apply(): SchemaListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRulesetsResponse]
  }
  @scala.inline
  implicit class SchemaListRulesetsResponseOps[Self <: SchemaListRulesetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRulesets(value: js.Array[SchemaRuleset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesets")(js.undefined)
        ret
    }
  }
  
}

