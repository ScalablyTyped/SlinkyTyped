package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selector that chooses target cluster for jobs based on metadata.
  */
@js.native
trait SchemaClusterSelector extends js.Object {
  /**
    * Required. The cluster labels. Cluster must have all labels to match.
    */
  var clusterLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The zone where workflow process executes. This parameter does
    * not affect the selection of the cluster.If unspecified, the zone of the
    * first cluster matching the selector is used.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaClusterSelector {
  @scala.inline
  def apply(): SchemaClusterSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterSelector]
  }
  @scala.inline
  implicit class SchemaClusterSelectorOps[Self <: SchemaClusterSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

