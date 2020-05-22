package typingsSlinky.firebaseFirestore.coreComponentProviderMod

import typingsSlinky.firebaseFirestore.authUserMod.User
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.coreFirestoreClientMod.PersistenceSettings
import typingsSlinky.firebaseFirestore.localSharedClientStateMod.ClientId
import typingsSlinky.firebaseFirestore.platformPlatformMod.Platform
import typingsSlinky.firebaseFirestore.remoteDatastoreMod.Datastore
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfiguration extends js.Object {
  var asyncQueue: AsyncQueue
  var clientId: ClientId
  var databaseInfo: DatabaseInfo
  var datastore: Datastore
  var initialUser: User
  var maxConcurrentLimboResolutions: Double
  var persistenceSettings: PersistenceSettings
  var platform: Platform
}

object ComponentConfiguration {
  @scala.inline
  def apply(
    asyncQueue: AsyncQueue,
    clientId: ClientId,
    databaseInfo: DatabaseInfo,
    datastore: Datastore,
    initialUser: User,
    maxConcurrentLimboResolutions: Double,
    persistenceSettings: PersistenceSettings,
    platform: Platform
  ): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(asyncQueue = asyncQueue.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], databaseInfo = databaseInfo.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], initialUser = initialUser.asInstanceOf[js.Any], maxConcurrentLimboResolutions = maxConcurrentLimboResolutions.asInstanceOf[js.Any], persistenceSettings = persistenceSettings.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
}

