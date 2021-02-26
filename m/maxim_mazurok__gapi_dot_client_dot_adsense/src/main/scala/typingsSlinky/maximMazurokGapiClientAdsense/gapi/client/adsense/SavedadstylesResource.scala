package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Alt
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Fields
import typingsSlinky.maximMazurokGapiClientAdsense.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientAdsense.anon.SavedAdStyleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedadstylesResource extends StObject {
  
  /** List a specific saved ad style for the specified account. */
  def get(): Request[SavedAdStyle] = js.native
  def get(request: KeyOauthtoken): Request[SavedAdStyle] = js.native
  def get(request: SavedAdStyleId): Request[SavedAdStyle] = js.native
  
  /** List all saved ad styles in the specified account. */
  def list(): Request[SavedAdStyles] = js.native
  def list(request: Alt): Request[SavedAdStyles] = js.native
  def list(request: Fields): Request[SavedAdStyles] = js.native
}
