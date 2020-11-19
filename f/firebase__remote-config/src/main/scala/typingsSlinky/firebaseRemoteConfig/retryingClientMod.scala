package typingsSlinky.firebaseRemoteConfig

import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigAbortSignal
import typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typingsSlinky.firebaseRemoteConfig.storageMod.Storage
import typingsSlinky.firebaseRemoteConfig.storageMod.ThrottleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/remote-config/dist/src/client/retrying_client", JSImport.Namespace)
@js.native
object retryingClientMod extends js.Object {
  
  def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = js.native
  
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
}
