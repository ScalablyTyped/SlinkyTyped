package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterStatus extends js.Object {
  /** Best routes for this router's network. */
  var bestRoutes: js.UndefOr[js.Array[Route]] = js.native
  /** Best routes learned by this router. */
  var bestRoutesForRouter: js.UndefOr[js.Array[Route]] = js.native
  var bgpPeerStatus: js.UndefOr[js.Array[RouterStatusBgpPeerStatus]] = js.native
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[String] = js.native
}

object RouterStatus {
  @scala.inline
  def apply(): RouterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterStatus]
  }
  @scala.inline
  implicit class RouterStatusOps[Self <: RouterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestRoutes(value: js.Array[Route]): Self = {
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
    def withBestRoutesForRouter(value: js.Array[Route]): Self = {
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
    def withBgpPeerStatus(value: js.Array[RouterStatusBgpPeerStatus]): Self = {
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

