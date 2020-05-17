package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mod.event.EventType
import typingsSlinky.mangopay2NodejsSdk.mod.hook.HookStatus
import typingsSlinky.mangopay2NodejsSdk.mod.hook.HookValidity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData> */
@js.native
trait PartialHookData extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.native
  var EventType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.event.EventType] = js.native
  var Id: js.UndefOr[String] = js.native
  var Status: js.UndefOr[HookStatus] = js.native
  var Tag: js.UndefOr[String] = js.native
  var Url: js.UndefOr[String] = js.native
  var Validity: js.UndefOr[HookValidity] = js.native
}

object PartialHookData {
  @scala.inline
  def apply(): PartialHookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookData]
  }
  @scala.inline
  implicit class PartialHookDataOps[Self <: PartialHookData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: HookStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
    @scala.inline
    def withValidity(value: HookValidity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(js.undefined)
        ret
    }
  }
  
}

