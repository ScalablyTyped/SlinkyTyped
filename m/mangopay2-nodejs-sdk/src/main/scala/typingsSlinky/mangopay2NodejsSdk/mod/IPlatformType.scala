package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlatformType extends js.Object {
  var CROWDFUNDING_DONATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION = js.native
  var CROWDFUNDING_EQUITY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY = js.native
  var CROWDFUNDING_LOAN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN = js.native
  var CROWDFUNDING_REWARD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD = js.native
  var MARKETPLACE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = js.native
  var NotSpecified: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  var OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = js.native
  var P2P_PAYMENT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT = js.native
}

object IPlatformType {
  @scala.inline
  def apply(
    CROWDFUNDING_DONATION: CROWDFUNDING_DONATION,
    CROWDFUNDING_EQUITY: CROWDFUNDING_EQUITY,
    CROWDFUNDING_LOAN: CROWDFUNDING_LOAN,
    CROWDFUNDING_REWARD: CROWDFUNDING_REWARD,
    MARKETPLACE: MARKETPLACE,
    NotSpecified: NotSpecified,
    OTHER: OTHER,
    P2P_PAYMENT: P2P_PAYMENT
  ): IPlatformType = {
    val __obj = js.Dynamic.literal(CROWDFUNDING_DONATION = CROWDFUNDING_DONATION.asInstanceOf[js.Any], CROWDFUNDING_EQUITY = CROWDFUNDING_EQUITY.asInstanceOf[js.Any], CROWDFUNDING_LOAN = CROWDFUNDING_LOAN.asInstanceOf[js.Any], CROWDFUNDING_REWARD = CROWDFUNDING_REWARD.asInstanceOf[js.Any], MARKETPLACE = MARKETPLACE.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], P2P_PAYMENT = P2P_PAYMENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlatformType]
  }
  @scala.inline
  implicit class IPlatformTypeOps[Self <: IPlatformType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCROWDFUNDING_DONATION(value: CROWDFUNDING_DONATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROWDFUNDING_DONATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCROWDFUNDING_EQUITY(value: CROWDFUNDING_EQUITY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROWDFUNDING_EQUITY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCROWDFUNDING_LOAN(value: CROWDFUNDING_LOAN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROWDFUNDING_LOAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCROWDFUNDING_REWARD(value: CROWDFUNDING_REWARD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROWDFUNDING_REWARD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMARKETPLACE(value: MARKETPLACE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MARKETPLACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSpecified(value: NotSpecified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotSpecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOTHER(value: OTHER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTHER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP2P_PAYMENT(value: P2P_PAYMENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P2P_PAYMENT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

