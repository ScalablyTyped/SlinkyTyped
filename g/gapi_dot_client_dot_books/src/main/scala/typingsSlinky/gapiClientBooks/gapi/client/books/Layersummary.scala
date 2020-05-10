package typingsSlinky.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layersummary extends js.Object {
  /** The number of annotations for this layer. */
  var annotationCount: js.UndefOr[Double] = js.native
  /** The list of annotation types contained for this layer. */
  var annotationTypes: js.UndefOr[js.Array[String]] = js.native
  /** Link to get data for this annotation. */
  var annotationsDataLink: js.UndefOr[String] = js.native
  /** The link to get the annotations for this layer. */
  var annotationsLink: js.UndefOr[String] = js.native
  /** The content version this resource is for. */
  var contentVersion: js.UndefOr[String] = js.native
  /** The number of data items for this layer. */
  var dataCount: js.UndefOr[Double] = js.native
  /** Unique id of this layer summary. */
  var id: js.UndefOr[String] = js.native
  /** Resource Type */
  var kind: js.UndefOr[String] = js.native
  /** The layer id for this summary. */
  var layerId: js.UndefOr[String] = js.native
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.native
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.&#42;
    * responses. The actual annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
  /** The volume id this resource is for. */
  var volumeId: js.UndefOr[String] = js.native
}

object Layersummary {
  @scala.inline
  def apply(): Layersummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layersummary]
  }
  @scala.inline
  implicit class LayersummaryOps[Self <: Layersummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationsDataLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsDataLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationsDataLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsDataLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationsLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationsLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsLink")(js.undefined)
        ret
    }
    @scala.inline
    def withContentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCount")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeAnnotationsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAnnotationsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeAnnotationsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAnnotationsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(js.undefined)
        ret
    }
  }
  
}

