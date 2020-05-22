package typingsSlinky.firebaseFirestore.componentProviderMod

import typingsSlinky.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.datastoreMod.Datastore
import typingsSlinky.firebaseFirestore.firestoreClientMod.PersistenceSettings
import typingsSlinky.firebaseFirestore.platformMod.Platform
import typingsSlinky.firebaseFirestore.sharedClientStateMod.ClientId
import typingsSlinky.firebaseFirestore.userMod.User
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

