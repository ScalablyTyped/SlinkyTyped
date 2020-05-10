package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for subscription seats.
  */
@js.native
trait SchemaSeats extends js.Object {
  /**
    * Identifies the resource as a subscription seat setting. Value:
    * subscriptions#seats
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Read-only field containing the current number of users that are assigned
    * a license for the product defined in skuId. This field&#39;s value is
    * equivalent to the numerical count of users returned by the Enterprise
    * License Manager API method: listForProductAndSku
    */
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
  /**
    * This is a required property and is exclusive to subscriptions with
    * FLEXIBLE or TRIAL plans. This property sets the maximum number of
    * licensed users allowed on a subscription. This quantity can be increased
    * up to the maximum limit defined in the reseller&#39;s contract. The
    * minimum quantity is the current number of users in the customer account.
    * Note: G Suite subscriptions automatically assign a license to every user.
    */
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
  /**
    * This is a required property and is exclusive to subscriptions with
    * ANNUAL_MONTHLY_PAY and ANNUAL_YEARLY_PAY plans. This property sets the
    * maximum number of licenses assignable to users on a subscription. The
    * reseller can add more licenses, but once set, the numberOfSeats cannot be
    * reduced until renewal. The reseller is invoiced based on the
    * numberOfSeats value regardless of how many of these user licenses are
    * assigned. Note: G Suite subscriptions automatically assign a license to
    * every user.
    */
  var numberOfSeats: js.UndefOr[Double] = js.native
}

object SchemaSeats {
  @scala.inline
  def apply(): SchemaSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeats]
  }
  @scala.inline
  implicit class SchemaSeatsOps[Self <: SchemaSeats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLicensedNumberOfSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedNumberOfSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensedNumberOfSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedNumberOfSeats")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumNumberOfSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumNumberOfSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfSeats")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSeats")(js.undefined)
        ret
    }
  }
  
}

