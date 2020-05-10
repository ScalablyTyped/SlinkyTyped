package typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Attributes.
    */
  var AttributesResource: UnmarshalledAttributesResource = js.native
}

object RemoveAttributesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, AttributesResource: UnmarshalledAttributesResource): RemoveAttributesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AttributesResource = AttributesResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesOutput]
  }
  @scala.inline
  implicit class RemoveAttributesOutputOps[Self <: RemoveAttributesOutput] (val x: Self) extends AnyVal {
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
    def withAttributesResource(value: UnmarshalledAttributesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributesResource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

