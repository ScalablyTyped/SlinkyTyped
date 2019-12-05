package typingsSlinky.atGoogleDashCloudCommon.buildSrcUtilMod

import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequest extends js.Object {
  var authClient: GoogleAuth = js.native
  def apply(reqOpts: DecorateRequestOptions): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
  def getCredentials(
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error | Null], 
      /* credentials */ js.UndefOr[CredentialBody], 
      Unit
    ]
  ): Unit = js.native
}

