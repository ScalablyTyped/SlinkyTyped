package typingsSlinky.awsSdkClientXrayNode.typesHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http extends js.Object {
  /**
    * <p>The IP address of the requestor.</p>
    */
  var ClientIp: js.UndefOr[String] = js.native
  /**
    * <p>The request method.</p>
    */
  var HttpMethod: js.UndefOr[String] = js.native
  /**
    * <p>The response status.</p>
    */
  var HttpStatus: js.UndefOr[Double] = js.native
  /**
    * <p>The request URL.</p>
    */
  var HttpURL: js.UndefOr[String] = js.native
  /**
    * <p>The request's user agent string.</p>
    */
  var UserAgent: js.UndefOr[String] = js.native
}

object Http {
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIp")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpURL")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAgent")(js.undefined)
        ret
    }
  }
  
}

