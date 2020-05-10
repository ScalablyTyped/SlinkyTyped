package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your get regions request.
    */
  var regions: js.UndefOr[RegionList] = js.native
}

object GetRegionsResult {
  @scala.inline
  def apply(): GetRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsResult]
  }
  @scala.inline
  implicit class GetRegionsResultOps[Self <: GetRegionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegions(value: RegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}

