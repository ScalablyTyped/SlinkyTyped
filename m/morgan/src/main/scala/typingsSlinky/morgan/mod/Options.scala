package typingsSlinky.morgan.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***
  * Morgan accepts these properties in the options object.
  */
@js.native
trait Options extends js.Object {
  /***
    * Buffer duration before writing logs to the stream, defaults to false.
    * When set to true, defaults to 1000 ms.
    * @deprecated
    */
  var buffer: js.UndefOr[Boolean] = js.native
  /***
    * Write log line on request instead of response. This means that a
    * requests will be logged even if the server crashes, but data from the
    * response cannot be logged (like the response code).
    */
  var immediate: js.UndefOr[Boolean] = js.native
  /***
    * Function to determine if logging is skipped, defaults to false. This
    * function will be called as skip(req, res).
    */
  var skip: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.native
  /***
    * Output stream for writing log lines, defaults to process.stdout.
    * @param str
    */
  var stream: js.UndefOr[StreamOptions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: StreamOptions): Self = {
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
  }
  
}

