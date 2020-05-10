package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule to be applied in a Policy.
  */
@js.native
trait SchemaRule extends js.Object {
  /**
    * Required
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Additional restrictions that must be met. All conditions must pass for
    * the rule to match.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * Human-readable description of the rule.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If one or more &#39;in&#39; clauses are specified, the rule matches if
    * the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
    */
  var ins: js.UndefOr[js.Array[String]] = js.native
  /**
    * The config returned to callers of tech.iam.IAM.CheckPolicy for any
    * entries that match the LOG action.
    */
  var logConfigs: js.UndefOr[js.Array[SchemaLogConfig]] = js.native
  /**
    * If one or more &#39;not_in&#39; clauses are specified, the rule matches
    * if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
    */
  var notIns: js.UndefOr[js.Array[String]] = js.native
  /**
    * A permission is a string of form &#39;..&#39; (e.g.,
    * &#39;storage.buckets.list&#39;). A value of &#39;*&#39; matches all
    * permissions, and a verb part of &#39;*&#39; (e.g.,
    * &#39;storage.buckets.*&#39;) matches all verbs.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRule {
  @scala.inline
  def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  @scala.inline
  implicit class SchemaRuleOps[Self <: SchemaRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[SchemaCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConfigs(value: js.Array[SchemaLogConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withNotIns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIns")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
  }
  
}

