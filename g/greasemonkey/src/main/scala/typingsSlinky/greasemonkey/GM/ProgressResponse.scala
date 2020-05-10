package typingsSlinky.greasemonkey.GM

import typingsSlinky.greasemonkey.greasemonkeyBooleans.`false`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`1`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`2`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`3`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`4`
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressResponse[TContext] extends Response[TContext] {
  var lengthComputable: Boolean = js.native
  var loaded: Double = js.native
  var total: Double = js.native
}

object ProgressResponse {
  @scala.inline
  def apply[TContext](
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    readyState: `1` | `2` | `3` | `4`,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    responseXML: Document_ | `false`,
    status: Double,
    statusText: String,
    total: Double
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
  @scala.inline
  implicit class ProgressResponseOps[Self[tcontext] <: ProgressResponse[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withLengthComputable(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthComputable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

