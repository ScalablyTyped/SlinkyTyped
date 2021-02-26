package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.ProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedconfigurationssettingsResource extends StObject {
  
  /** Lists all the managed configurations settings for the specified app. */
  def list(): Request[ManagedConfigurationsSettingsListResponse] = js.native
  def list(request: ProductId): Request[ManagedConfigurationsSettingsListResponse] = js.native
}
