package typingsSlinky.activeWin.mod

import typingsSlinky.activeWin.activeWinStrings.macos
import typingsSlinky.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacOSResult
  extends BaseResult
     with Result {
  @JSName("owner")
  var owner_MacOSResult: MacOSOwner = js.native
  var platform: macos = js.native
}

object MacOSResult {
  @scala.inline
  def apply(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, platform: macos, title: String): MacOSResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSResult]
  }
  @scala.inline
  implicit class MacOSResultOps[Self <: MacOSResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: MacOSOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: macos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

