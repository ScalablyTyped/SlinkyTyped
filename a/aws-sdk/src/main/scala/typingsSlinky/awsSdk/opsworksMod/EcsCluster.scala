package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EcsCluster extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
  /**
    * The cluster name.
    */
  var EcsClusterName: js.UndefOr[String] = js.native
  /**
    * The time and date that the cluster was registered with the stack.
    */
  var RegisteredAt: js.UndefOr[DateTime] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object EcsCluster {
  @scala.inline
  def apply(): EcsCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsCluster]
  }
  @scala.inline
  implicit class EcsClusterOps[Self <: EcsCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEcsClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

