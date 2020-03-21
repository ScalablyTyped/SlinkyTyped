package typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOperationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. A filter for matching the requested operations.<br><br> The
    * supported formats of <b>filter</b> are:<br> To query for specific
    * function: <code>project:*,location:*,function:*</code><br> To query for
    * all of the latest operations for a project:
    * <code>project:*,latest:true</code>
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Must not be set.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The standard list page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

