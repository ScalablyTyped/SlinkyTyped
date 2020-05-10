package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroup extends js.Object {
  /**
    * The description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group family that this cluster parameter group is compatible with.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The list of tags for the cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ClusterParameterGroup {
  @scala.inline
  def apply(): ClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroup]
  }
  @scala.inline
  implicit class ClusterParameterGroupOps[Self <: ClusterParameterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

