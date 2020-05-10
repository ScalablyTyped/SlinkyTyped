package typingsSlinky.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDimensionKeysResponse extends js.Object {
  /**
    * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The dimension keys that were requested.
    */
  var Keys: js.UndefOr[DimensionKeyDescriptionList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * If PartitionBy was present in the request, PartitionKeys contains the breakdown of dimension keys by the specified partitions.
    */
  var PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.native
}

object DescribeDimensionKeysResponse {
  @scala.inline
  def apply(): DescribeDimensionKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDimensionKeysResponse]
  }
  @scala.inline
  implicit class DescribeDimensionKeysResponseOps[Self <: DescribeDimensionKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignedEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignedEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignedEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignedEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignedStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignedStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignedStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignedStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: DimensionKeyDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKeys(value: ResponsePartitionKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKeys")(js.undefined)
        ret
    }
  }
  
}

