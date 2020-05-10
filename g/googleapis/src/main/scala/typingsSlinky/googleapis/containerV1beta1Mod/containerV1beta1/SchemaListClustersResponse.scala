package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListClustersResponse is the result of ListClustersRequest.
  */
@js.native
trait SchemaListClustersResponse extends js.Object {
  /**
    * A list of clusters in the project in the specified zone, or across all
    * ones.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  /**
    * If any zones are listed here, the list of clusters returned may be
    * missing those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListClustersResponse {
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  @scala.inline
  implicit class SchemaListClustersResponseOps[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: js.Array[SchemaCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingZones")(js.undefined)
        ret
    }
  }
  
}

