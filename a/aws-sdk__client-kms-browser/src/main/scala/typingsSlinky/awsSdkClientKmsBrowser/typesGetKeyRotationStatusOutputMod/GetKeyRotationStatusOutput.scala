package typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyRotationStatusOutputMod

import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyRotationStatusOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A Boolean value that specifies whether key rotation is enabled.</p>
    */
  var KeyRotationEnabled: js.UndefOr[Boolean] = js.native
}

object GetKeyRotationStatusOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetKeyRotationStatusOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyRotationStatusOutput]
  }
  @scala.inline
  implicit class GetKeyRotationStatusOutputOps[Self <: GetKeyRotationStatusOutput] (val x: Self) extends AnyVal {
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
    def withKeyRotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationEnabled")(js.undefined)
        ret
    }
  }
  
}

