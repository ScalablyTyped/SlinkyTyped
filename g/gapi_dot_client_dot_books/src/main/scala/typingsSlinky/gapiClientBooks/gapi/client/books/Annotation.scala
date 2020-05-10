package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.AnonAllowedCharacterCount
import typingsSlinky.gapiClientBooks.AnonCfiRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  /** Anchor text after excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var afterSelectedText: js.UndefOr[String] = js.native
  /** Anchor text before excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var beforeSelectedText: js.UndefOr[String] = js.native
  /** Selection ranges sent from the client. */
  var clientVersionRanges: js.UndefOr[AnonCfiRange] = js.native
  /** Timestamp for the created time of this annotation. */
  var created: js.UndefOr[String] = js.native
  /** Selection ranges for the most recent content version. */
  var currentVersionRanges: js.UndefOr[AnonCfiRange] = js.native
  /** User-created data for this annotation. */
  var data: js.UndefOr[String] = js.native
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.native
  /** The highlight style for this annotation. */
  var highlightStyle: js.UndefOr[String] = js.native
  /** Id of this annotation, in the form of a GUID. */
  var id: js.UndefOr[String] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** The layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.native
  var layerSummary: js.UndefOr[AnonAllowedCharacterCount] = js.native
  /** Pages that this annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.native
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Timestamp for the last time this annotation was modified. */
  var updated: js.UndefOr[String] = js.native
  /** The volume that this annotation belongs to. */
  var volumeId: js.UndefOr[String] = js.native
}

object Annotation {
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVersionRanges(value: AnonCfiRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersionRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVersionRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersionRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentVersionRanges(value: AnonCfiRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersionRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersionRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersionRanges")(js.undefined)
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
    def withHighlightStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(js.undefined)
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
    def withLayerSummary(value: AnonAllowedCharacterCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSummary")(js.undefined)
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

