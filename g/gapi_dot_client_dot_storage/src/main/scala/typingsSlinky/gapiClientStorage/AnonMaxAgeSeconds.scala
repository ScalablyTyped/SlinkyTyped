package typingsSlinky.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAgeSeconds extends js.Object {
  /** The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses. */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  /**
    * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "&#42;" is permitted in the list of methods, and means
    * "any method".
    */
  var method: js.UndefOr[js.Array[String]] = js.native
  /** The list of Origins eligible to receive CORS response headers. Note: "&#42;" is permitted in the list of origins, and means "any Origin". */
  var origin: js.UndefOr[js.Array[String]] = js.native
  /** The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains. */
  var responseHeader: js.UndefOr[js.Array[String]] = js.native
}

object AnonMaxAgeSeconds {
  @scala.inline
  def apply(): AnonMaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxAgeSeconds]
  }
  @scala.inline
  implicit class AnonMaxAgeSecondsOps[Self <: AnonMaxAgeSeconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAgeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHeader(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeader")(js.undefined)
        ret
    }
  }
  
}

