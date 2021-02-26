package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.PackageName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestersResource extends StObject {
  
  /** Gets testers. */
  def get(): Request[Testers] = js.native
  def get(request: Oauthtoken): Request[Testers] = js.native
  
  def patch(request: Oauthtoken, body: Testers): Request[Testers] = js.native
  /** Patches testers. */
  def patch(request: PackageName): Request[Testers] = js.native
  
  def update(request: Oauthtoken, body: Testers): Request[Testers] = js.native
  /** Updates testers. */
  def update(request: PackageName): Request[Testers] = js.native
}
