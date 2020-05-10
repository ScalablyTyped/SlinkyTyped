package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteCondition defines a readiness condition for a Route.
  */
@js.native
trait SchemaRouteCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    * +optional
    */
  var lastTransitionTime: js.UndefOr[String] = js.native
  /**
    * Human-readable message indicating details about last transition.
    * +optional
    */
  var message: js.UndefOr[String] = js.native
  /**
    * One-word CamelCase reason for the condition&#39;s last transition.
    * +optional
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Status of the condition, one of &quot;True&quot;, &quot;False&quot;,
    * &quot;Unknown&quot;.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * RouteConditionType is used to communicate the status of the
    * reconciliation process. See also:
    * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-reporting
    * Types include: &quot;Ready&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRouteCondition {
  @scala.inline
  def apply(): SchemaRouteCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteCondition]
  }
  @scala.inline
  implicit class SchemaRouteConditionOps[Self <: SchemaRouteCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastTransitionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTransitionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastTransitionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTransitionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

