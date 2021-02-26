package typingsSlinky.firebaseAdmin.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object auth {
  
  @scala.inline
  def apply(): typingsSlinky.firebaseAdmin.authMod.auth.Auth = typingsSlinky.firebaseAdmin.authMod.auth.^.asInstanceOf[js.Dynamic].applyDynamic("auth")().asInstanceOf[typingsSlinky.firebaseAdmin.authMod.auth.Auth]
  @scala.inline
  def apply(app: typingsSlinky.firebaseAdmin.firebaseNamespaceApiMod.app.App): typingsSlinky.firebaseAdmin.authMod.auth.Auth = typingsSlinky.firebaseAdmin.authMod.auth.^.asInstanceOf[js.Dynamic].applyDynamic("auth")(app.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.firebaseAdmin.authMod.auth.Auth]
  
  /**
    * Identifies a second factor type.
    */
  type AuthFactorType = typingsSlinky.firebaseAdmin.firebaseAdminStrings.phone
  
  /**
    * Interface representing the properties to set on a new tenant.
    */
  type CreateTenantRequest = typingsSlinky.firebaseAdmin.authMod.auth.UpdateTenantRequest
}
