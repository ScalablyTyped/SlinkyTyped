package typingsSlinky.firebaseFirestore.apiCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/credentials", "EmptyCredentialsProvider")
@js.native
class EmptyCredentialsProvider () extends CredentialsProvider {
  /**
    * Stores the listener registered with setChangeListener()
    * This isn't actually necessary since the UID never changes, but we use this
    * to verify the listen contract is adhered to in tests.
    */
  var changeListener: js.Any = js.native
}

