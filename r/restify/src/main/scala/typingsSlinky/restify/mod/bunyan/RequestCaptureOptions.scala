package typingsSlinky.restify.mod.bunyan

import typingsSlinky.bunyan.mod.LogLevel
import typingsSlinky.bunyan.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCaptureOptions extends js.Object {
  /**
    * If true, then dump captured records on the *default* request id when
    * dumping. I.e. dump records logged without "req_id" field. Default
    * false.
    */
  var dumpDefault: js.UndefOr[Boolean] = js.native
  /**
    * The level at which to trigger dumping captured records. Defaults to
    * bunyan.WARN.
    */
  var level: js.UndefOr[LogLevel] = js.native
  /** Number of records to capture. Default 100. */
  var maxRecords: js.UndefOr[Double] = js.native
  /**
    * Number of simultaneous request id capturing buckets to maintain.
    * Default 1000.
    */
  var maxRequestIds: js.UndefOr[Double] = js.native
  /** The stream to which to write when dumping captured records. */
  var stream: js.UndefOr[Stream] = js.native
  /** The streams to which to write when dumping captured records. */
  var streams: js.UndefOr[js.Array[Stream]] = js.native
}

object RequestCaptureOptions {
  @scala.inline
  def apply(): RequestCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCaptureOptions]
  }
  @scala.inline
  implicit class RequestCaptureOptionsOps[Self <: RequestCaptureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDumpDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDumpDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRequestIds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequestIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withStreams(value: js.Array[Stream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(js.undefined)
        ret
    }
  }
  
}

