package typingsSlinky.gapiClientTesting.gapi.client.testing

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTesting.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEnvironmentCatalogResource extends js.Object {
  /**
    * Get the catalog of supported test environments.
    *
    * May return any of the following canonical error codes:
    *
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the environment type does not exist
    * - INTERNAL - if an internal error occurred
    */
  def get(request: AnonBearertoken): Request_[TestEnvironmentCatalog] = js.native
}

object TestEnvironmentCatalogResource {
  @scala.inline
  def apply(get: AnonBearertoken => Request_[TestEnvironmentCatalog]): TestEnvironmentCatalogResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TestEnvironmentCatalogResource]
  }
  @scala.inline
  implicit class TestEnvironmentCatalogResourceOps[Self <: TestEnvironmentCatalogResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[TestEnvironmentCatalog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

