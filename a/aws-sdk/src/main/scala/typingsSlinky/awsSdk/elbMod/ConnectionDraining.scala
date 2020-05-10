package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionDraining extends js.Object {
  /**
    * Specifies whether connection draining is enabled for the load balancer.
    */
  var Enabled: ConnectionDrainingEnabled = js.native
  /**
    * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
    */
  var Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.native
}

object ConnectionDraining {
  @scala.inline
  def apply(Enabled: ConnectionDrainingEnabled): ConnectionDraining = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionDraining]
  }
  @scala.inline
  implicit class ConnectionDrainingOps[Self <: ConnectionDraining] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: ConnectionDrainingEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: ConnectionDrainingTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(js.undefined)
        ret
    }
  }
  
}

