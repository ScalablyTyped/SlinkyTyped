package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClientAdexchangebuyer.AnonBidProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /** Your bidder locations that have distinct URLs. */
  var bidderLocation: js.UndefOr[js.Array[AnonBidProtocol]] = js.native
  /** The nid parameter value used in cookie match requests. Please contact your technical account manager if you need to change this. */
  var cookieMatchingNid: js.UndefOr[String] = js.native
  /** The base URL used in cookie match requests. */
  var cookieMatchingUrl: js.UndefOr[String] = js.native
  /** Account id. */
  var id: js.UndefOr[Double] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of active creatives that an account can have, where a creative is active if it was inserted or bid with in the last 30 days. Please
    * contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double] = js.native
  /** The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your technical account manager if you need to change this. */
  var maximumTotalQps: js.UndefOr[Double] = js.native
  /** The number of creatives that this account inserted or bid with in the last 30 days. */
  var numberActiveCreatives: js.UndefOr[Double] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidderLocation(value: js.Array[AnonBidProtocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidderLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidderLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidderLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieMatchingNid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMatchingNid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieMatchingNid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMatchingNid")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieMatchingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMatchingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieMatchingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMatchingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
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
    def withMaximumActiveCreatives(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumActiveCreatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumActiveCreatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumActiveCreatives")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumTotalQps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTotalQps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTotalQps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTotalQps")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberActiveCreatives(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberActiveCreatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberActiveCreatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberActiveCreatives")(js.undefined)
        ret
    }
  }
  
}

