package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Alt
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditsResource extends js.Object {
  
  var apks: ApksResource = js.native
  
  var bundles: BundlesResource = js.native
  
  /** Commits an app edit. */
  def commit(): Request[AppEdit] = js.native
  def commit(request: Alt): Request[AppEdit] = js.native
  
  /** Deletes an app edit. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  var deobfuscationfiles: DeobfuscationfilesResource = js.native
  
  var details: DetailsResource = js.native
  
  var expansionfiles: ExpansionfilesResource = js.native
  
  /** Gets an app edit. */
  def get(): Request[AppEdit] = js.native
  def get(request: Alt): Request[AppEdit] = js.native
  
  var images: ImagesResource = js.native
  
  /** Creates a new edit for an app. */
  def insert(request: QuotaUser): Request[AppEdit] = js.native
  def insert(request: UploadType, body: AppEdit): Request[AppEdit] = js.native
  
  var listings: ListingsResource = js.native
  
  var testers: TestersResource = js.native
  
  var tracks: TracksResource = js.native
  
  /** Validates an app edit. */
  def validate(): Request[AppEdit] = js.native
  def validate(request: Alt): Request[AppEdit] = js.native
}
