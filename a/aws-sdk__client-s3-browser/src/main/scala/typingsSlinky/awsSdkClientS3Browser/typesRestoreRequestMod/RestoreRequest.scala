package typingsSlinky.awsSdkClientS3Browser.typesRestoreRequestMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Bulk
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Expedited
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SELECT
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Standard_
import typingsSlinky.awsSdkClientS3Browser.typesGlacierJobParametersMod.GlacierJobParameters
import typingsSlinky.awsSdkClientS3Browser.typesOutputLocationMod.OutputLocation
import typingsSlinky.awsSdkClientS3Browser.typesSelectParametersMod.SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreRequest extends js.Object {
  /**
    * <p>Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.</p>
    */
  var Days: js.UndefOr[Double] = js.native
  /**
    * <p>The optional description for the job.</p>
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  var GlacierJobParameters: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesGlacierJobParametersMod.GlacierJobParameters
  ] = js.native
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  var OutputLocation: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesOutputLocationMod.OutputLocation] = js.native
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  var SelectParameters: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesSelectParametersMod.SelectParameters] = js.native
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: js.UndefOr[Standard_ | Bulk | Expedited | String] = js.native
  /**
    * <p>Type of restore request.</p>
    */
  var Type: js.UndefOr[SELECT | String] = js.native
}

object RestoreRequest {
  @scala.inline
  def apply(): RestoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreRequest]
  }
  @scala.inline
  implicit class RestoreRequestOps[Self <: RestoreRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlacierJobParameters(value: GlacierJobParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlacierJobParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlacierJobParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlacierJobParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocation(value: OutputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectParameters(value: SelectParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: Standard_ | Bulk | Expedited | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SELECT | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

