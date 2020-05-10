package typingsSlinky.minecraftScriptingTypesClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
  * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
  */
@js.native
trait ISendUIEventParameters extends js.Object {
  /**
    * The data for the UI event being triggered
    */
  var data: String = js.native
  /**
    * The identifier of the UI event
    */
  var eventIdentifier: String = js.native
}

object ISendUIEventParameters {
  @scala.inline
  def apply(data: String, eventIdentifier: String): ISendUIEventParameters = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventIdentifier = eventIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISendUIEventParameters]
  }
  @scala.inline
  implicit class ISendUIEventParametersOps[Self <: ISendUIEventParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

