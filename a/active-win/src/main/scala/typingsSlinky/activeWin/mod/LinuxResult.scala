package typingsSlinky.activeWin.mod

import typingsSlinky.activeWin.activeWinStrings.linux
import typingsSlinky.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxResult
  extends BaseResult
     with Result {
  var platform: linux = js.native
}

object LinuxResult {
  @scala.inline
  def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, platform: linux, title: String): LinuxResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxResult]
  }
  @scala.inline
  implicit class LinuxResultOps[Self <: LinuxResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatform(value: linux): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

