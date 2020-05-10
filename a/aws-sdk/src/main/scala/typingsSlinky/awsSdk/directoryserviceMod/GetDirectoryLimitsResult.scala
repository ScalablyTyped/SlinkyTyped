package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryLimitsResult extends js.Object {
  /**
    * A DirectoryLimits object that contains the directory limits for the current rRegion.
    */
  var DirectoryLimits: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryLimits] = js.native
}

object GetDirectoryLimitsResult {
  @scala.inline
  def apply(): GetDirectoryLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDirectoryLimitsResult]
  }
  @scala.inline
  implicit class GetDirectoryLimitsResultOps[Self <: GetDirectoryLimitsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryLimits(value: DirectoryLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryLimits")(js.undefined)
        ret
    }
  }
  
}

