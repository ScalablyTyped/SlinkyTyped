package typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replica extends js.Object {
  /**
    * <p>The region where the replica needs to be created.</p>
    */
  var RegionName: js.UndefOr[String] = js.native
}

object Replica {
  @scala.inline
  def apply(): Replica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replica]
  }
  @scala.inline
  implicit class ReplicaOps[Self <: Replica] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(js.undefined)
        ret
    }
  }
  
}

