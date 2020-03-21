package typingsSlinky.googleapis.testingV1Mod.testingV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTestmatricesCancel extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Cloud project that owns the test.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Test matrix that will be canceled.
    */
  var testMatrixId: js.UndefOr[String] = js.native
}

