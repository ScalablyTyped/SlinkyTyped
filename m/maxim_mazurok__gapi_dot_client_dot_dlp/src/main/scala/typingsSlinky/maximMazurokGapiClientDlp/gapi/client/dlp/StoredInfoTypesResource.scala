package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDlp.anon.Fields
import typingsSlinky.maximMazurokGapiClientDlp.anon.Key
import typingsSlinky.maximMazurokGapiClientDlp.anon.LocationId
import typingsSlinky.maximMazurokGapiClientDlp.anon.Parent
import typingsSlinky.maximMazurokGapiClientDlp.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoredInfoTypesResource extends StObject {
  
  def create(request: Fields, body: GooglePrivacyDlpV2CreateStoredInfoTypeRequest): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  /** Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def create(request: Parent): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  
  /** Deletes a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def get(): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(request: Key): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  
  /** Lists stored infoTypes. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(request: LocationId): Request[GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  
  def patch(request: Key, body: GooglePrivacyDlpV2UpdateStoredInfoTypeRequest): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  /**
    * Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    */
  def patch(request: QuotaUser): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
}
