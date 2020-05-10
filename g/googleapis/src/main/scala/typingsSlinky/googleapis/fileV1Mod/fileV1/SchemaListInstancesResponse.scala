package typingsSlinky.googleapis.fileV1Mod.fileV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListInstancesResponse is the result of ListInstancesRequest.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * A list of instances in the project for the specified location.  If the
    * {location} value in the request is &quot;-&quot;, the response contains a
    * list of instances from all locations. If any location is unreachable, the
    * response will only return instances in reachable locations and the
    * &quot;unreachable&quot; field will be populated with a list of
    * unreachable locations.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * The token you can use to retrieve the next page of results. Not returned
    * if there are no more results in the list.
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

