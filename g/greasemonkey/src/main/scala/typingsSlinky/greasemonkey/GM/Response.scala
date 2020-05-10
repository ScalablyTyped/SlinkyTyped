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
trait Response[TContext] extends js.Object {
  /** The same object passed into the original request */
  val context: js.UndefOr[TContext] = js.native
  val finalUrl: String = js.native
  val readyState: `1` | `2` | `3` | `4` = js.native
  val response: js.Any = js.native
  val responseHeaders: String = js.native
  val responseText: String = js.native
  val responseXML: Document_ | `false` = js.native
  val status: Double = js.native
  val statusText: String = js.native
}

object Response {
  @scala.inline
  def apply[TContext](
    finalUrl: String,
    readyState: `1` | `2` | `3` | `4`,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    responseXML: Document_ | `false`,
    status: Double,
    statusText: String
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TContext]]
  }
  @scala.inline
  implicit class ResponseOps[Self[tcontext] <: Response[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withFinalUrl(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: `1` | `2` | `3` | `4`): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseHeaders(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseText(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseXML(value: Document_ | `false`): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseXML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

