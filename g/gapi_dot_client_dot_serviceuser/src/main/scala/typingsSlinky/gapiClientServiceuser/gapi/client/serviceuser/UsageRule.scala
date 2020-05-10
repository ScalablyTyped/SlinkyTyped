package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRule extends js.Object {
  /** True, if the method allows unregistered calls; false otherwise. */
  var allowUnregisteredCalls: js.UndefOr[Boolean] = js.native
  /**
    * Selects the methods to which this rule applies. Use '&#42;' to indicate all
    * methods in all APIs.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * True, if the method should skip service control. If so, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var skipServiceControl: js.UndefOr[Boolean] = js.native
}

object UsageRule {
  @scala.inline
  def apply(): UsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRule]
  }
  @scala.inline
  implicit class UsageRuleOps[Self <: UsageRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnregisteredCalls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnregisteredCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnregisteredCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnregisteredCalls")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipServiceControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipServiceControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipServiceControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipServiceControl")(js.undefined)
        ret
    }
  }
  
}

