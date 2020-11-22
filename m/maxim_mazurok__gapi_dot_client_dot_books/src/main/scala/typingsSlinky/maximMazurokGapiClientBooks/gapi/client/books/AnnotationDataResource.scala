package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.AllowWebDefinitions
import typingsSlinky.maximMazurokGapiClientBooks.anon.AnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationDataResource extends js.Object {
  
  /** Gets the annotation data. */
  def get(): Request[DictionaryAnnotationdata] = js.native
  def get(request: AllowWebDefinitions): Request[DictionaryAnnotationdata] = js.native
  
  /** Gets the annotation data for a volume and layer. */
  def list(): Request[Annotationsdata] = js.native
  def list(request: AnnotationDataId): Request[Annotationsdata] = js.native
}
