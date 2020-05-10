package typingsSlinky.npmRegistryFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRetryOptions extends js.Object {
  /**
    * The "retries" config for `retry` to use when fetching packages from
    * the registry.
    *
    * See also `opts.retry` to provide all retry options as a single object.
    */
  var fetchRetries: js.UndefOr[Double] = js.native
  /**
    * The "factor" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryFactor: js.UndefOr[Double] = js.native
  /**
    * The "maxTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.native
  /**
    * The "minTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMintimeout: js.UndefOr[Double] = js.native
}

object FetchRetryOptions {
  @scala.inline
  def apply(): FetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchRetryOptions]
  }
  @scala.inline
  implicit class FetchRetryOptionsOps[Self <: FetchRetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetryFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetryFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetryMaxtimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMaxtimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetryMaxtimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMaxtimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRetryMintimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMintimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRetryMintimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRetryMintimeout")(js.undefined)
        ret
    }
  }
  
}

