package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteReadReplicaDBClusterMessage extends js.Object {
  /**
    * Not supported.
    */
  var DBClusterIdentifier: String = js.native
}

object PromoteReadReplicaDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteReadReplicaDBClusterMessage]
  }
  @scala.inline
  implicit class PromoteReadReplicaDBClusterMessageOps[Self <: PromoteReadReplicaDBClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

