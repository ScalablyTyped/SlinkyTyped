package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /** Maximum memory that can be allocated to the process in KiB */
  var memoryCapInKibibyte: js.UndefOr[String] = js.native
  /** Total memory available on the device in KiB */
  var memoryTotalInKibibyte: js.UndefOr[String] = js.native
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
    def withMemoryCapInKibibyte(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCapInKibibyte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryCapInKibibyte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCapInKibibyte")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryTotalInKibibyte(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryTotalInKibibyte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryTotalInKibibyte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryTotalInKibibyte")(js.undefined)
        ret
    }
  }
  
}

