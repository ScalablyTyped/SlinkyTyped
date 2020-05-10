package typingsSlinky.node.http2Mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerStreamFileResponseOptionsWithError extends ServerStreamFileResponseOptions {
  var onError: js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]] = js.native
}

object ServerStreamFileResponseOptionsWithError {
  @scala.inline
  def apply(): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
  @scala.inline
  implicit class ServerStreamFileResponseOptionsWithErrorOps[Self <: ServerStreamFileResponseOptionsWithError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: /* err */ ErrnoException => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
  }
  
}

