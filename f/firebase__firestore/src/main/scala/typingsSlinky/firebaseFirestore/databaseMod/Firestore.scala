package typingsSlinky.firebaseFirestore.databaseMod

import typingsSlinky.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseFirestore.anon.Delete
import typingsSlinky.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsSlinky.firebaseFirestore.componentProviderMod.ComponentProvider
import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.firestoreClientMod.FirestoreClient
import typingsSlinky.firebaseFirestore.mod.FirebaseApp
import typingsSlinky.firebaseFirestore.observerMod.PartialObserver
import typingsSlinky.firebaseFirestore.observerMod.Unsubscribe
import typingsSlinky.firebaseFirestore.userDataReaderMod.UserDataReader
import typingsSlinky.firebaseFirestoreTypes.mod.FirebaseFirestore
import typingsSlinky.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.firebaseAppTypes.privateMod.FirebaseService because var conflicts: INTERNAL, app. Inlined  */ @JSImport("@firebase/firestore/dist/lib/src/api/database", "Firestore")
@js.native
class Firestore protected () extends FirebaseFirestore {
  def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(
    databaseIdOrApp: FirestoreDatabase,
    authProvider: Provider[FirebaseAuthInternalName],
    componentProvider: ComponentProvider
  ) = this()
  def this(
    databaseIdOrApp: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    componentProvider: ComponentProvider
  ) = this()
  @JSName("INTERNAL")
  var INTERNAL_Firestore: Delete = js.native
  val _componentProvider: js.Any = js.native
  var _credentials: js.Any = js.native
  val _dataReader: UserDataReader = js.native
  val _databaseId: DatabaseId = js.native
  val _firebaseApp: js.Any = js.native
  var _firestoreClient: js.Any = js.native
  val _persistenceKey: js.Any = js.native
  val _queue: AsyncQueue = js.native
  var _settings: js.Any = js.native
  var configureClient: js.Any = js.native
  var makeDatabaseInfo: js.Any = js.native
  var onSnapshotsInSyncInternal: js.Any = js.native
  def _areTimestampsInSnapshotsEnabled(): Boolean = js.native
  def _isTerminated: Boolean = js.native
  @JSName("app")
  def app_MFirestore: FirebaseApp = js.native
  def ensureClientConfigured(): FirestoreClient = js.native
  def onSnapshotsInSync(observer: PartialObserver[Unit]): Unsubscribe = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/api/database", "Firestore")
@js.native
object Firestore extends js.Object {
  var databaseIdFromApp: js.Any = js.native
  def logLevel: LogLevel = js.native
  def setLogLevel(level: LogLevel): Unit = js.native
}

