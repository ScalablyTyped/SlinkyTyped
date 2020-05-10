package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootClusterMessage extends js.Object {
  /**
    * The cluster identifier.
    */
  var ClusterIdentifier: String = js.native
}

object RebootClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): RebootClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootClusterMessage]
  }
  @scala.inline
  implicit class RebootClusterMessageOps[Self <: RebootClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

