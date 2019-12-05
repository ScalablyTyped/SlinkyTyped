package typingsSlinky.atFirebaseRemoteDashConfig

import typingsSlinky.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import typingsSlinky.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchRequest
import typingsSlinky.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchResponse
import typingsSlinky.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.RemoteConfigFetchClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/rest_client", JSImport.Namespace)
@js.native
object distSrcClientRestUnderscoreClientMod extends js.Object {
  @js.native
  class RestClient protected () extends RemoteConfigFetchClient {
    def this(
      firebaseInstallations: FirebaseInstallations,
      sdkVersion: String,
      namespace: String,
      projectId: String,
      apiKey: String,
      appId: String
    ) = this()
    val apiKey: js.Any = js.native
    val appId: js.Any = js.native
    val firebaseInstallations: js.Any = js.native
    val namespace: js.Any = js.native
    val projectId: js.Any = js.native
    val sdkVersion: js.Any = js.native
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
  }
  
}

