package typingsSlinky.expressSlowDown.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * express-slow-down options
  */
@js.native
trait Options extends js.Object {
  /**
    * Max number of connections during `windowMs` before starting to delay responses.
    * Defaults to `1`. Set to `0` to disable delaying.
    */
  var delayAfter: js.UndefOr[Double] = js.native
  /**
    * How long to delay the response, multiplied by `(number recent hits - delayAfter)`.
    * Defaults to `1000` (1 second). Set to `0` to disable delaying.
    */
  var delayMs: js.UndefOr[Double] = js.native
  /**
    * Function used to generate keys. By default user IP address (`req.ip`) is used.
    * Default: `(req, res) => req.ip`
    */
  var keyGenerator: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
  ] = js.native
  /**
    * Maximum value for `delayMs` after many consecutive attempts, that is, after the n-th request,
    * the delay will be always `maxDelayMs`. Important when your application is running behind a
    * load balancer or reverse proxy that has a request timeout. Defaults to Infinity.
    */
  var maxDelayMs: js.UndefOr[Double] = js.native
  /**
    * Function to execute the first time the limit is reached within `windowMs`.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ RequestWithSlowDown, 
      /* res */ Response_[_], 
      /* optionsUsed */ this.type, 
      Unit
    ]
  ] = js.native
  /**
    * Function used to skip requests. Returning `true` from the function will skip delaying for that request.
    * Default: `(req, res) => false`
    */
  var skip: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.native
  /**
    * When `true` failed requests (response status >= 400) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[Boolean] = js.native
  /**
    * When `true` successful requests (response status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[Boolean] = js.native
  /**
    * The storage to use when persisting request attempts. By default, the MemoryStore is used.
    */
  var store: js.UndefOr[Store] = js.native
  /**
    * How long to keep records of requests in memory. Defaults to `60000` (1 minute)
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
    def withDelayAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMs")(js.undefined)
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
    def withMaxDelayMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLimitReached(value: (/* req */ RequestWithSlowDown, /* res */ Response_[_], Options) => Unit): Self = {
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

