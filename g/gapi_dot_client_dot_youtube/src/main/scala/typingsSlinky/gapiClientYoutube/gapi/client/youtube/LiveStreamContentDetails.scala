package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamContentDetails extends js.Object {
  /** The ingestion URL where the closed captions of this stream are sent. */
  var closedCaptionsIngestionUrl: js.UndefOr[String] = js.native
  /**
    * Indicates whether the stream is reusable, which means that it can be bound to multiple broadcasts. It is common for broadcasters to reuse the same
    * stream for many different broadcasts if those broadcasts occur at different times.
    *
    * If you set this value to false, then the stream will not be reusable, which means that it can only be bound to one broadcast. Non-reusable streams
    * differ from reusable streams in the following ways:
    * - A non-reusable stream can only be bound to one broadcast.
    * - A non-reusable stream might be deleted by an automated process after the broadcast ends.
    * - The  liveStreams.list method does not list non-reusable streams if you call the method and set the mine parameter to true. The only way to use that
    * method to retrieve the resource for a non-reusable stream is to use the id parameter to identify the stream.
    */
  var isReusable: js.UndefOr[Boolean] = js.native
}

object LiveStreamContentDetails {
  @scala.inline
  def apply(): LiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamContentDetails]
  }
  @scala.inline
  implicit class LiveStreamContentDetailsOps[Self <: LiveStreamContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosedCaptionsIngestionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptionsIngestionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedCaptionsIngestionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptionsIngestionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReusable")(js.undefined)
        ret
    }
  }
  
}

