package typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveDescription extends js.Object {
  /**
    * <p> The name of the Time to Live attribute for items in the table.</p>
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * <p> The Time to Live status for the table.</p>
    */
  var TimeToLiveStatus: js.UndefOr[ENABLING | DISABLING | ENABLED | DISABLED | String] = js.native
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
    def withAttributeName(value: String): Self = {
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
    def withTimeToLiveStatus(value: ENABLING | DISABLING | ENABLED | DISABLED | String): Self = {
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

