package typingsSlinky.firebaseFirestore.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "FirstPartyCredentialsProvider")
@js.native
class FirstPartyCredentialsProvider protected () extends CredentialsProvider {
  def this(gapi: Gapi, sessionIndex: String) = this()
  var gapi: js.Any = js.native
  var sessionIndex: js.Any = js.native
}

