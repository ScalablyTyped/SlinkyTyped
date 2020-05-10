package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2RequestedOptions extends js.Object {
  var jobConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * If run with an InspectTemplate, a snapshot of its state at the time of
    * this run.
    */
  var snapshotInspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
}

object SchemaGooglePrivacyDlpV2RequestedOptions {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RequestedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RequestedOptions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RequestedOptionsOps[Self <: SchemaGooglePrivacyDlpV2RequestedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobConfig(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotInspectTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotInspectTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotInspectTemplate")(js.undefined)
        ret
    }
  }
  
}

