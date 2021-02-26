package typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Callback
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatHitsResource extends StObject {
  
  def create(request: Callback, body: ThreatHit): Request[js.Object] = js.native
  /** Reports a Safe Browsing threat list hit to Google. Only projects with TRUSTED_REPORTER visibility can use this method. */
  def create(request: Fields): Request[js.Object] = js.native
}
