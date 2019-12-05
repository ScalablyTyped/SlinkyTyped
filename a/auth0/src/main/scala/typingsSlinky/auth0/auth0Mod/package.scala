package typingsSlinky.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0Mod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.auth0.Anon_Id
  import typingsSlinky.auth0.auth0Strings.scope
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type AppMetadata = StringDictionary[js.Any]
  type ClientGrant = Partial[CreateClientGrant] with Anon_Id
  type DatabaseClientOptions = BaseClientOptions
  type PasswordLessClientOptions = BaseClientOptions
  type UpdateClientGrant = Pick[Partial[CreateClientGrant], scope]
  type UserMetadata = StringDictionary[js.Any]
}
