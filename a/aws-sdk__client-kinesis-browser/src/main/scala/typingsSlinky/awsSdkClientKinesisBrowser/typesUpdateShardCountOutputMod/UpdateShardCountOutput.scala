package typingsSlinky.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateShardCountOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The current number of shards.</p>
    */
  var CurrentShardCount: js.UndefOr[Double] = js.native
  /**
    * <p>The name of the stream.</p>
    */
  var StreamName: js.UndefOr[String] = js.native
  /**
    * <p>The updated number of shards.</p>
    */
  var TargetShardCount: js.UndefOr[Double] = js.native
}

object UpdateShardCountOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
  @scala.inline
  implicit class UpdateShardCountOutputOps[Self <: UpdateShardCountOutput] (val x: Self) extends AnyVal {
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
    def withCurrentShardCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentShardCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentShardCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetShardCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetShardCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetShardCount")(js.undefined)
        ret
    }
  }
  
}

