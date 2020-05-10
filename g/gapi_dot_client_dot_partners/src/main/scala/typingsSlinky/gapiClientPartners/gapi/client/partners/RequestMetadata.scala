package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMetadata extends js.Object {
  /** Experiment IDs the current request belongs to. */
  var experimentIds: js.UndefOr[js.Array[String]] = js.native
  /** Locale to use for the current request. */
  var locale: js.UndefOr[String] = js.native
  /** Google Partners session ID. */
  var partnersSessionId: js.UndefOr[String] = js.native
  /** Source of traffic for the current request. */
  var trafficSource: js.UndefOr[TrafficSource] = js.native
  /**
    * Values to use instead of the user's respective defaults for the current
    * request. These are only honored by whitelisted products.
    */
  var userOverrides: js.UndefOr[UserOverrides] = js.native
}

object RequestMetadata {
  @scala.inline
  def apply(): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMetadata]
  }
  @scala.inline
  implicit class RequestMetadataOps[Self <: RequestMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnersSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnersSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnersSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnersSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficSource(value: TrafficSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficSource")(js.undefined)
        ret
    }
    @scala.inline
    def withUserOverrides(value: UserOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userOverrides")(js.undefined)
        ret
    }
  }
  
}

