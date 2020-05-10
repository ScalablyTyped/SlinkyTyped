package typingsSlinky.firebaseFirestore.credentialsMod

import typingsSlinky.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "OAuthToken")
@js.native
class OAuthToken protected () extends Token {
  def this(value: String, user: User) = this()
}

