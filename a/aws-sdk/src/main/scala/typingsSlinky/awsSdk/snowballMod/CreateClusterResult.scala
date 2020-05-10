package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResult extends js.Object {
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClusterId] = js.native
}

object CreateClusterResult {
  @scala.inline
  def apply(): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResult]
  }
  @scala.inline
  implicit class CreateClusterResultOps[Self <: CreateClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
  }
  
}

