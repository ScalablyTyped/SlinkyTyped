package typingsSlinky.firebaseRemoteConfig

import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseLogger.mod.Logger
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typingsSlinky.firebaseRemoteConfig.storageCacheMod.StorageCache
import typingsSlinky.firebaseRemoteConfig.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/remote-config/dist/src/remote_config", JSImport.Namespace)
@js.native
object remoteConfigMod extends js.Object {
  
  @js.native
  class RemoteConfig protected ()
    extends typingsSlinky.firebaseRemoteConfigTypes.mod.RemoteConfig {
    def this(
      app: FirebaseApp,
      _client: RemoteConfigFetchClient,
      _storageCache: StorageCache,
      _storage: Storage,
      _logger: Logger
    ) = this()
    
    val _client: js.Any = js.native
    
    var _initializePromise: js.Any = js.native
    
    var _isInitializationComplete: js.Any = js.native
    
    val _logger: js.Any = js.native
    
    val _storage: js.Any = js.native
    
    val _storageCache: js.Any = js.native
    
    val app: FirebaseApp = js.native
  }
}
