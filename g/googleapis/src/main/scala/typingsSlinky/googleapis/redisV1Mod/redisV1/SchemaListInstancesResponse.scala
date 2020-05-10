package typingsSlinky.googleapis.redisV1Mod.redisV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * A list of Redis instances in the project in the specified location, or
    * across all locations.  If the `location_id` in the parent field of the
    * request is &quot;-&quot;, all regions available to the project are
    * queried, and the results aggregated. If in such an aggregated query a
    * location is unavailable, a dummy Redis entry is included in the response
    * with the &quot;name&quot; field set to a value of the form
    * projects/{project_id}/locations/{location_id}/instances/- and the
    * &quot;status&quot; field set to ERROR and &quot;status_message&quot;
    * field set to &quot;location not available for ListInstances&quot;.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
  @scala.inline
  implicit class SchemaListInstancesResponseOps[Self <: SchemaListInstancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: js.Array[SchemaInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUnreachable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreachable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreachable")(js.undefined)
        ret
    }
  }
  
}

