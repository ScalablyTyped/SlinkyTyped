package typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaDescription extends js.Object {
  /**
    * <p>The name of the region.</p>
    */
  var RegionName: js.UndefOr[String] = js.native
}

object ReplicaDescription {
  @scala.inline
  def apply(): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaDescription]
  }
  @scala.inline
  implicit class ReplicaDescriptionOps[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
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

