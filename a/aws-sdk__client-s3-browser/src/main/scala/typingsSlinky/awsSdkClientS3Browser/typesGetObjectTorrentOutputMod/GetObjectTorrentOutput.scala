package typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectTorrentOutput[StreamType]
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _Body shape
    */
  var Body: js.UndefOr[StreamType] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
}

object GetObjectTorrentOutput {
  @scala.inline
  def apply[StreamType]($metadata: ResponseMetadata): GetObjectTorrentOutput[StreamType] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentOutput[StreamType]]
  }
  @scala.inline
  implicit class GetObjectTorrentOutputOps[Self[streamtype] <: GetObjectTorrentOutput[streamtype], StreamType] (val x: Self[StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StreamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StreamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StreamType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StreamType] with Other]
    @scala.inline
    def withBody(value: StreamType): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharged(value: requester_ | String): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharged: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(js.undefined)
        ret
    }
  }
  
}

