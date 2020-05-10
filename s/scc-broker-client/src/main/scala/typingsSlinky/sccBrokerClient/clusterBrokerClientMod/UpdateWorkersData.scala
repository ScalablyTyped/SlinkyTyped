package typingsSlinky.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkersData extends js.Object {
  var sourceWorkerURI: String = js.native
  var workerURIs: String = js.native
}

object UpdateWorkersData {
  @scala.inline
  def apply(sourceWorkerURI: String, workerURIs: String): UpdateWorkersData = {
    val __obj = js.Dynamic.literal(sourceWorkerURI = sourceWorkerURI.asInstanceOf[js.Any], workerURIs = workerURIs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkersData]
  }
  @scala.inline
  implicit class UpdateWorkersDataOps[Self <: UpdateWorkersData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceWorkerURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceWorkerURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerURIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerURIs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

