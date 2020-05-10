package typingsSlinky.hapiWreck.mod.Client.request

import typingsSlinky.hapiWreck.hapiWreckBooleans.`false`
import typingsSlinky.hapiWreck.hapiWreckStrings.force
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Node HTTP or HTTPS Agent object (false disables agent pooling).
    */
  val agent: js.UndefOr[Agent | typingsSlinky.node.httpsMod.Agent | `false`] = js.native
  /**
    * Fully qualified URL string used as the base URL.
    */
  val baseUrl: js.UndefOr[String] = js.native
  /**
    * A function to call before a redirect is triggered.
    * 
    * @param redirectMethod - a string specifying the redirect method.
    * @param statusCode - HTTP status code of the response that triggered the redirect.
    * @param location - The redirect location string.
    * @param resHeaders - An object with the headers received as part of the redirection response.
    * @param redirectOptions - Options that will be applied to the redirect request. Changes to this object are applied to the redirection request.
    * @param next - the callback function called to perform the redirection.
    */
  val beforeRedirect: js.UndefOr[
    js.Function6[
      /* redirectMethod */ String, 
      /* statusCode */ Double, 
      /* location */ String, 
      /* resHeaders */ Record[String, String], 
      /* redirectOptions */ Options, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  /**
    * TLS list of TLS ciphers to override node's default.
    */
  val ciphers: js.UndefOr[String] = js.native
  /**
    * Determines how to handle gzipped payloads.
    * 
    * @default false
    */
  val gunzip: js.UndefOr[Boolean | force] = js.native
  /**
    * An object containing the request headers.
    */
  val headers: js.UndefOr[Record[String, String]] = js.native
  /**
    * The request body as a string, Buffer, readable stream, or an object that can be serialized using `JSON.stringify()`.
    */
  val payload: js.UndefOr[Payload] = js.native
  /**
    * Enables redirects on 303 responses (using GET).
    * 
    * @default false
    */
  val redirect303: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the HTTP method used when following 301 and 302 redirections. Defaults to the original method.
    */
  val redirectMethod: js.UndefOr[String] = js.native
  /**
    * A function to call when a redirect was triggered.
    * 
    * @param statusCode - HTTP status code of the response that triggered the redirect.
    * @param location - the redirected location string.
    * @param req - the new ClientRequest object which replaces the one initially returned.
    */
  val redirected: js.UndefOr[
    js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
  ] = js.native
  /**
    * The maximum number of redirects to follow.
    * 
    * @default false
    */
  val redirects: js.UndefOr[Double | `false`] = js.native
  /**
    * TLS flag indicating whether the client should reject a response from a server with invalid certificates.
    */
  val rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * TLS flag indicating the SSL method to use, e.g. `SSLv3_method` to force SSL version 3.
    */
  val secureProtocol: js.UndefOr[String] = js.native
  /**
    * A UNIX socket path string for direct server connection.
    */
  val socketPath: js.UndefOr[String] = js.native
  /**
    * Number of milliseconds to wait without receiving a response before aborting the request.
    * 
    * @default 0
    */
  val timeout: js.UndefOr[Double] = js.native
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
    def withAgent(value: Agent | typingsSlinky.node.httpsMod.Agent | `false`): Self = {
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
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRedirect(
      value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ Record[String, String], /* redirectOptions */ Options, /* next */ js.Function0[Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedirect")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutBeforeRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withGunzip(value: Boolean | force): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gunzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGunzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gunzip")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Record[String, String]): Self = {
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
    def withPayload(value: Payload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect303(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect303")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect303: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect303")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirected")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRedirected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirected")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirects(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
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
  }
  
}

