package typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumberValidateOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Phone Number Validate response.
    */
  var NumberValidateResponse: UnmarshalledNumberValidateResponse
}

object PhoneNumberValidateOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): PhoneNumberValidateOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateOutput]
  }
}

