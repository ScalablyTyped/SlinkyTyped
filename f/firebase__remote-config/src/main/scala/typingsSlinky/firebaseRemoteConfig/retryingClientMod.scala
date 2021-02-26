package typingsSlinky.firebaseRemoteConfig

import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigAbortSignal
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typingsSlinky.firebaseRemoteConfig.storageMod.Storage
import typingsSlinky.firebaseRemoteConfig.storageMod.ThrottleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryingClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/retrying_client", "RetryingClient")
  @js.native
  class RetryingClient protected () extends RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage) = this()
    
    /**
      * A recursive helper for attempting a fetch request repeatedly.
      *
      * @throws any non-retriable errors.
      */
    def attemptFetch(request: FetchRequest, hasThrottleEndTimeMillisBackoffCount: ThrottleMetadata): js.Promise[FetchResponse] = js.native
    
    val client: js.Any = js.native
    
    val storage: js.Any = js.native
  }
  
  @JSImport("@firebase/remote-config/dist/src/client/retrying_client", "setAbortableTimeout")
  @js.native
  def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = js.native
}
