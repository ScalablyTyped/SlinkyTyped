package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's id.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typingsSlinky.awsSdk.cloudfrontMod.StreamingDistributionConfig = js.native
}

object UpdateStreamingDistributionRequest {
  @scala.inline
  def apply(Id: String, StreamingDistributionConfig: StreamingDistributionConfig): UpdateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamingDistributionRequest]
  }
  @scala.inline
  implicit class UpdateStreamingDistributionRequestOps[Self <: UpdateStreamingDistributionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamingDistributionConfig(value: StreamingDistributionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingDistributionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(js.undefined)
        ret
    }
  }
  
}

