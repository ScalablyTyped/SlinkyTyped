package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Release` is a named reference to a `Ruleset`. Once a `Release` refers to a
  * `Ruleset`, rules-enabled services will be able to enforce the `Ruleset`.
  */
@js.native
trait SchemaRelease extends js.Object {
  /**
    * Time the release was created. Output only.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Resource name for the `Release`.  `Release` names may be structured
    * `app1/prod/v2` or flat `app1_prod_v2` which affords developers a great
    * deal of flexibility in mapping the name to the style that best fits their
    * existing development practices. For example, a name could refer to an
    * environment, an app, a version, or some combination of three.  In the
    * table below, for the project name `projects/foo`, the following relative
    * release paths show how flat and structured names might be chosen to match
    * a desired development / deployment strategy.  Use Case     | Flat Name |
    * Structured Name -------------|---------------------|----------------
    * Environments | releases/qa         | releases/qa Apps         |
    * releases/app1_qa    | releases/app1/qa Versions     | releases/app1_v2_qa
    * | releases/app1/v2/qa  The delimiter between the release name path
    * elements can be almost anything and it should work equally well with the
    * release name list filter, but in many ways the structured paths provide a
    * clearer picture of the relationship between `Release` instances.  Format:
    * `projects/{project_id}/releases/{release_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must
    * exist the `Release` to be created.
    */
  var rulesetName: js.UndefOr[String] = js.native
  /**
    * Time the release was updated. Output only.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaRelease {
  @scala.inline
  def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  @scala.inline
  implicit class SchemaReleaseOps[Self <: SchemaRelease] (val x: Self) extends AnyVal {
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
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

