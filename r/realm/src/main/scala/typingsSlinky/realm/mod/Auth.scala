package typingsSlinky.realm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("realm", "Auth")
@js.native
object Auth extends js.Object {
  
  /**
    * Authentication provider where users identify using an API-key.
    */
  @js.native
  class ApiKeyAuth ()
    extends typingsSlinky.realm.Realm.Auth.ApiKeyAuth
  
  /**
    * Authentication provider where users identify using email and password.
    */
  @js.native
  class EmailPasswordAuth ()
    extends typingsSlinky.realm.Realm.Auth.EmailPasswordAuth
}
