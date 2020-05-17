package typingsSlinky.googleCloudPubsub.subscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.bundleExecutorMod.BundleOptions
import typingsSlinky.googleGax.gaxMod.BackoffSettings
import typingsSlinky.googleGax.gaxMod.RetryOptions
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined google-gax.google-gax.CallOptions & {  autoCreate ? :boolean} */
@js.native
trait GetSubscriptionOptions extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.native
  var autoPaginate: js.UndefOr[Boolean] = js.native
  var bundleOptions: js.UndefOr[BundleOptions | Null] = js.native
  var isBundling: js.UndefOr[Boolean] = js.native
  var longrunning: js.UndefOr[BackoffSettings] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var otherArgs: js.UndefOr[StringDictionary[js.Any]] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var promise: js.UndefOr[PromiseConstructor] = js.native
  var retry: js.UndefOr[RetryOptions | Null] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object GetSubscriptionOptions {
  @scala.inline
  def apply(): GetSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubscriptionOptions]
  }
  @scala.inline
  implicit class GetSubscriptionOptionsOps[Self <: GetSubscriptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleOptions(value: BundleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleOptions")(null)
        ret
    }
    @scala.inline
    def withIsBundling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBundling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundling")(js.undefined)
        ret
    }
    @scala.inline
    def withLongrunning(value: BackoffSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longrunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongrunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longrunning")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherArgs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(null)
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
  }
  
}

