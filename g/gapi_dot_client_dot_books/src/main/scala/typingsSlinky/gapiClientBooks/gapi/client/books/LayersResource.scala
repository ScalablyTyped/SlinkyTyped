package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.MaxResults
import typingsSlinky.gapiClientBooks.anon.SummaryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersResource extends js.Object {
  var annotationData: AnnotationDataResource = js.native
  var volumeAnnotations: VolumeAnnotationsResource = js.native
  /** Gets the layer summary for a volume. */
  def get(request: SummaryId): Request[Layersummary] = js.native
  /** List the layer summaries for a volume. */
  def list(request: MaxResults): Request[Layersummaries] = js.native
}

object LayersResource {
  @scala.inline
  def apply(
    annotationData: AnnotationDataResource,
    get: SummaryId => Request[Layersummary],
    list: MaxResults => Request[Layersummaries],
    volumeAnnotations: VolumeAnnotationsResource
  ): LayersResource = {
    val __obj = js.Dynamic.literal(annotationData = annotationData.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), volumeAnnotations = volumeAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersResource]
  }
  @scala.inline
  implicit class LayersResourceOps[Self <: LayersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationData(value: AnnotationDataResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: SummaryId => Request[Layersummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[Layersummaries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVolumeAnnotations(value: VolumeAnnotationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

