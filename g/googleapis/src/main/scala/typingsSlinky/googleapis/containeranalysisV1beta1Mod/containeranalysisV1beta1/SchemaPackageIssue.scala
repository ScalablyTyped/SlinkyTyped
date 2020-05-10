package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message wraps a location affected by a vulnerability and its
  * associated fix (if one is available).
  */
@js.native
trait SchemaPackageIssue extends js.Object {
  /**
    * Required. The location of the vulnerability.
    */
  var affectedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  /**
    * The location of the available fix for vulnerability.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  /**
    * Deprecated, use Details.effective_severity instead The severity (e.g.,
    * distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String] = js.native
}

object SchemaPackageIssue {
  @scala.inline
  def apply(): SchemaPackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageIssue]
  }
  @scala.inline
  implicit class SchemaPackageIssueOps[Self <: SchemaPackageIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedLocation(value: SchemaVulnerabilityLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedLocation(value: SchemaVulnerabilityLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityName")(js.undefined)
        ret
    }
  }
  
}

