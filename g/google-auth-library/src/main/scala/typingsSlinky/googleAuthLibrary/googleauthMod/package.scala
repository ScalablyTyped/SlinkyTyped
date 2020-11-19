package typingsSlinky.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object googleauthMod {
  
  type ADCCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* credential */ js.UndefOr[typingsSlinky.googleAuthLibrary.oauth2clientMod.OAuth2Client], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  
  type CredentialCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[
      typingsSlinky.googleAuthLibrary.refreshclientMod.UserRefreshClient | typingsSlinky.googleAuthLibrary.jwtclientMod.JWT
    ], 
    scala.Unit
  ]
  
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
}
