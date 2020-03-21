package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleAuthLibrary.credentialsMod.CredentialBody
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequest extends js.Object {
  var authClient: GoogleAuth = js.native
  def apply(reqOpts: DecorateRequestOptions): Duplexify = js.native
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

