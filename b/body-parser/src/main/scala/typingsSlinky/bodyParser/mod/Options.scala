package typingsSlinky.bodyParser.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** When set to true, then deflated (compressed) bodies will be inflated; when false, deflated bodies are rejected. Defaults to true. */
  var inflate: js.UndefOr[Boolean] = js.native
  /**
    * Controls the maximum request body size. If this is a number,
    * then the value specifies the number of bytes; if it is a string,
    * the value is passed to the bytes library for parsing. Defaults to '100kb'.
    */
  var limit: js.UndefOr[Double | String] = js.native
  /**
    * The type option is used to determine what media type the middleware will parse
    */
  var `type`: js.UndefOr[String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _])] = js.native
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding),
    * where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.native
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
    def withInflate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeFunction1(value: /* req */ IncomingMessage => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
  }
  
}

