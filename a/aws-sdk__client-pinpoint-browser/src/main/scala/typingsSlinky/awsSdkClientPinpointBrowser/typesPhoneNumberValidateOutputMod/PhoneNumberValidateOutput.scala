package typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberValidateOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Phone Number Validate response.
    */
  var NumberValidateResponse: UnmarshalledNumberValidateResponse = js.native
}

object PhoneNumberValidateOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): PhoneNumberValidateOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateOutput]
  }
  @scala.inline
  implicit class PhoneNumberValidateOutputOps[Self <: PhoneNumberValidateOutput] (val x: Self) extends AnyVal {
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
    def withNumberValidateResponse(value: UnmarshalledNumberValidateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValidateResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

