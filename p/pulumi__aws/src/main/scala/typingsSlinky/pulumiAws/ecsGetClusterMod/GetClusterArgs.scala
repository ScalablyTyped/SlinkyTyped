package typingsSlinky.pulumiAws.ecsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * The name of the ECS Cluster
    */
  val clusterName: String = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterName: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
  @scala.inline
  implicit class GetClusterArgsOps[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

