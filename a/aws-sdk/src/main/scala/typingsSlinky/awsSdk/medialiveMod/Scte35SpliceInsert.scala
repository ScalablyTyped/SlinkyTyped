package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35SpliceInsert extends js.Object {
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.native
  /**
    * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.native
  /**
    * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.native
}

object Scte35SpliceInsert {
  @scala.inline
  def apply(): Scte35SpliceInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte35SpliceInsert]
  }
  @scala.inline
  implicit class Scte35SpliceInsertOps[Self <: Scte35SpliceInsert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdAvailOffset(value: integerMinNegative1000Max1000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdAvailOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdAvailOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdAvailOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRegionalBlackoutFlag(value: Scte35SpliceInsertNoRegionalBlackoutBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoRegionalBlackoutFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRegionalBlackoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoRegionalBlackoutFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDeliveryAllowedFlag(value: Scte35SpliceInsertWebDeliveryAllowedBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebDeliveryAllowedFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDeliveryAllowedFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebDeliveryAllowedFlag")(js.undefined)
        ret
    }
  }
  
}

