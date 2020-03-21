package typingsSlinky.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCatalogsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Forces deletion of the `Catalog` and its `Association` resources. If the
    * `Catalog` is still associated with other resources and force is not set
    * to true, then the operation fails.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The resource name of the catalog.
    */
  var name: js.UndefOr[String] = js.native
}

