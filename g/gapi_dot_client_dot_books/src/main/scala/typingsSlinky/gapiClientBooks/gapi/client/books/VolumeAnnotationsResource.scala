package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.AnnotationId
import typingsSlinky.gapiClientBooks.anon.EndOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: AnnotationId): Request[Volumeannotation] = js.native
  /** Gets the volume annotations for a volume and layer. */
  def list(request: EndOffset): Request[Volumeannotations] = js.native
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(get: AnnotationId => Request[Volumeannotation], list: EndOffset => Request[Volumeannotations]): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
  @scala.inline
  implicit class VolumeAnnotationsResourceOps[Self <: VolumeAnnotationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnnotationId => Request[Volumeannotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: EndOffset => Request[Volumeannotations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

