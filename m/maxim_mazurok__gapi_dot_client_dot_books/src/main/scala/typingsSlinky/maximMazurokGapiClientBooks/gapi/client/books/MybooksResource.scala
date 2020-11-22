package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.AcquireMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MybooksResource extends js.Object {
  
  /** Return a list of books in My Library. */
  def list(): Request[Volumes] = js.native
  def list(request: AcquireMethod): Request[Volumes] = js.native
}
