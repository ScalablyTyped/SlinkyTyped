package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAltAnnotationId
import typingsSlinky.gapiClientBooks.AnonFieldsKey
import typingsSlinky.gapiClientBooks.AnonLayerIds
import typingsSlinky.gapiClientBooks.AnonShowOnlySummaryInResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: AnonAltAnnotationId): Request_[Unit] = js.native
  /** Inserts a new annotation. */
  def insert(request: AnonShowOnlySummaryInResponse): Request_[Annotation] = js.native
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: AnonLayerIds): Request_[Annotations] = js.native
  /** Gets the summary of specified layers. */
  def summary(request: AnonFieldsKey): Request_[AnnotationsSummary] = js.native
  /** Updates an existing annotation. */
  def update(request: AnonAltAnnotationId): Request_[Annotation] = js.native
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: AnonAltAnnotationId => Request_[Unit],
    insert: AnonShowOnlySummaryInResponse => Request_[Annotation],
    list: AnonLayerIds => Request_[Annotations],
    summary: AnonFieldsKey => Request_[AnnotationsSummary],
    update: AnonAltAnnotationId => Request_[Annotation]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), summary = js.Any.fromFunction1(summary), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnnotationsResource]
  }
  @scala.inline
  implicit class AnnotationsResourceOps[Self <: AnnotationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAltAnnotationId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonShowOnlySummaryInResponse => Request_[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonLayerIds => Request_[Annotations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSummary(value: AnonFieldsKey => Request_[AnnotationsSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAltAnnotationId => Request_[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

