package typingsSlinky.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostAPI extends js.Object {
  var defaultInput: Double = js.native
  var defaultOutput: Double = js.native
  var deviceCount: Double = js.native
  var id: Double = js.native
  var name: String = js.native
  var `type`: String = js.native
}

object HostAPI {
  @scala.inline
  def apply(
    defaultInput: Double,
    defaultOutput: Double,
    deviceCount: Double,
    id: Double,
    name: String,
    `type`: String
  ): HostAPI = {
    val __obj = js.Dynamic.literal(defaultInput = defaultInput.asInstanceOf[js.Any], defaultOutput = defaultOutput.asInstanceOf[js.Any], deviceCount = deviceCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAPI]
  }
  @scala.inline
  implicit class HostAPIOps[Self <: HostAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultInput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOutput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

