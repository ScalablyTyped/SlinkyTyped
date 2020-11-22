package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.OauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorelayoutpagesResource extends js.Object {
  
  /** Deletes a store page. */
  def delete(): Request[Unit] = js.native
  def delete(request: FieldsKey): Request[Unit] = js.native
  
  /** Retrieves details of a store page. */
  def get(): Request[StorePage] = js.native
  def get(request: FieldsKey): Request[StorePage] = js.native
  
  /** Inserts a new store page. */
  def insert(request: KeyOauthtoken): Request[StorePage] = js.native
  def insert(request: Oauthtoken, body: StorePage): Request[StorePage] = js.native
  
  /** Retrieves the details of all pages in the store. */
  def list(): Request[StoreLayoutPagesListResponse] = js.native
  def list(request: Oauthtoken): Request[StoreLayoutPagesListResponse] = js.native
  
  def update(request: FieldsKey, body: StorePage): Request[StorePage] = js.native
  /** Updates the content of a store page. */
  def update(request: OauthtokenPageId): Request[StorePage] = js.native
}
