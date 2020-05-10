package typingsSlinky.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceIdLists extends js.Object {
  /**
    * List of input devices specified by their ID.
    * To indicate input devices should be unaffected, leave this property unset.
    */
  var input: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of output devices specified by their ID.
    * To indicate output devices should be unaffected, leave this property unset.
    */
  var output: js.UndefOr[js.Array[String]] = js.native
}

object DeviceIdLists {
  @scala.inline
  def apply(): DeviceIdLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIdLists]
  }
  @scala.inline
  implicit class DeviceIdListsOps[Self <: DeviceIdLists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

