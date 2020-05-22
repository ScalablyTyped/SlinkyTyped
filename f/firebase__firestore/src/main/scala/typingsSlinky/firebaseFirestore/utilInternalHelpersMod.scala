package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typingsSlinky.firebaseFirestore.apiCredentialsMod.EmptyCredentialsProvider
import typingsSlinky.firebaseFirestore.authUserMod.User
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.remoteDatastoreMod.Datastore
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import typingsSlinky.firebaseFirestoreTypes.mod.FirebaseFirestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/integration/util/internal_helpers", JSImport.Namespace)
@js.native
object utilInternalHelpersMod extends js.Object {
  @js.native
  class MockCredentialsProvider () extends EmptyCredentialsProvider {
    var listener: js.Any = js.native
    def triggerUserChange(newUser: User): Unit = js.native
  }
  
  def asyncQueue(db: FirebaseFirestore): AsyncQueue = js.native
  def getDefaultDatabaseInfo(): DatabaseInfo = js.native
  def withMockCredentialProviderTestDb(
    persistence: Boolean,
    fn: js.Function2[
      /* db */ FirebaseFirestore, 
      /* mockCredential */ MockCredentialsProvider, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestDatastore(fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withTestDatastore(
    fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]],
    credentialsProvider: CredentialsProvider
  ): js.Promise[Unit] = js.native
}

