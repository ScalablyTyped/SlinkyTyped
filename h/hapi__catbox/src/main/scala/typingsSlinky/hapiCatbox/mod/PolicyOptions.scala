package typingsSlinky.hapiCatbox.mod

import typingsSlinky.hapiCatbox.hapiCatboxBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyOptions[T] extends PolicyOptionVariants[T] {
  /** dropOnError - if true, an error or timeout in the generateFunc causes the stale value to be evicted from the cache. Defaults to true. */
  var dropOnError: js.UndefOr[Boolean] = js.native
  /** expiresAt - time of day expressed in 24h notation using the 'HH:MM' format, at which point all cache records for the route expire. Uses local time. Cannot be used together with expiresIn. */
  var expiresAt: js.UndefOr[String] = js.native
  /** expiresIn - relative expiration expressed in the number of milliseconds since the item was saved in the cache. Cannot be used together with expiresAt. */
  var expiresIn: js.UndefOr[Double] = js.native
  /** generateFunc - a function used to generate a new cache item if one is not found in the cache when calling get(). The method's signature is function(id, next) where: */
  var generateFunc: js.UndefOr[GenerateFunc[T]] = js.native
  /** generateIgnoreWriteError - if false, an upstream cache write error will be passed back with the generated value when calling the get() method. Defaults to true. */
  var generateIgnoreWriteError: js.UndefOr[Boolean] = js.native
  /** generateOnReadError - if false, an upstream cache read error will stop the get() method from calling the generate function and will instead pass back the cache error. Defaults to true. */
  var generateOnReadError: js.UndefOr[Boolean] = js.native
  /**
    * generateTimeout - number of milliseconds to wait before returning a timeout error when the generateFunc function takes too long to return a value.
    * When the value is eventually returned, it is stored in the cache for future requests. Required if generateFunc is present.
    * Set to false to disable timeouts which may cause all get() requests to get stuck forever.
    */
  var generateTimeout: js.UndefOr[Double | `false`] = js.native
  /**
    * pendingGenerateTimeout - number of milliseconds while generateFunc call is in progress for a given id, before a subsequent generateFunc call is allowed.
    * @default 0, no blocking of concurrent generateFunc calls beyond staleTimeout.
    */
  var pendingGenerateTimeout: js.UndefOr[Double] = js.native
  /**
    * staleIn - number of milliseconds to mark an item stored in cache as stale and attempt to regenerate it when generateFunc is provided.
    * Must be less than expiresIn. Alternatively function that returns staleIn value in milliseconds. The function signature is function(stored, ttl) where:
    *  * stored - the timestamp when the item was stored in the cache (in milliseconds).
    *  * ttl - the remaining time-to-live (not the original value used when storing the object).
    */
  var staleIn: js.UndefOr[Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])] = js.native
  /** staleTimeout - number of milliseconds to wait before returning a stale value while generateFunc is generating a fresh value. */
  var staleTimeout: js.UndefOr[Double] = js.native
}

object PolicyOptions {
  @scala.inline
  def apply[T](): PolicyOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyOptions[T]]
  }
  @scala.inline
  implicit class PolicyOptionsOps[Self[t] <: PolicyOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDropOnError(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropOnError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresAt(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateFunc(value: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateFunc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateIgnoreWriteError(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIgnoreWriteError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateIgnoreWriteError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIgnoreWriteError")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateOnReadError(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOnReadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateOnReadError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOnReadError")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateTimeout(value: Double | `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingGenerateTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingGenerateTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingGenerateTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingGenerateTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleInFunction2(value: (/* stored */ Double, /* ttl */ Double) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleIn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStaleIn(value: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleIn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleIn")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleTimeout")(js.undefined)
        ret
    }
  }
  
}

