package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a set of log entries that are not to be stored in Logging. If
  * your project receives a large volume of logs, you might be able to use
  * exclusions to reduce your chargeable logs. Exclusions are processed after
  * log sinks, so you can export log entries before they are excluded. Audit
  * log entries and log entries from Amazon Web Services are never excluded.
  */
@js.native
trait SchemaLogExclusion extends js.Object {
  /**
    * Output only. The creation timestamp of the exclusion.This field may not
    * be present for older exclusions.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional. A description of this exclusion.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not
    * exclude any log entries. You can update an exclusion to change the value
    * of this field.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Required. An advanced logs filter that matches the log entries to be
    * excluded. By using the sample function, you can exclude less than 100% of
    * the matching log entries. For example, the following filter matches 99%
    * of low-severity log entries from load
    * balancers:&quot;resource.type=http_load_balancer severity&lt;ERROR
    * sample(insertId, 0.99)&quot;
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Required. A client-assigned identifier, such as
    * &quot;load-balancer-exclusion&quot;. Identifiers are limited to 100
    * characters and can include only letters, digits, underscores, hyphens,
    * and periods.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The last update timestamp of the exclusion.This field may
    * not be present for older exclusions.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaLogExclusion {
  @scala.inline
  def apply(): SchemaLogExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogExclusion]
  }
  @scala.inline
  implicit class SchemaLogExclusionOps[Self <: SchemaLogExclusion] (val x: Self) extends AnyVal {
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
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

