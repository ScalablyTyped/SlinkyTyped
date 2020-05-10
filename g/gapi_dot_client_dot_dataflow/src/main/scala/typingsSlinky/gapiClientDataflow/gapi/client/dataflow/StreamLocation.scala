package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLocation extends js.Object {
  /** The stream is a custom source. */
  var customSourceLocation: js.UndefOr[CustomSourceLocation] = js.native
  /** The stream is a pubsub stream. */
  var pubsubLocation: js.UndefOr[PubsubLocation] = js.native
  /** The stream is a streaming side input. */
  var sideInputLocation: js.UndefOr[StreamingSideInputLocation] = js.native
  /**
    * The stream is part of another computation within the current
    * streaming Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[StreamingStageLocation] = js.native
}

object StreamLocation {
  @scala.inline
  def apply(): StreamLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLocation]
  }
  @scala.inline
  implicit class StreamLocationOps[Self <: StreamLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSourceLocation(value: CustomSourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSourceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSourceLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withPubsubLocation(value: PubsubLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsubLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSideInputLocation(value: StreamingSideInputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideInputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideInputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideInputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingStageLocation(value: StreamingStageLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingStageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingStageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingStageLocation")(js.undefined)
        ret
    }
  }
  
}

