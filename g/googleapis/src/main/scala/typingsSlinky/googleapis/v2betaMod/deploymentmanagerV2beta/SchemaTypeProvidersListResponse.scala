package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Type Providers supported by Deployment Manager
  */
@js.native
trait SchemaTypeProvidersListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource type providers supported by Deployment
    * Manager.
    */
  var typeProviders: js.UndefOr[js.Array[SchemaTypeProvider]] = js.native
}

object SchemaTypeProvidersListResponse {
  @scala.inline
  def apply(): SchemaTypeProvidersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvidersListResponse]
  }
  @scala.inline
  implicit class SchemaTypeProvidersListResponseOps[Self <: SchemaTypeProvidersListResponse] (val x: Self) extends AnyVal {
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
    def withTypeProviders(value: js.Array[SchemaTypeProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeProviders")(js.undefined)
        ret
    }
  }
  
}

