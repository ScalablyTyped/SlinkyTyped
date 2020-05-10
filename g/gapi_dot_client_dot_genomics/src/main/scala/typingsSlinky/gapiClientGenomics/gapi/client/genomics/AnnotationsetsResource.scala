package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGenomics.AnonAccesstoken
import typingsSlinky.gapiClientGenomics.AnonAnnotationSetId
import typingsSlinky.gapiClientGenomics.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsetsResource extends js.Object {
  /**
    * Creates a new annotation set. Caller must have WRITE permission for the
    * associated dataset.
    *
    * The following fields are required:
    *
    * &#42; datasetId
    * &#42; referenceSetId
    *
    * All other fields may be optionally specified, unless documented as being
    * server-generated (for example, the `id` field).
    */
  def create(request: AnonAccesstoken): Request_[AnnotationSet] = js.native
  /**
    * Deletes an annotation set. Caller must have WRITE permission
    * for the associated annotation set.
    */
  def delete(request: AnonAnnotationSetId): Request_[js.Object] = js.native
  /**
    * Gets an annotation set. Caller must have READ permission for
    * the associated dataset.
    */
  def get(request: AnonAnnotationSetId): Request_[AnnotationSet] = js.native
  /**
    * Searches for annotation sets that match the given criteria. Annotation sets
    * are returned in an unspecified order. This order is consistent, such that
    * two queries for the same content (regardless of page size) yield annotation
    * sets in the same order across their respective streams of paginated
    * responses. Caller must have READ permission for the queried datasets.
    */
  def search(request: AnonAccesstoken): Request_[SearchAnnotationSetsResponse] = js.native
  /**
    * Updates an annotation set. The update must respect all mutability
    * restrictions and other invariants described on the annotation set resource.
    * Caller must have WRITE permission for the associated dataset.
    */
  def update(request: AnonBearertoken): Request_[AnnotationSet] = js.native
}

object AnnotationsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[AnnotationSet],
    delete: AnonAnnotationSetId => Request_[js.Object],
    get: AnonAnnotationSetId => Request_[AnnotationSet],
    search: AnonAccesstoken => Request_[SearchAnnotationSetsResponse],
    update: AnonBearertoken => Request_[AnnotationSet]
  ): AnnotationsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnnotationsetsResource]
  }
  @scala.inline
  implicit class AnnotationsetsResourceOps[Self <: AnnotationsetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[AnnotationSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAnnotationSetId => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAnnotationSetId => Request_[AnnotationSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonAccesstoken => Request_[SearchAnnotationSetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBearertoken => Request_[AnnotationSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

