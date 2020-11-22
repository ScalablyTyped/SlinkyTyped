package typingsSlinky.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBlogger.anon.IsDraft
import typingsSlinky.maximMazurokGapiClientBlogger.anon.Key
import typingsSlinky.maximMazurokGapiClientBlogger.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientBlogger.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientBlogger.anon.PageId
import typingsSlinky.maximMazurokGapiClientBlogger.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientBlogger.anon.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends js.Object {
  
  /** Deletes a page by blog id and page id. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Gets a page by blog id and page id. */
  def get(): Request[Page] = js.native
  def get(request: Oauthtoken): Request[Page] = js.native
  
  /** Inserts a page. */
  def insert(request: IsDraft): Request[Page] = js.native
  def insert(request: PrettyPrint, body: Page): Request[Page] = js.native
  
  /** Lists pages. */
  def list(): Request[PageList] = js.native
  def list(request: MaxResults): Request[PageList] = js.native
  
  /** Patches a page. */
  def patch(request: PageId): Request[Page] = js.native
  def patch(request: Publish, body: Page): Request[Page] = js.native
  
  /** Publishes a page. */
  def publish(): Request[Page] = js.native
  def publish(request: Key): Request[Page] = js.native
  
  /** Reverts a published or scheduled page to draft state. */
  def revert(): Request[Page] = js.native
  def revert(request: Key): Request[Page] = js.native
  
  /** Updates a page by blog id and page id. */
  def update(request: PageId): Request[Page] = js.native
  def update(request: Publish, body: Page): Request[Page] = js.native
}
