package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalappsharingartifactsResource extends js.Object {
  
  /**
    * Uploads an APK to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of
    * 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
    */
  def uploadapk(): Request[InternalAppSharingArtifact] = js.native
  def uploadapk(request: UploadType): Request[InternalAppSharingArtifact] = js.native
  
  /**
    * Uploads an app bundle to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a
    * timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
    */
  def uploadbundle(): Request[InternalAppSharingArtifact] = js.native
  def uploadbundle(request: UploadType): Request[InternalAppSharingArtifact] = js.native
}
