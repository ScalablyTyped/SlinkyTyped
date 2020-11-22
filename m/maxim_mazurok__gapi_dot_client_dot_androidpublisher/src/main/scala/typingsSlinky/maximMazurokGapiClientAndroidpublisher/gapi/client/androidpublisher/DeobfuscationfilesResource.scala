package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.ApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeobfuscationfilesResource extends js.Object {
  
  /** Uploads a new deobfuscation file and attaches to the specified APK. */
  def upload(): Request[DeobfuscationFilesUploadResponse] = js.native
  def upload(request: ApkVersionCode): Request[DeobfuscationFilesUploadResponse] = js.native
}
