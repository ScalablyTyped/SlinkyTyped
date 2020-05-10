package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreLayoutClustersListResponse extends js.Object {
  /** A store cluster of an enterprise. */
  var cluster: js.UndefOr[js.Array[StoreCluster]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutClustersListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object StoreLayoutClustersListResponse {
  @scala.inline
  def apply(): StoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutClustersListResponse]
  }
  @scala.inline
  implicit class StoreLayoutClustersListResponseOps[Self <: StoreLayoutClustersListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: js.Array[StoreCluster]): Self = {
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

