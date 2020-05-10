package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveDescription extends js.Object {
  /**
    *  The name of the TTL attribute for items in the table.
    */
  var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.native
  /**
    *  The TTL status for the table.
    */
  var TimeToLiveStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TimeToLiveStatus] = js.native
}

object TimeToLiveDescription {
  @scala.inline
  def apply(): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeToLiveDescription]
  }
  @scala.inline
  implicit class TimeToLiveDescriptionOps[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: TimeToLiveAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLiveStatus(value: TimeToLiveStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLiveStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveStatus")(js.undefined)
        ret
    }
  }
  
}

