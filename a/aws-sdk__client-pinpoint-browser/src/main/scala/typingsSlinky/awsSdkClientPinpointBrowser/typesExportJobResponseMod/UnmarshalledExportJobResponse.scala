package typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResourceMod.UnmarshalledExportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledExportJobResponse extends ExportJobResponse {
  /**
    * The export job settings.
    */
  @JSName("Definition")
  var Definition_UnmarshalledExportJobResponse: js.UndefOr[UnmarshalledExportJobResource] = js.native
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  @JSName("Failures")
  var Failures_UnmarshalledExportJobResponse: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledExportJobResponse {
  @scala.inline
  def apply(): UnmarshalledExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledExportJobResponse]
  }
  @scala.inline
  implicit class UnmarshalledExportJobResponseOps[Self <: UnmarshalledExportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: UnmarshalledExportJobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Definition")(js.undefined)
        ret
    }
    @scala.inline
    def withFailures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(js.undefined)
        ret
    }
  }
  
}

