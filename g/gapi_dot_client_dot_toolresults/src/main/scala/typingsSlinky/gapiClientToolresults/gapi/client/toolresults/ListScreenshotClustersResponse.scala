package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScreenshotClustersResponse extends js.Object {
  /** The set of clustres associated with an execution Always set */
  var clusters: js.UndefOr[js.Array[ScreenshotCluster]] = js.native
}

object ListScreenshotClustersResponse {
  @scala.inline
  def apply(): ListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScreenshotClustersResponse]
  }
  @scala.inline
  implicit class ListScreenshotClustersResponseOps[Self <: ListScreenshotClustersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: js.Array[ScreenshotCluster]): Self = {
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
  }
  
}

