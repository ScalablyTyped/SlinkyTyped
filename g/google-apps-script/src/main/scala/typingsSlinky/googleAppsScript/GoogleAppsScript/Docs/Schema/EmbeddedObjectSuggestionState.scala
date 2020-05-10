package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedObjectSuggestionState extends js.Object {
  var descriptionSuggested: js.UndefOr[Boolean] = js.native
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[js.Any] = js.native
  var embeddedObjectBorderSuggestionState: js.UndefOr[EmbeddedObjectBorderSuggestionState] = js.native
  var imagePropertiesSuggestionState: js.UndefOr[ImagePropertiesSuggestionState] = js.native
  var linkedContentReferenceSuggestionState: js.UndefOr[LinkedContentReferenceSuggestionState] = js.native
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  var sizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.native
  var titleSuggested: js.UndefOr[Boolean] = js.native
}

object EmbeddedObjectSuggestionState {
  @scala.inline
  def apply(): EmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectSuggestionState]
  }
  @scala.inline
  implicit class EmbeddedObjectSuggestionStateOps[Self <: EmbeddedObjectSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptionSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedDrawingPropertiesSuggestionState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedDrawingPropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedDrawingPropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedDrawingPropertiesSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedObjectBorderSuggestionState(value: EmbeddedObjectBorderSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectBorderSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedObjectBorderSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectBorderSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePropertiesSuggestionState(value: ImagePropertiesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePropertiesSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedContentReferenceSuggestionState(value: LinkedContentReferenceSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedContentReferenceSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedContentReferenceSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedContentReferenceSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottomSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottomSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottomSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottomSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeftSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeftSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeftSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeftSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTopSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTopSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTopSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTopSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSuggestionState(value: SizeSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSuggested")(js.undefined)
        ret
    }
  }
  
}

