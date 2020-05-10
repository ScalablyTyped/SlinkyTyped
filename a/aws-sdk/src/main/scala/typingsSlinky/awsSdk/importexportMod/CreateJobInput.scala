package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var JobType: typingsSlinky.awsSdk.importexportMod.JobType = js.native
  var Manifest: typingsSlinky.awsSdk.importexportMod.Manifest = js.native
  var ManifestAddendum: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ManifestAddendum] = js.native
  var ValidateOnly: typingsSlinky.awsSdk.importexportMod.ValidateOnly = js.native
}

object CreateJobInput {
  @scala.inline
  def apply(JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): CreateJobInput = {
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobInput]
  }
  @scala.inline
  implicit class CreateJobInputOps[Self <: CreateJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: Manifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOnly(value: ValidateOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAPIVersion(value: APIVersion_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPIVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestAddendum(value: ManifestAddendum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestAddendum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestAddendum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestAddendum")(js.undefined)
        ret
    }
  }
  
}

