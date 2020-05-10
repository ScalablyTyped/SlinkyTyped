package typingsSlinky.appBuilderLib.parallelsVmMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.`win-10`
import typingsSlinky.appBuilderLib.appBuilderLibStrings.elementary
import typingsSlinky.appBuilderLib.appBuilderLibStrings.running
import typingsSlinky.appBuilderLib.appBuilderLibStrings.stopped
import typingsSlinky.appBuilderLib.appBuilderLibStrings.suspended
import typingsSlinky.appBuilderLib.appBuilderLibStrings.ubuntu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelsVm extends js.Object {
  var id: String = js.native
  var name: String = js.native
  var os: `win-10` | ubuntu | elementary = js.native
  var state: running | suspended | stopped = js.native
}

object ParallelsVm {
  @scala.inline
  def apply(id: String, name: String, os: `win-10` | ubuntu | elementary, state: running | suspended | stopped): ParallelsVm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelsVm]
  }
  @scala.inline
  implicit class ParallelsVmOps[Self <: ParallelsVm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
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
    def withOs(value: `win-10` | ubuntu | elementary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: running | suspended | stopped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

