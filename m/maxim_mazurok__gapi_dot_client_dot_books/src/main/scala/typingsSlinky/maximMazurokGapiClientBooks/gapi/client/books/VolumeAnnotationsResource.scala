package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.AnnotationId
import typingsSlinky.maximMazurokGapiClientBooks.anon.EndOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeAnnotationsResource extends js.Object {
  
  /** Gets the volume annotation. */
  def get(): Request[Volumeannotation] = js.native
  def get(request: AnnotationId): Request[Volumeannotation] = js.native
  
  /** Gets the volume annotations for a volume and layer. */
  def list(): Request[Volumeannotations] = js.native
  def list(request: EndOffset): Request[Volumeannotations] = js.native
}
