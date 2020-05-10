package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The store page resources for the enterprise.
  */
@js.native
trait SchemaStoreLayoutClustersListResponse extends js.Object {
  /**
    * A store cluster of an enterprise.
    */
  var cluster: js.UndefOr[js.Array[SchemaStoreCluster]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutClustersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaStoreLayoutClustersListResponse {
  @scala.inline
  def apply(): SchemaStoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutClustersListResponse]
  }
  @scala.inline
  implicit class SchemaStoreLayoutClustersListResponseOps[Self <: SchemaStoreLayoutClustersListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: js.Array[SchemaStoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

