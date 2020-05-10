package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAllowWebDefinitions
import typingsSlinky.gapiClientBooks.AnonAnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: AnonAllowWebDefinitions): Request_[Annotationdata] = js.native
  /** Gets the annotation data for a volume and layer. */
  def list(request: AnonAnnotationDataId): Request_[Annotationsdata] = js.native
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: AnonAllowWebDefinitions => Request_[Annotationdata],
    list: AnonAnnotationDataId => Request_[Annotationsdata]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnnotationDataResource]
  }
  @scala.inline
  implicit class AnnotationDataResourceOps[Self <: AnnotationDataResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAllowWebDefinitions => Request_[Annotationdata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAnnotationDataId => Request_[Annotationsdata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

