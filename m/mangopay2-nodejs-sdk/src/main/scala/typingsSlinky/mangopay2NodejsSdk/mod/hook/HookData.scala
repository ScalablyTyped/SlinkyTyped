package typingsSlinky.mangopay2NodejsSdk.mod.hook

import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.mod.event.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookData extends EntityBaseData {
  /**
    * The event type
    */
  var EventType: typingsSlinky.mangopay2NodejsSdk.mod.event.EventType = js.native
  /**
    * Whether the hook is enabled or not
    */
  var Status: HookStatus = js.native
  /**
    * This is the URL where your receive notification for each EventType
    */
  var Url: String = js.native
  /**
    * Whether the hook is valid or not
    */
  var Validity: HookValidity = js.native
}

object HookData {
  @scala.inline
  def apply(
    CreationDate: Double,
    EventType: EventType,
    Id: String,
    Status: HookStatus,
    Tag: String,
    Url: String,
    Validity: HookValidity
  ): HookData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookData]
  }
  @scala.inline
  implicit class HookDataOps[Self <: HookData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: HookStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidity(value: HookValidity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

