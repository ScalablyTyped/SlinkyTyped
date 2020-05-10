package typingsSlinky.firebaseFirestore.apiCredentialsMod

import typingsSlinky.firebaseFirestore.authUserMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/credentials", "OAuthToken")
@js.native
class OAuthToken protected () extends Token {
  def this(value: String, user: User) = this()
}

