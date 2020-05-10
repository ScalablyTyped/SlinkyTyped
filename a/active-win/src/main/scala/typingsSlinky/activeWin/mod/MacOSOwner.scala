package typingsSlinky.activeWin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacOSOwner extends BaseOwner {
  /**
  		Bundle identifier.
  		*/
  var bundleId: Double = js.native
}

object MacOSOwner {
  @scala.inline
  def apply(bundleId: Double, name: String, path: String, processId: Double): MacOSOwner = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSOwner]
  }
  @scala.inline
  implicit class MacOSOwnerOps[Self <: MacOSOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

