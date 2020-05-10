package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaScreenshotCluster extends js.Object {
  /**
    * A string that describes the activity of every screen in the cluster.
    */
  var activity: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the cluster.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * A singular screen that represents the cluster as a whole. This screen
    * will act as the &quot;cover&quot; of the entire cluster. When users look
    * at the clusters, only the key screen from each cluster will be shown.
    * Which screen is the key screen is determined by the ClusteringAlgorithm
    */
  var keyScreen: js.UndefOr[SchemaScreen] = js.native
  /**
    * Full list of screens.
    */
  var screens: js.UndefOr[js.Array[SchemaScreen]] = js.native
}

object SchemaScreenshotCluster {
  @scala.inline
  def apply(): SchemaScreenshotCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreenshotCluster]
  }
  @scala.inline
  implicit class SchemaScreenshotClusterOps[Self <: SchemaScreenshotCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyScreen(value: SchemaScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withScreens(value: js.Array[SchemaScreen]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screens")(js.undefined)
        ret
    }
  }
  
}

