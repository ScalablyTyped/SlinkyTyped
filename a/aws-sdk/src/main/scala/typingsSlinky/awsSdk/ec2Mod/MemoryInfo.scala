package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /**
    * Size of the memory, in MiB.
    */
  var SizeInMiB: js.UndefOr[MemorySize] = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeInMiB(value: MemorySize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInMiB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInMiB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInMiB")(js.undefined)
        ret
    }
  }
  
}

