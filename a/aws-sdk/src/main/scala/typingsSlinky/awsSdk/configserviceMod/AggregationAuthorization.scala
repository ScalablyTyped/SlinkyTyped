package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregationAuthorization extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the aggregation object.
    */
  var AggregationAuthorizationArn: js.UndefOr[String] = js.native
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: js.UndefOr[AccountId] = js.native
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.native
  /**
    * The time stamp when the aggregation authorization was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
}

object AggregationAuthorization {
  @scala.inline
  def apply(): AggregationAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationAuthorization]
  }
  @scala.inline
  implicit class AggregationAuthorizationOps[Self <: AggregationAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationAuthorizationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationAuthorizationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationAuthorizationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregationAuthorizationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizedAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizedAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedAwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedAwsRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
  }
  
}

