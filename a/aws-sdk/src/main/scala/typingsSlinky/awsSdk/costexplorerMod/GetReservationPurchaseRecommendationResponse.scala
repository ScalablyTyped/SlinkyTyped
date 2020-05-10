package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationPurchaseRecommendationResponse extends js.Object {
  /**
    * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this recommendation.
    */
  var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.native
  /**
    * The pagination token for the next set of retrievable results.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * Recommendations for reservations to purchase.
    */
  var Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.native
}

object GetReservationPurchaseRecommendationResponse {
  @scala.inline
  def apply(): GetReservationPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservationPurchaseRecommendationResponse]
  }
  @scala.inline
  implicit class GetReservationPurchaseRecommendationResponseOps[Self <: GetReservationPurchaseRecommendationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: ReservationPurchaseRecommendationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: NextPageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendations(value: ReservationPurchaseRecommendations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recommendations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recommendations")(js.undefined)
        ret
    }
  }
  
}

