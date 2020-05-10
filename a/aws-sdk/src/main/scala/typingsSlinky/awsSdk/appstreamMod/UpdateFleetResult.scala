package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetResult extends js.Object {
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Fleet] = js.native
}

object UpdateFleetResult {
  @scala.inline
  def apply(): UpdateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetResult]
  }
  @scala.inline
  implicit class UpdateFleetResultOps[Self <: UpdateFleetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleet(value: Fleet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fleet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fleet")(js.undefined)
        ret
    }
  }
  
}

