package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.AccountId
import typingsSlinky.gapiClientAdsense.anon.Alt
import typingsSlinky.gapiClientAdsense.anon.KeyOauthtoken
import typingsSlinky.gapiClientAdsense.anon.SavedAdStyleId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedadstylesResource extends js.Object {
  
  /** Get a specific saved ad style from the user's account. */
  def get(request: KeyOauthtoken): Request[SavedAdStyle] = js.native
  /** List a specific saved ad style for the specified account. */
  def get(request: SavedAdStyleId): Request[SavedAdStyle] = js.native
  
  /** List all saved ad styles in the specified account. */
  def list(request: AccountId): Request[SavedAdStyles] = js.native
  /** List all saved ad styles in the user's account. */
  def list(request: Alt): Request[SavedAdStyles] = js.native
}
