package typingsSlinky.octokitRest.mod.Octokit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHeaders
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  /**
    * Avoid setting `accept`, use `mediaFormat.{format|previews}` instead.
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
    */
  var authorization: js.UndefOr[String] = js.native
  /**
    * `user-agent` is set do a default and can be overwritten as needed.
    */
  var `user-agent`: js.UndefOr[String] = js.native
}

object RequestHeaders {
  @scala.inline
  def apply(): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestHeaders]
  }
  @scala.inline
  implicit class RequestHeadersOps[Self <: RequestHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def `withUser-agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUser-agent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(js.undefined)
        ret
    }
  }
  
}

