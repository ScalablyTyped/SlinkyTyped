package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListServicePerimetersRequest`.
  */
@js.native
trait SchemaListServicePerimetersResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of the Service Perimeter instances.
    */
  var servicePerimeters: js.UndefOr[js.Array[SchemaServicePerimeter]] = js.native
}

object SchemaListServicePerimetersResponse {
  @scala.inline
  def apply(): SchemaListServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServicePerimetersResponse]
  }
  @scala.inline
  implicit class SchemaListServicePerimetersResponseOps[Self <: SchemaListServicePerimetersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withServicePerimeters(value: js.Array[SchemaServicePerimeter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePerimeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePerimeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePerimeters")(js.undefined)
        ret
    }
  }
  
}

