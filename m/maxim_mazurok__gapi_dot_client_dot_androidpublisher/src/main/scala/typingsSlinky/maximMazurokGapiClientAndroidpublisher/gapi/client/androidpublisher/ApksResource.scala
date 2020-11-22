package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApksResource extends js.Object {
  
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to organizations using Managed Play
    * whose application is configured to restrict distribution to the organizations.
    */
  def addexternallyhosted(request: Accesstoken): Request[ApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(request: Alt, body: ApksAddExternallyHostedRequest): Request[ApksAddExternallyHostedResponse] = js.native
  
  /** Lists all current APKs of the app and edit. */
  def list(): Request[ApksListResponse] = js.native
  def list(request: Alt): Request[ApksListResponse] = js.native
  
  /** Uploads an APK and adds to the current edit. */
  def upload(): Request[Apk] = js.native
  def upload(request: Alt): Request[Apk] = js.native
}
