package typingsSlinky.gapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContainer.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZonesResource extends js.Object {
  var clusters: ClustersResource = js.native
  var operations: OperationsResource = js.native
  /** Returns configuration info about the Container Engine service. */
  def getServerconfig(request: Bearertoken): Request[ServerConfig] = js.native
}

object ZonesResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    getServerconfig: Bearertoken => Request[ServerConfig],
    operations: OperationsResource
  ): ZonesResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], getServerconfig = js.Any.fromFunction1(getServerconfig), operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZonesResource]
  }
  @scala.inline
  implicit class ZonesResourceOps[Self <: ZonesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: ClustersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetServerconfig(value: Bearertoken => Request[ServerConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getServerconfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperations(value: OperationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

