package typingsSlinky.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAres extends js.Object {
  var ares: String = js.native
  var http_parser: String = js.native
  var node: String = js.native
  var openssl: String = js.native
  var uv: String = js.native
  var v8: String = js.native
  var zlib: String = js.native
}

object AnonAres {
  @scala.inline
  def apply(
    ares: String,
    http_parser: String,
    node: String,
    openssl: String,
    uv: String,
    v8: String,
    zlib: String
  ): AnonAres = {
    val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAres]
  }
  @scala.inline
  implicit class AnonAresOps[Self <: AnonAres] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAres(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp_parser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http_parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenssl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZlib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlib")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

