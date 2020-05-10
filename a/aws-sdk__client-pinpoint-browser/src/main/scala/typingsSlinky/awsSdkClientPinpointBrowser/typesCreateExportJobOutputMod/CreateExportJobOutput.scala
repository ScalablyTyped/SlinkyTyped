package typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportJobOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Export job response.
    */
  var ExportJobResponse: UnmarshalledExportJobResponse = js.native
}

object CreateExportJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): CreateExportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobOutput]
  }
  @scala.inline
  implicit class CreateExportJobOutputOps[Self <: CreateExportJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportJobResponse(value: UnmarshalledExportJobResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportJobResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

