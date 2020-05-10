package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPollingOptions extends js.Object {
  /**
    * An array of diagnostics to be collected by Deployment Manager, these
    * diagnostics will be displayed to the user.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostic]] = js.native
  /**
    * JsonPath expression that determines if the request failed.
    */
  var failCondition: js.UndefOr[String] = js.native
  /**
    * JsonPath expression that determines if the request is completed.
    */
  var finishCondition: js.UndefOr[String] = js.native
  /**
    * JsonPath expression that evaluates to string, it indicates where to poll.
    */
  var pollingLink: js.UndefOr[String] = js.native
  /**
    * JsonPath expression, after polling is completed, indicates where to fetch
    * the resource.
    */
  var targetLink: js.UndefOr[String] = js.native
}

object SchemaPollingOptions {
  @scala.inline
  def apply(): SchemaPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingOptions]
  }
  @scala.inline
  implicit class SchemaPollingOptionsOps[Self <: SchemaPollingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnostics(value: js.Array[SchemaDiagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withFailCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLink")(js.undefined)
        ret
    }
  }
  
}

