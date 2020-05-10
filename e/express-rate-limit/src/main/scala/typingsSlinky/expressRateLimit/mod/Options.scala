package typingsSlinky.expressRateLimit.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The funciton to handle requests once `max` is exceeded. It receives the request and response objects.
    * The "next" param is available if you need to pass to the next middleware. The `req.rateLimit` object
    * has `limit`, `current`, and `remaining` number of requests, and if the store provides it, a `resetTime`
    * Date object.
    * Default: `(req, res, next) => res.status(options.statusCode).send(options.message)`
    */
  var handler: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      _
    ]
  ] = js.native
  /**
    * Enable headers for request limit (`X-RateLimit-Limit`) and current usage (`X-RateLimit-Remaining`) on all
    * responses andtime to wait before retrying (`Retry-After`) when `max` is exceeded. Defaults to `true`.
    */
  var headers: js.UndefOr[Boolean] = js.native
  /**
    * Function used to generate keys. Defaults to using `req.ip`.
    * Default: `(req, res) => req.ip`
    */
  var keyGenerator: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
  ] = js.native
  /**
    * Max number of connections during `windowMs` before sending a 429 response. May be a `number` or
    * a function that returns a `number` or a `Promise<number>`. Defaults to `5`. Set to `0` to disable.
    */
  var max: js.UndefOr[Double | MaxValueFn] = js.native
  /**
    * Error message sent to user when `max` is exceeded. May be a `string`, JSON object, or any other value
    * that Express's `req.send()` supports. Defaults to `'Too many requests, please try again later.'`.
    */
  var message: js.UndefOr[String | Buffer | Message] = js.native
  /**
    * Function that is called the first time `max` is exceeded. The `req.rateLimit` object has `limit`, `current`,
    * and `remaining` number of requests and, if the store provides it, a `resetTime` Date object. Default is
    * an empty function.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* optionsUsed */ this.type, 
      Unit
    ]
  ] = js.native
  /**
    * Function used to skip requests. Returning `true` from the function will skip limiting for that request. Defaults to
    * always `false` (count all requests).
    * Default: `(req, res) => false`
    */
  var skip: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.native
  /**
    * When set to `true`, failed requests (status >= 400, request canceled or errored) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[Boolean] = js.native
  /**
    * When set to `true`, successful requests (status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[Boolean] = js.native
  /**
    * HTTP status code returned when `max` is exceeded. Defaults to `429`.
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * The storage to use when persisting rate limit attempts.
    */
  var store: js.UndefOr[Store] = js.native
  /**
    * How long in milliseconds to keep records of requests in memory. Defaults to `60000` (1 minute).
    */
  var windowMs: js.UndefOr[Double] = js.native
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
    def withHandler(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Boolean): Self = {
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
    def withKeyGenerator(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyGenerator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFunction0(value: () => Double | js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMax(value: Double | MaxValueFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String | Buffer | Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLimitReached(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Options) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLimitReached")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnLimitReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLimitReached")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFailedRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFailedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFailedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFailedRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipSuccessfulRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSuccessfulRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipSuccessfulRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSuccessfulRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowMs")(js.undefined)
        ret
    }
  }
  
}

