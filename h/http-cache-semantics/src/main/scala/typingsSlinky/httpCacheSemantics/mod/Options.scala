package typingsSlinky.httpCacheSemantics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A fraction of response's age that is used as a fallback cache duration. The default is 0.1 (10%),
    * e.g. if a file hasn't been modified for 100 days, it'll be cached for 100*0.1 = 10 days.
    * @default 0.1
    */
  var cacheHeuristic: js.UndefOr[Double] = js.native
  /**
    * If `true`, common anti-cache directives will be completely ignored if the non-standard `pre-check`
    * and `post-check` directives are present. These two useless directives are most commonly found
    * in bad StackOverflow answers and PHP's "session limiter" defaults.
    * @default false
    */
  var ignoreCargoCult: js.UndefOr[Boolean] = js.native
  /**
    * A number of milliseconds to assume as the default time to cache responses with `Cache-Control: immutable`.
    * Note that [per RFC](https://httpwg.org/specs/rfc8246.html#the-immutable-cache-control-extension)
    * these can become stale, so `max-age` still overrides the default.
    * @default 24*3600*1000 (24h)
    */
  var immutableMinTimeToLive: js.UndefOr[Double] = js.native
  /**
    * If `true`, then the response is evaluated from a perspective of a shared cache (i.e. `private` is not
    * cacheable and `s-maxage` is respected). If `false`, then the response is evaluated from a perspective
    * of a single-user cache (i.e. `private` is cacheable and `s-maxage` is ignored).
    * `true` is recommended for HTTP clients.
    * @default true
    */
  var shared: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, then server's `Date` header won't be used as the base for `max-age`. This is against the RFC,
    * but it's useful if you want to cache responses with very short `max-age`, but your local clock
    * is not exactly in sync with the server's.
    * @default true
    */
  var trustServerDate: js.UndefOr[Boolean] = js.native
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
    def withCacheHeuristic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHeuristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHeuristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHeuristic")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCargoCult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCargoCult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCargoCult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCargoCult")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutableMinTimeToLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableMinTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutableMinTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableMinTimeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustServerDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustServerDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustServerDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustServerDate")(js.undefined)
        ret
    }
  }
  
}

