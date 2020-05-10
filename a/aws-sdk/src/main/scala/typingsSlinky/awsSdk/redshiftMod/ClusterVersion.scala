package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterVersion extends js.Object {
  /**
    * The name of the cluster parameter group family for the cluster.
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The version number used by the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The description of the cluster version.
    */
  var Description: js.UndefOr[String] = js.native
}

object ClusterVersion {
  @scala.inline
  def apply(): ClusterVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterVersion]
  }
  @scala.inline
  implicit class ClusterVersionOps[Self <: ClusterVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterParameterGroupFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroupFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterParameterGroupFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroupFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterVersion")(js.undefined)
        ret
    }
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
  }
  
}

