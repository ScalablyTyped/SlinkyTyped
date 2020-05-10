package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatus extends js.Object {
  /**
    * Best routes for this router&#39;s network.
    */
  var bestRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.native
  /**
    * Best routes learned by this router.
    */
  var bestRoutesForRouter: js.UndefOr[js.Array[SchemaRoute]] = js.native
  var bgpPeerStatus: js.UndefOr[js.Array[SchemaRouterStatusBgpPeerStatus]] = js.native
  var natStatus: js.UndefOr[js.Array[SchemaRouterStatusNatStatus]] = js.native
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.native
}

object SchemaRouterStatus {
  @scala.inline
  def apply(): SchemaRouterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatus]
  }
  @scala.inline
  implicit class SchemaRouterStatusOps[Self <: SchemaRouterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestRoutes(value: js.Array[SchemaRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withBestRoutesForRouter(value: js.Array[SchemaRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestRoutesForRouter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestRoutesForRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestRoutesForRouter")(js.undefined)
        ret
    }
    @scala.inline
    def withBgpPeerStatus(value: js.Array[SchemaRouterStatusBgpPeerStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpPeerStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNatStatus(value: js.Array[SchemaRouterStatusNatStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
  }
  
}

