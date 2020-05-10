package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogExclusion extends js.Object {
  /** Optional. A description of this exclusion. */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can use exclusions.patch to change the value of
    * this field.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Required. An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the
    * matching log entries. For example, the following filter matches 99% of low-severity log entries from load balancers:
    * "resource.type=http_load_balancer severity<ERROR sample(insertId, 0.99)"
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Required. A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters,
    * digits, underscores, hyphens, and periods.
    */
  var name: js.UndefOr[String] = js.native
}

object LogExclusion {
  @scala.inline
  def apply(): LogExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogExclusion]
  }
  @scala.inline
  implicit class LogExclusionOps[Self <: LogExclusion] (val x: Self) extends AnyVal {
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
  }
  
}

