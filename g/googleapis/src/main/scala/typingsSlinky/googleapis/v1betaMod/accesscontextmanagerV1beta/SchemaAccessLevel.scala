package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `AccessLevel` is a label that can be applied to requests to GCP
  * services, along with a list of requirements necessary for the label to be
  * applied.
  */
@js.native
trait SchemaAccessLevel extends js.Object {
  /**
    * A `BasicLevel` composed of `Conditions`.
    */
  var basic: js.UndefOr[SchemaBasicLevel] = js.native
  /**
    * Output only. Time the `AccessLevel` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Description of the `AccessLevel` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the Access Level. The `short_name` component
    * must begin with a letter and only include alphanumeric and &#39;_&#39;.
    * Format: `accessPolicies/{policy_id}/accessLevels/{short_name}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. Time the `AccessLevel` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAccessLevel {
  @scala.inline
  def apply(): SchemaAccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessLevel]
  }
  @scala.inline
  implicit class SchemaAccessLevelOps[Self <: SchemaAccessLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasic(value: SchemaBasicLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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

