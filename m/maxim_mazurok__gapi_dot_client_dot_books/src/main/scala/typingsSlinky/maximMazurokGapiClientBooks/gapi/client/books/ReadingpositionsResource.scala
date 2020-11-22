package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.Action
import typingsSlinky.maximMazurokGapiClientBooks.anon.AltCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadingpositionsResource extends js.Object {
  
  /** Retrieves my reading position information for a volume. */
  def get(): Request[ReadingPosition] = js.native
  def get(request: AltCallback): Request[ReadingPosition] = js.native
  
  /** Sets my reading position information for a volume. */
  def setPosition(): Request[js.Object] = js.native
  def setPosition(request: Action): Request[js.Object] = js.native
}
