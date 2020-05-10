package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecReleaseType contains the options for slowly releasing revisions.
  * See ServiceSpec for more details.  Not currently supported by Cloud Run.
  */
@js.native
trait SchemaServiceSpecReleaseType extends js.Object {
  /**
    * The configuration for this service. All revisions from this service must
    * come from a single configuration.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.native
  /**
    * Revisions is an ordered list of 1 or 2 revisions. The first is the
    * current revision, and the second is the candidate revision. If a single
    * revision is provided, traffic will be pinned at that revision.
    * &quot;@latest&quot; is a shortcut for usage that refers to the latest
    * created revision by the configuration.
    */
  var revisions: js.UndefOr[js.Array[String]] = js.native
  /**
    * RolloutPercent is the percent of traffic that should be sent to the
    * candidate revision, i.e. the 2nd revision in the revisions list. Valid
    * values are between 0 and 99 inclusive.
    */
  var rolloutPercent: js.UndefOr[Double] = js.native
}

object SchemaServiceSpecReleaseType {
  @scala.inline
  def apply(): SchemaServiceSpecReleaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecReleaseType]
  }
  @scala.inline
  implicit class SchemaServiceSpecReleaseTypeOps[Self <: SchemaServiceSpecReleaseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: SchemaConfigurationSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(js.undefined)
        ret
    }
    @scala.inline
    def withRolloutPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloutPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolloutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloutPercent")(js.undefined)
        ret
    }
  }
  
}

