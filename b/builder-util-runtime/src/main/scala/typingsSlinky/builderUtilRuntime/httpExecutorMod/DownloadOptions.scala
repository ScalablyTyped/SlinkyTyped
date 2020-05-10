package typingsSlinky.builderUtilRuntime.httpExecutorMod

import typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typingsSlinky.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadOptions extends js.Object {
  val cancellationToken: CancellationToken = js.native
  val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.native
  var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.native
  val sha2: js.UndefOr[String | Null] = js.native
  val sha512: js.UndefOr[String | Null] = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(cancellationToken: CancellationToken): DownloadOptions = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellationToken(value: CancellationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: OutgoingHttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(null)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* progress */ ProgressInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withSha2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha2")(js.undefined)
        ret
    }
    @scala.inline
    def withSha2Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha2")(null)
        ret
    }
    @scala.inline
    def withSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha512: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(js.undefined)
        ret
    }
    @scala.inline
    def withSha512Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(null)
        ret
    }
  }
  
}

