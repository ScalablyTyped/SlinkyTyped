package typingsSlinky.maximMazurokGapiClientTranslate.gapi.client.translate

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTranslate.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientTranslate.anon.Alt
import typingsSlinky.maximMazurokGapiClientTranslate.anon.Callback
import typingsSlinky.maximMazurokGapiClientTranslate.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlossariesResource extends js.Object {
  
  /** Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project doesn't exist. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Glossary): Request[Operation] = js.native
  
  /** Deletes a glossary, or cancels glossary construction if the glossary isn't created yet. Returns NOT_FOUND, if the glossary doesn't exist. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets a glossary. Returns NOT_FOUND, if the glossary doesn't exist. */
  def get(): Request[Glossary] = js.native
  def get(request: Callback): Request[Glossary] = js.native
  
  /** Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't exist. */
  def list(): Request[ListGlossariesResponse] = js.native
  def list(request: Fields): Request[ListGlossariesResponse] = js.native
}
