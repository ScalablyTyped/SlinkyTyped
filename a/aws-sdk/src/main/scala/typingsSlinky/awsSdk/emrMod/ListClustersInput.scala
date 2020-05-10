package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersInput extends js.Object {
  /**
    * The cluster state filters to apply when listing clusters.
    */
  var ClusterStates: js.UndefOr[ClusterStateList] = js.native
  /**
    * The creation date and time beginning value filter for listing clusters.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.native
  /**
    * The creation date and time end value filter for listing clusters.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
}

object ListClustersInput {
  @scala.inline
  def apply(): ListClustersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersInput]
  }
  @scala.inline
  implicit class ListClustersInputOps[Self <: ListClustersInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterStates(value: ClusterStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterStates")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
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

