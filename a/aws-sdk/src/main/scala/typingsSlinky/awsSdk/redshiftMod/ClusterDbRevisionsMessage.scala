package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDbRevisionsMessage extends js.Object {
  /**
    * A list of revisions.
    */
  var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.native
  /**
    * A string representing the starting point for the next set of revisions. If a value is returned in a response, you can retrieve the next set of revisions by providing the value in the marker parameter and retrying the command. If the marker field is empty, all revisions have already been returned.
    */
  var Marker: js.UndefOr[String] = js.native
}

object ClusterDbRevisionsMessage {
  @scala.inline
  def apply(): ClusterDbRevisionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDbRevisionsMessage]
  }
  @scala.inline
  implicit class ClusterDbRevisionsMessageOps[Self <: ClusterDbRevisionsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterDbRevisions(value: ClusterDbRevisionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterDbRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterDbRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterDbRevisions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

