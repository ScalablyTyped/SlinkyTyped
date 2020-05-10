package typingsSlinky.firebaseFirestore.databaseMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseFirestore.mod.FirebaseApp
import typingsSlinky.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicFirestore")
@js.native
class PublicFirestore protected () extends Firestore {
  def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
}

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicFirestore")
@js.native
object PublicFirestore extends Instantiable2[
      (/* databaseIdOrApp */ FirebaseApp) | (/* databaseIdOrApp */ FirestoreDatabase), 
      /* authProvider */ Provider[FirebaseAuthInternalName], 
      Firestore
    ] {
  var databaseIdFromApp: js.Any = js.native
  def logLevel: LogLevel = js.native
  def setLogLevel(level: LogLevel): Unit = js.native
}

