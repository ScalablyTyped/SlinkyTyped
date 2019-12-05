package typingsSlinky.googleDashAuthDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAuthGoogleauthMod {
  import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWT
  import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
  import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClient

  type ADCCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* credential */ js.UndefOr[OAuth2Client], 
    /* projectId */ js.UndefOr[String | Null], 
    Unit
  ]
  type CredentialCallback = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[UserRefreshClient | JWT], Unit]
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | Null], 
    /* projectId */ js.UndefOr[String | Null], 
    Unit
  ]
}
