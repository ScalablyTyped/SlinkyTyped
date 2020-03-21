package typingsSlinky.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCatalogsProductsVersionsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]'.  A
    * unique identifier for the version under a product, which can't be changed
    * after the version is created. The final segment of the name must between
    * 1 and 63 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  /**
    * Field mask that controls which fields of the version should be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

