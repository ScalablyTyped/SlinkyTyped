package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleAuthLibrary.credentialsMod.CredentialBody
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeAuthenticatedRequest extends js.Object {
  
  def apply(reqOpts: DecorateRequestOptions): Duplexify = js.native
  def apply(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
  
  var authClient: GoogleAuth = js.native
  
  def getCredentials(
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error | Null], 
      /* credentials */ js.UndefOr[CredentialBody], 
      Unit
    ]
  ): Unit = js.native
}
