package typingsSlinky.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterParameterGroupResult extends js.Object {
  var ClusterParameterGroup: js.UndefOr[typingsSlinky.awsDashSdk.clientsRedshiftMod.ClusterParameterGroup] = js.native
}

object CreateClusterParameterGroupResult {
  @scala.inline
  def apply(ClusterParameterGroup: ClusterParameterGroup = null): CreateClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterGroup != null) __obj.updateDynamic("ClusterParameterGroup")(ClusterParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterParameterGroupResult]
  }
}

