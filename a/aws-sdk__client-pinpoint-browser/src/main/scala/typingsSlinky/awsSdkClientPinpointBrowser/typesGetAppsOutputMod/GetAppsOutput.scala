package typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Get Applications Result.
    */
  var ApplicationsResponse: UnmarshalledApplicationsResponse = js.native
}

object GetAppsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): GetAppsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsOutput]
  }
  @scala.inline
  implicit class GetAppsOutputOps[Self <: GetAppsOutput] (val x: Self) extends AnyVal {
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
    def withApplicationsResponse(value: UnmarshalledApplicationsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

