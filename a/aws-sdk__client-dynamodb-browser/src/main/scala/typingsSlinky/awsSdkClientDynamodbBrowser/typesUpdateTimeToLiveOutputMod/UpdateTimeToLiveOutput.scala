package typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveOutputMod

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.UnmarshalledTimeToLiveSpecification
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTimeToLiveOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Represents the output of an <code>UpdateTimeToLive</code> operation.</p>
    */
  var TimeToLiveSpecification: js.UndefOr[UnmarshalledTimeToLiveSpecification] = js.native
}

object UpdateTimeToLiveOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
  @scala.inline
  implicit class UpdateTimeToLiveOutputOps[Self <: UpdateTimeToLiveOutput] (val x: Self) extends AnyVal {
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
    def withTimeToLiveSpecification(value: UnmarshalledTimeToLiveSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLiveSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveSpecification")(js.undefined)
        ret
    }
  }
  
}

