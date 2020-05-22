package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.AnnotationId
import typingsSlinky.gapiClientBooks.anon.EndOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: AnnotationId): Request[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: EndOffset): Request[Volumeannotations]
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(get: AnnotationId => Request[Volumeannotation], list: EndOffset => Request[Volumeannotations]): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
}

