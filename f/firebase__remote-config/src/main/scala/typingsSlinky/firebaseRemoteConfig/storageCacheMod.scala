package typingsSlinky.firebaseRemoteConfig

import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.FirebaseRemoteConfigObject
import typingsSlinky.firebaseRemoteConfig.storageMod.Storage
import typingsSlinky.firebaseRemoteConfigTypes.mod.FetchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageCacheMod {
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage_cache", "StorageCache")
  @js.native
  class StorageCache protected () extends StObject {
    def this(storage: Storage) = this()
    
    var activeConfig: js.Any = js.native
    
    def getActiveConfig(): js.UndefOr[FirebaseRemoteConfigObject] = js.native
    
    /**
      * Memory-only getters
      */
    def getLastFetchStatus(): js.UndefOr[FetchStatus] = js.native
    
    def getLastSuccessfulFetchTimestampMillis(): js.UndefOr[Double] = js.native
    
    /**
      * Memory caches.
      */
    var lastFetchStatus: js.Any = js.native
    
    var lastSuccessfulFetchTimestampMillis: js.Any = js.native
    
    /**
      * Read-ahead getter
      */
    def loadFromStorage(): js.Promise[Unit] = js.native
    
    def setActiveConfig(activeConfig: FirebaseRemoteConfigObject): js.Promise[Unit] = js.native
    
    /**
      * Write-through setters
      */
    def setLastFetchStatus(status: FetchStatus): js.Promise[Unit] = js.native
    
    def setLastSuccessfulFetchTimestampMillis(timestampMillis: Double): js.Promise[Unit] = js.native
    
    val storage: js.Any = js.native
  }
}
