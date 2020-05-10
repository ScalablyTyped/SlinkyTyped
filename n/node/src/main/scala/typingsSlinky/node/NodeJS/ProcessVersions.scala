package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessVersions extends js.Object {
  var ares: String = js.native
  var http_parser: String = js.native
  var modules: String = js.native
  var node: String = js.native
  var openssl: String = js.native
  var uv: String = js.native
  var v8: String = js.native
  var zlib: String = js.native
}

object ProcessVersions {
  @scala.inline
  def apply(
    ares: String,
    http_parser: String,
    modules: String,
    node: String,
    openssl: String,
    uv: String,
    v8: String,
    zlib: String
  ): ProcessVersions = {
    val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVersions]
  }
  @scala.inline
  implicit class ProcessVersionsOps[Self <: ProcessVersions] (val x: Self) extends AnyVal {
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
    def withModules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
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

