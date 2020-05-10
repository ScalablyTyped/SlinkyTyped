package typingsSlinky.cacheableRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When set to `true`, if the DB connection fails we will automatically fallback to a network request.
    * DB errors will still be emitted to notify you of the problem even though the request callback may succeed.
    * @default false
    */
  var automaticFailover: js.UndefOr[Boolean] = js.native
  /**
    * If the cache should be used. Setting this to `false` will completely bypass the cache for the current request.
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * Forces refreshing the cache. If the response could be retrieved from the cache, it will perform a
    * new request and override the cache instead.
    * @default false
    */
  var forceRefresh: js.UndefOr[Boolean] = js.native
  /**
    * Limits TTL. The `number` represents milliseconds.
    * @default undefined
    */
  var maxTtl: js.UndefOr[Double] = js.native
  /**
    * If set to `true` once a cached resource has expired it is deleted and will have to be re-requested.
    *
    * If set to `false`, after a cached resource's TTL expires it is kept in the cache and will be revalidated
    * on the next request with `If-None-Match`/`If-Modified-Since` headers.
    * @default false
    */
  var strictTtl: js.UndefOr[Boolean] = js.native
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
    def withAutomaticFailover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticFailover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticFailover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticFailover")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictTtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTtl")(js.undefined)
        ret
    }
  }
  
}

