package typingsSlinky.firebaseFirestore.credentialsMod

import typingsSlinky.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsSlinky.firebaseComponent.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "FirebaseCredentialsProvider")
@js.native
class FirebaseCredentialsProvider protected () extends CredentialsProvider {
  def this(authProvider: Provider[FirebaseAuthInternalName]) = this()
  var auth: js.Any = js.native
  /** The listener registered with setChangeListener(). */
  var changeListener: js.Any = js.native
  /** Tracks the current User. */
  var currentUser: js.Any = js.native
  var forceRefresh: js.Any = js.native
  var getUser: js.Any = js.native
  var receivedInitialUser: js.Any = js.native
  /**
    * Counter used to detect if the token changed while a getToken request was
    * outstanding.
    */
  var tokenCounter: js.Any = js.native
  /**
    * The auth token listener registered with FirebaseApp, retained here so we
    * can unregister it.
    */
  var tokenListener: js.Any = js.native
}

