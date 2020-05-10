package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemMemoryInfo extends js.Object {
  /**
    * The total amount of memory not being used by applications or disk cache.
    */
  var free: Double = js.native
  /**
    * The free amount of swap memory in Kilobytes available to the system.
    */
  var swapFree: Double = js.native
  /**
    * The total amount of swap memory in Kilobytes available to the system.
    */
  var swapTotal: Double = js.native
  /**
    * The total amount of physical memory in Kilobytes available to the system.
    */
  var total: Double = js.native
}

object SystemMemoryInfo {
  @scala.inline
  def apply(free: Double, swapFree: Double, swapTotal: Double, total: Double): SystemMemoryInfo = {
    val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], swapFree = swapFree.asInstanceOf[js.Any], swapTotal = swapTotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMemoryInfo]
  }
  @scala.inline
  implicit class SystemMemoryInfoOps[Self <: SystemMemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapFree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapFree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

