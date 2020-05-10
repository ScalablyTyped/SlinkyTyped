package typingsSlinky.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHomeRegionResult extends js.Object {
  /**
    * The name of the home region of the calling account.
    */
  var HomeRegion: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
}

object GetHomeRegionResult {
  @scala.inline
  def apply(): GetHomeRegionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHomeRegionResult]
  }
  @scala.inline
  implicit class GetHomeRegionResultOps[Self <: GetHomeRegionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeRegion(value: HomeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(js.undefined)
        ret
    }
  }
  
}

