package typingsSlinky.naverDashWhale.whale.system.cpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorInfo extends js.Object {
  /** Cumulative usage info for this logical processor. */
  var usage: typingsSlinky.chrome.chrome.system.cpu.ProcessorUsage
}

object ProcessorInfo {
  @scala.inline
  def apply(usage: typingsSlinky.chrome.chrome.system.cpu.ProcessorUsage): ProcessorInfo = {
    val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessorInfo]
  }
}

