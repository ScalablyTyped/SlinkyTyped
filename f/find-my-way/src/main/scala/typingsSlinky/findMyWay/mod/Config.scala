package typingsSlinky.findMyWay.mod

import typingsSlinky.findMyWay.AnonDeriveVersion
import typingsSlinky.node.http2Mod.Http2ServerRequest
import typingsSlinky.node.http2Mod.Http2ServerResponse
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[V /* <: HTTPVersion */] extends js.Object {
  var allowUnsafeRegex: js.UndefOr[Boolean] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var defaultRoute: js.UndefOr[
    js.Function2[
      /* req */ Http2ServerRequest | IncomingMessage, 
      /* res */ Http2ServerResponse | ServerResponse, 
      Unit
    ]
  ] = js.native
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  var maxParamLength: js.UndefOr[Double] = js.native
  var versioning: js.UndefOr[AnonDeriveVersion[V]] = js.native
}

object Config {
  @scala.inline
  def apply[V](): Config[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[V]]
  }
  @scala.inline
  implicit class ConfigOps[Self[v] <: Config[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withAllowUnsafeRegex(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnsafeRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnsafeRegex: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnsafeRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRoute(
      value: (/* req */ Http2ServerRequest | IncomingMessage, /* res */ Http2ServerResponse | ServerResponse) => Unit
    ): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRoute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDefaultRoute: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTrailingSlash(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTrailingSlash: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParamLength(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParamLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParamLength: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParamLength")(js.undefined)
        ret
    }
    @scala.inline
    def withVersioning(value: AnonDeriveVersion[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioning: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(js.undefined)
        ret
    }
  }
  
}

