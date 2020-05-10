package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A backend rule provides configuration for an individual API element.
  */
@js.native
trait SchemaBackendRule extends js.Object {
  /**
    * The address of the API backend.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5
    * seconds.
    */
  var deadline: js.UndefOr[Double] = js.native
  /**
    * The JWT audience is used when generating a JWT id token for the backend.
    */
  var jwtAudience: js.UndefOr[String] = js.native
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[Double] = js.native
  /**
    * The number of seconds to wait for the completion of a long running
    * operation. The default is no deadline.
    */
  var operationDeadline: js.UndefOr[Double] = js.native
  var pathTranslation: js.UndefOr[String] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaBackendRule {
  @scala.inline
  def apply(): SchemaBackendRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendRule]
  }
  @scala.inline
  implicit class SchemaBackendRuleOps[Self <: SchemaBackendRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(js.undefined)
        ret
    }
    @scala.inline
    def withJwtAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwtAudience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwtAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwtAudience")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeadline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationDeadline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationDeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationDeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withPathTranslation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTranslation")(js.undefined)
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
  }
  
}

