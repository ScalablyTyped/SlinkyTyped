package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDiscovererResponse extends js.Object {
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
}

object StartDiscovererResponse {
  @scala.inline
  def apply(): StartDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDiscovererResponse]
  }
  @scala.inline
  implicit class StartDiscovererResponseOps[Self <: StartDiscovererResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscovererId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovererId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DiscovererState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

