package typingsSlinky.npmRegistryFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.FetchRetryOptions> */
@js.native
trait PartialFetchRetryOptions extends js.Object {
  var fetchRetries: js.UndefOr[Double] = js.native
  var fetchRetryFactor: js.UndefOr[Double] = js.native
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.native
  var fetchRetryMintimeout: js.UndefOr[Double] = js.native
}

object PartialFetchRetryOptions {
  @scala.inline
  def apply(): PartialFetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFetchRetryOptions]
  }
  @scala.inline
  implicit class PartialFetchRetryOptionsOps[Self <: PartialFetchRetryOptions] (val x: Self) extends AnyVal {
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

