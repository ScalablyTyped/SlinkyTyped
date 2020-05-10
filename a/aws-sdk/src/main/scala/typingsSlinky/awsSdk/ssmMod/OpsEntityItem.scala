package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsEntityItem extends js.Object {
  /**
    * The time OpsItem data was captured.
    */
  var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime] = js.native
  /**
    * The detailed data content for an OpsItem summaries result item.
    */
  var Content: js.UndefOr[OpsEntityItemEntryList] = js.native
}

object OpsEntityItem {
  @scala.inline
  def apply(): OpsEntityItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntityItem]
  }
  @scala.inline
  implicit class OpsEntityItemOps[Self <: OpsEntityItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureTime(value: OpsEntityItemCaptureTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: OpsEntityItemEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
  }
  
}

