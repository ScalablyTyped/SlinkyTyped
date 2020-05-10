package typingsSlinky.expressHttpProxy.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyOptions extends js.Object {
  var filter: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.native
  var https: js.UndefOr[Boolean] = js.native
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[Double | String] = js.native
  var memoizeHost: js.UndefOr[Boolean] = js.native
  var parseReqBody: js.UndefOr[Boolean] = js.native
  var preserveHostHdr: js.UndefOr[Boolean] = js.native
  var proxyErrorHandler: js.UndefOr[
    js.Function3[/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction, _]
  ] = js.native
  var proxyReqBodyDecorator: js.UndefOr[
    js.Function2[/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query], _]
  ] = js.native
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ RequestOptions, 
      /* srcReq */ Request_[ParamsDictionary, _, _, Query], 
      RequestOptions | js.Promise[RequestOptions]
    ]
  ] = js.native
  var proxyReqPathResolver: js.UndefOr[
    js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String | js.Promise[String]]
  ] = js.native
  var reqAsBuffer: js.UndefOr[Boolean] = js.native
  var reqBodyEncoding: js.UndefOr[String | Null] = js.native
  var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ Response_[_], Boolean]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var userResDecorator: js.UndefOr[
    js.Function4[
      /* proxyRes */ Response_[_], 
      /* proxyResData */ js.Any, 
      /* userReq */ Request_[ParamsDictionary, _, _, Query], 
      /* userRes */ Response_[_], 
      Buffer | String | (js.Promise[Buffer | String])
    ]
  ] = js.native
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ IncomingHttpHeaders, 
      /* userReq */ Request_[ParamsDictionary, _, _, Query], 
      /* userRes */ Response_[_], 
      /* proxyReq */ Request_[ParamsDictionary, _, _, Query], 
      /* proxyRes */ Response_[_], 
      OutgoingHttpHeaders
    ]
  ] = js.native
}

object ProxyOptions {
  @scala.inline
  def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
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
    def withMemoizeHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizeHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoizeHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizeHost")(js.undefined)
        ret
    }
    @scala.inline
    def withParseReqBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseReqBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseReqBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseReqBody")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveHostHdr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHostHdr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveHostHdr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHostHdr")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyErrorHandler(value: (/* err */ js.Any, /* res */ Response_[_], /* next */ NextFunction) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyErrorHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProxyErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyErrorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyReqBodyDecorator(value: (/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReqBodyDecorator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProxyReqBodyDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReqBodyDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyReqOptDecorator(
      value: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request_[ParamsDictionary, _, _, Query]) => RequestOptions | js.Promise[RequestOptions]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReqOptDecorator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProxyReqOptDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReqOptDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyReqPathResolver(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReqPathResolver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProxyReqPathResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReqPathResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withReqAsBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqAsBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqAsBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqAsBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withReqBodyEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqBodyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqBodyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqBodyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withReqBodyEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqBodyEncoding")(null)
        ret
    }
    @scala.inline
    def withSkipToNextHandlerFilter(value: /* proxyRes */ Response_[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipToNextHandlerFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkipToNextHandlerFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipToNextHandlerFilter")(js.undefined)
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
    def withUserResDecorator(
      value: (/* proxyRes */ Response_[_], /* proxyResData */ js.Any, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_]) => Buffer | String | (js.Promise[Buffer | String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userResDecorator")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUserResDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userResDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withUserResHeaderDecorator(
      value: (/* headers */ IncomingHttpHeaders, /* userReq */ Request_[ParamsDictionary, _, _, Query], /* userRes */ Response_[_], /* proxyReq */ Request_[ParamsDictionary, _, _, Query], /* proxyRes */ Response_[_]) => OutgoingHttpHeaders
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userResHeaderDecorator")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutUserResHeaderDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userResHeaderDecorator")(js.undefined)
        ret
    }
  }
  
}

