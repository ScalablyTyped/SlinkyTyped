package typingsSlinky.needle.mod.core

import typingsSlinky.needle.needleStrings.auto
import typingsSlinky.needle.needleStrings.basic
import typingsSlinky.needle.needleStrings.digest
import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * Sets 'Accept' HTTP header. Defaults to &#x2a;&#x2f;&#x2a;.
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * Uses an http.Agent of your choice, instead of the global, default one.
    * Useful for tweaking the behaviour at the connection level, such as when doing tunneling.
    */
  var agent: js.UndefOr[Agent | Boolean] = js.native
  /**
    * Determines what to do with provided username/password.
    * Options are auto, digest or basic (default).
    * auto will detect the type of authentication depending on the response headers.
    */
  var auth: js.UndefOr[auto | digest | basic] = js.native
  /**
    * If true, sets 'Accept-Encoding' header to 'gzip,deflate',
    * and inflates content if zipped.
    * Defaults to false.
    */
  var compressed: js.UndefOr[Boolean] = js.native
  /**
    * Sets 'Connection' HTTP header.
    * Not set by default, unless running Node < 0.11.4
    * in which case it defaults to close.
    */
  var connection: js.UndefOr[String] = js.native
  /**
    * Sets the 'Content-Type' header.
    * Unset by default, unless you're sending data
    * in which case it's set accordingly to whatever is being sent
    * (application/x-www-form-urlencoded, application/json or multipart/form-data).
    * That is, of course, unless the option is passed,
    * either here or through options.headers.
    */
  var content_type: js.UndefOr[String] = js.native
  // These properties are overwritten by those in the 'headers' field
  /**
    * Builds and sets a Cookie header from a { key: 'value' } object.
    */
  var cookies: js.UndefOr[Cookies] = js.native
  /**
    * Alias for follow_max
    */
  var follow: js.UndefOr[Double] = js.native
  /**
    * Number of redirects to follow. Defaults to 0.
    */
  var follow_max: js.UndefOr[Double] = js.native
  /**
    * Object containing custom HTTP headers for request.
    */
  var headers: js.UndefOr[js.Object] = js.native
  /**
    * When true, sets content type to application/json and sends request body as JSON string,
    * instead of a query string.
    */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * Enables multipart/form-data encoding. Defaults to false.
    * Use it when uploading files.
    */
  var multipart: js.UndefOr[Boolean] = js.native
  /**
    * Returns error if connection takes longer than X milisecs to establish.
    * Defaults to 10000 (10 secs). 0 means no timeout.
    */
  var open_timeout: js.UndefOr[Double] = js.native
  /**
    * For HTTP basic auth. Requires username to be passed, but is optional.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Forwards request through HTTP(s) proxy.
    * Eg. proxy: 'http://user:pass@proxy.server.com:3128'.
    * For more advanced proxying/tunneling use a custom agent.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Returns error if data transfer takes longer than X milisecs,
    * after connection is established. Defaults to 0 (no timeout).
    */
  var read_timeout: js.UndefOr[Double] = js.native
  /**
    * When sending streams, this lets manually set the Content-Length header
    * --if the stream's bytecount is known beforehand--,
    * preventing ECONNRESET (socket hang up) errors on some servers that misbehave
    * when receiving payloads of unknown size.
    * Set it to 0 and Needle will get and set the stream's length,
    * or leave unset for the default behavior,
    * which is no Content-Length header for stream payloads.
    */
  var stream_length: js.UndefOr[Double] = js.native
  /**
    * Alias for open_timeout
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Sets the 'User-Agent' HTTP header.
    * Defaults to Needle/{version} (Node.js {node_version}).
    */
  var user_agent: js.UndefOr[String] = js.native
  // Overwritten if present in the URI
  /**
    * For HTTP basic auth.
    */
  var username: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def withAgent(value: Agent | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: auto | digest | basic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCookies(value: Cookies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_max")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
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
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRead_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStream_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_length")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

