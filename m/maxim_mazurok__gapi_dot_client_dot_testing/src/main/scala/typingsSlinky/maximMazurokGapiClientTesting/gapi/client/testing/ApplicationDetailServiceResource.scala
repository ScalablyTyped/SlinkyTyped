package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTesting.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientTesting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDetailServiceResource extends js.Object {
  
  /** Gets the details of an Android application APK. */
  def getApkDetails(request: Accesstoken): Request[GetApkDetailsResponse] = js.native
  def getApkDetails(request: Alt, body: FileReference): Request[GetApkDetailsResponse] = js.native
}
