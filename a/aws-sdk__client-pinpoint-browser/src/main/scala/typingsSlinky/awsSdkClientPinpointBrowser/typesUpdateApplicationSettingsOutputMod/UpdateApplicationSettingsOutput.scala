package typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Application settings.
    */
  var ApplicationSettingsResource: UnmarshalledApplicationSettingsResource = js.native
}

object UpdateApplicationSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): UpdateApplicationSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsOutput]
  }
  @scala.inline
  implicit class UpdateApplicationSettingsOutputOps[Self <: UpdateApplicationSettingsOutput] (val x: Self) extends AnyVal {
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
    def withApplicationSettingsResource(value: UnmarshalledApplicationSettingsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSettingsResource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

