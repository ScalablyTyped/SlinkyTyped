package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.AnonContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volumeannotation extends js.Object {
  /** The annotation data id for this volume annotation. */
  var annotationDataId: js.UndefOr[String] = js.native
  /** Link to get data for this annotation. */
  var annotationDataLink: js.UndefOr[String] = js.native
  /** The type of annotation this is. */
  var annotationType: js.UndefOr[String] = js.native
  /** The content ranges to identify the selected text. */
  var contentRanges: js.UndefOr[AnonContentVersion] = js.native
  /** Data for this annotation. */
  var data: js.UndefOr[String] = js.native
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.native
  /** Unique id of this volume annotation. */
  var id: js.UndefOr[String] = js.native
  /** Resource Type */
  var kind: js.UndefOr[String] = js.native
  /** The Layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.native
  /** Pages the annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.native
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Timestamp for the last time this anntoation was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.native
  /** The Volume this annotation is for. */
  var volumeId: js.UndefOr[String] = js.native
}

object Volumeannotation {
  @scala.inline
  def apply(): Volumeannotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumeannotation]
  }
  @scala.inline
  implicit class VolumeannotationOps[Self <: Volumeannotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationDataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationDataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationDataId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationDataId")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationDataLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationDataLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationDataLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationDataLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRanges(value: AnonContentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
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
    def withPageIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedText")(js.undefined)
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

