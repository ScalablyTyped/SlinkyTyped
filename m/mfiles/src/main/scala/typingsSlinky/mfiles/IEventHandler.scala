package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFEventHandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventHandler extends js.Object {
  var Active: Boolean = js.native
  var Description: String = js.native
  var EventType: MFEventHandlerType = js.native
  val GUID: String = js.native
  var VBScript: String = js.native
  def Clone(): IEventHandler = js.native
  def GetID(): Double = js.native
}

object IEventHandler {
  @scala.inline
  def apply(
    Active: Boolean,
    Clone: () => IEventHandler,
    Description: String,
    EventType: MFEventHandlerType,
    GUID: String,
    GetID: () => Double,
    VBScript: String
  ): IEventHandler = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], GetID = js.Any.fromFunction0(GetID), VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventHandler]
  }
  @scala.inline
  implicit class IEventHandlerOps[Self <: IEventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: MFEventHandlerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVBScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBScript")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

