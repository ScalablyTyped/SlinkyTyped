package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListServiceConfigs method.
  */
@js.native
trait SchemaListServiceConfigsResponse extends js.Object {
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of service configuration resources.
    */
  var serviceConfigs: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaListServiceConfigsResponse {
  @scala.inline
  def apply(): SchemaListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceConfigsResponse]
  }
  @scala.inline
  implicit class SchemaListServiceConfigsResponseOps[Self <: SchemaListServiceConfigsResponse] (val x: Self) extends AnyVal {
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
    def withServiceConfigs(value: js.Array[SchemaService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigs")(js.undefined)
        ret
    }
  }
  
}

