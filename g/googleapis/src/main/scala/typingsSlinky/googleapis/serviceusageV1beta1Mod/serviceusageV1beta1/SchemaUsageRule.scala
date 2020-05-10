package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Usage configuration rules for the service.  NOTE: Under development.   Use
  * this rule to configure unregistered calls for the service. Unregistered
  * calls are calls that do not contain consumer project identity. (Example:
  * calls that do not contain an API key). By default, API methods do not allow
  * unregistered calls, and each method call must be identified by a consumer
  * project identity. Use this rule to allow/disallow unregistered calls.
  * Example of an API that wants to allow unregistered calls for entire
  * service.      usage:       rules:       - selector: &quot;*&quot;
  * allow_unregistered_calls: true  Example of a method that wants to allow
  * unregistered calls.      usage:       rules:       - selector:
  * &quot;google.example.library.v1.LibraryService.CreateBook&quot;
  * allow_unregistered_calls: true
  */
@js.native
trait SchemaUsageRule extends js.Object {
  /**
    * If true, the selected method allows unregistered calls, e.g. calls that
    * don&#39;t identify any user or application.
    */
  var allowUnregisteredCalls: js.UndefOr[Boolean] = js.native
  /**
    * Selects the methods to which this rule applies. Use &#39;*&#39; to
    * indicate all methods in all APIs.  Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * If true, the selected method should skip service control and the control
    * plane features, such as quota and billing, will not be available. This
    * flag is used by Google Cloud Endpoints to bypass checks for internal
    * methods, such as service health check methods.
    */
  var skipServiceControl: js.UndefOr[Boolean] = js.native
}

object SchemaUsageRule {
  @scala.inline
  def apply(): SchemaUsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageRule]
  }
  @scala.inline
  implicit class SchemaUsageRuleOps[Self <: SchemaUsageRule] (val x: Self) extends AnyVal {
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

