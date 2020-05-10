package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingDistributionResult extends js.Object {
  /**
    * The current version of the streaming distribution created.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new streaming distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
    */
  var Location: js.UndefOr[String] = js.native
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.StreamingDistribution] = js.native
}

object CreateStreamingDistributionResult {
  @scala.inline
  def apply(): CreateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingDistributionResult]
  }
  @scala.inline
  implicit class CreateStreamingDistributionResultOps[Self <: CreateStreamingDistributionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingDistribution(value: StreamingDistribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingDistribution")(js.undefined)
        ret
    }
  }
  
}

