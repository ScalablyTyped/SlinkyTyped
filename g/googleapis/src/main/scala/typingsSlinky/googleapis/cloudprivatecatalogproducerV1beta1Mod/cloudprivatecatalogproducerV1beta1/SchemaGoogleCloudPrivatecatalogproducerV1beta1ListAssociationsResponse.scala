package typingsSlinky.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse extends js.Object {
  /**
    * The returned `Association` resources from the list call.
    */
  var associations: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]] = js.native
  /**
    * A pagination token returned from a previous call to `ListAssociations`
    * that indicates where the listing should continue from. This field is
    * optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
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
  }
  
}

