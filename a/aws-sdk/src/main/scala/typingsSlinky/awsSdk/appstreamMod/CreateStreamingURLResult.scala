package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingURLResult extends js.Object {
  /**
    * The elapsed time, in seconds after the Unix epoch, when this URL expires.
    */
  var Expires: js.UndefOr[js.Date] = js.native
  /**
    * The URL to start the AppStream 2.0 streaming session.
    */
  var StreamingURL: js.UndefOr[String] = js.native
}

object CreateStreamingURLResult {
  @scala.inline
  def apply(): CreateStreamingURLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingURLResult]
  }
  @scala.inline
  implicit class CreateStreamingURLResultOps[Self <: CreateStreamingURLResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingURL")(js.undefined)
        ret
    }
  }
  
}

