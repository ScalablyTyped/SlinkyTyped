package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdClient extends js.Object {
  /** Whether this ad client is opted in to ARC. */
  var arcOptIn: js.UndefOr[Boolean] = js.native
  /** Unique identifier of this ad client. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adsensehost#adClient. */
  var kind: js.UndefOr[String] = js.native
  /** This ad client's product code, which corresponds to the PRODUCT_CODE report dimension. */
  var productCode: js.UndefOr[String] = js.native
  /** Whether this ad client supports being reported on. */
  var supportsReporting: js.UndefOr[Boolean] = js.native
}

object AdClient {
  @scala.inline
  def apply(): AdClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdClient]
  }
  @scala.inline
  implicit class AdClientOps[Self <: AdClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcOptIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcOptIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcOptIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcOptIn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsReporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsReporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsReporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsReporting")(js.undefined)
        ret
    }
  }
  
}

