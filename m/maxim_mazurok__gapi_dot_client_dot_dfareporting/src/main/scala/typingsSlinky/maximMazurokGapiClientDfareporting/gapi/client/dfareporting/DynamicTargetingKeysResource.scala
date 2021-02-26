package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Name
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Names
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicTargetingKeysResource extends StObject {
  
  /** Deletes an existing dynamic targeting key. */
  def delete(): Request[Unit] = js.native
  def delete(request: Name): Request[Unit] = js.native
  
  def insert(request: Callback, body: DynamicTargetingKey): Request[DynamicTargetingKey] = js.native
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or placements. There is a maximum of 1000
    * keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: FieldsKeyOauthtoken): Request[DynamicTargetingKey] = js.native
  
  /** Retrieves a list of dynamic targeting keys. */
  def list(): Request[DynamicTargetingKeysListResponse] = js.native
  def list(request: Names): Request[DynamicTargetingKeysListResponse] = js.native
}
