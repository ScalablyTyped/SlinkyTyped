package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreRequest extends js.Object {
  /**
    * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.
    */
  var Days: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Days] = js.native
  /**
    * The optional description for the job.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Description] = js.native
  /**
    * Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.
    */
  var GlacierJobParameters: js.UndefOr[typingsSlinky.awsSdk.s3Mod.GlacierJobParameters] = js.native
  /**
    * Describes the location where the restore job's output is stored.
    */
  var OutputLocation: js.UndefOr[typingsSlinky.awsSdk.s3Mod.OutputLocation] = js.native
  /**
    * Describes the parameters for Select job types.
    */
  var SelectParameters: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SelectParameters] = js.native
  /**
    * Glacier retrieval tier at which the restore will be processed.
    */
  var Tier: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Tier] = js.native
  /**
    * Type of restore request.
    */
  var Type: js.UndefOr[RestoreRequestType] = js.native
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
    def withDays(value: Days): Self = {
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
    def withDescription(value: Description): Self = {
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
    def withTier(value: Tier): Self = {
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
    def withType(value: RestoreRequestType): Self = {
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

