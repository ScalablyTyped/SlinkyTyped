package typingsSlinky.chromeApps.chrome.system.memory

import typingsSlinky.chromeApps.chrome.double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /** The amount of available capacity, in bytes. */
  var availableCapacity: double = js.native
  /** The total amount of physical memory capacity, in bytes. */
  var capacity: double = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(availableCapacity: double, capacity: double): MemoryInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableCapacity(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

