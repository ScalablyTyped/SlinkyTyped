package typingsSlinky.awsSdkClientS3Browser.typesRestoreRequestMod

import typingsSlinky.awsSdkClientS3Browser.typesGlacierJobParametersMod.UnmarshalledGlacierJobParameters
import typingsSlinky.awsSdkClientS3Browser.typesOutputLocationMod.UnmarshalledOutputLocation
import typingsSlinky.awsSdkClientS3Browser.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRestoreRequest extends RestoreRequest {
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  @JSName("GlacierJobParameters")
  var GlacierJobParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledGlacierJobParameters] = js.native
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledOutputLocation] = js.native
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledSelectParameters] = js.native
}

object UnmarshalledRestoreRequest {
  @scala.inline
  def apply(): UnmarshalledRestoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRestoreRequest]
  }
  @scala.inline
  implicit class UnmarshalledRestoreRequestOps[Self <: UnmarshalledRestoreRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlacierJobParameters(value: UnmarshalledGlacierJobParameters): Self = {
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
    def withOutputLocation(value: UnmarshalledOutputLocation): Self = {
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
    def withSelectParameters(value: UnmarshalledSelectParameters): Self = {
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
  }
  
}

