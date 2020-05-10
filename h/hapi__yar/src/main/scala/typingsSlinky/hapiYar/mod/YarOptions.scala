package typingsSlinky.hapiYar.mod

import typingsSlinky.hapiHapi.mod.CachePolicyOptions
import typingsSlinky.hapiYar.AnonClearInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YarOptions extends js.Object {
  /**
    * hapi cache options which includes (among other options):
    */
  var cache: js.UndefOr[CachePolicyOptions[_]] = js.native
  /**
    * the configuration for cookie-specific features:
    */
  var cookieOptions: AnonClearInvalid = js.native
  /**
    * will cause yar to throw an exception if trying to persist to cache when the cache is unavailable.
    * Setting this to false will allow applications using yar to run uninterrupted if the cache is not ready (however sessions will not be saving).
    * Defaults to true.
    */
  var errorOnCacheNotReady: js.UndefOr[Boolean] = js.native
  /**
    * maximum cookie size before using server-side storage.
    * Defaults to 1K. Set to zero to always use server-side storage.
    */
  var maxCookieSize: js.UndefOr[Double] = js.native
  /**
    * Determines the name of the cookie used to store session information.
    * Defaults to session.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * determines whether to store empty session before they've been modified.
    * Defaults to true.
    */
  var storeBlank: js.UndefOr[Boolean] = js.native
}

object YarOptions {
  @scala.inline
  def apply(cookieOptions: AnonClearInvalid): YarOptions = {
    val __obj = js.Dynamic.literal(cookieOptions = cookieOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarOptions]
  }
  @scala.inline
  implicit class YarOptionsOps[Self <: YarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieOptions(value: AnonClearInvalid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: CachePolicyOptions[_]): Self = {
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
    def withErrorOnCacheNotReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnCacheNotReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOnCacheNotReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnCacheNotReady")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCookieSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCookieSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCookieSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCookieSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeBlank")(js.undefined)
        ret
    }
  }
  
}

