package typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResourceMod.UnmarshalledImportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledImportJobResponse extends ImportJobResponse {
  /**
    * The import job settings.
    */
  @JSName("Definition")
  var Definition_UnmarshalledImportJobResponse: js.UndefOr[UnmarshalledImportJobResource] = js.native
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  @JSName("Failures")
  var Failures_UnmarshalledImportJobResponse: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledImportJobResponse {
  @scala.inline
  def apply(): UnmarshalledImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledImportJobResponse]
  }
  @scala.inline
  implicit class UnmarshalledImportJobResponseOps[Self <: UnmarshalledImportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: UnmarshalledImportJobResource): Self = {
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

