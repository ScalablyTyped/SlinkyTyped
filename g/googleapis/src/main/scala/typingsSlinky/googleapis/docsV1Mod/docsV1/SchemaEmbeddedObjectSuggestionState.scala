package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base EmbeddedObject have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaEmbeddedObjectSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to description.
    */
  var descriptionSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in embedded_drawing_properties
    * have been changed in this suggestion.
    */
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[SchemaEmbeddedDrawingPropertiesSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in embedded_object_border have
    * been changed in this suggestion.
    */
  var embeddedObjectBorderSuggestionState: js.UndefOr[SchemaEmbeddedObjectBorderSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in image_properties have been
    * changed in this suggestion.
    */
  var imagePropertiesSuggestionState: js.UndefOr[SchemaImagePropertiesSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in linked_content_reference
    * have been changed in this suggestion.
    */
  var linkedContentReferenceSuggestionState: js.UndefOr[SchemaLinkedContentReferenceSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to margin_bottom.
    */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_left.
    */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_right.
    */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_top.
    */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in size have been changed in
    * this suggestion.
    */
  var sizeSuggestionState: js.UndefOr[SchemaSizeSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to title.
    */
  var titleSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaEmbeddedObjectSuggestionState {
  @scala.inline
  def apply(): SchemaEmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectSuggestionState]
  }
  @scala.inline
  implicit class SchemaEmbeddedObjectSuggestionStateOps[Self <: SchemaEmbeddedObjectSuggestionState] (val x: Self) extends AnyVal {
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
    def withEmbeddedDrawingPropertiesSuggestionState(value: SchemaEmbeddedDrawingPropertiesSuggestionState): Self = {
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
    def withEmbeddedObjectBorderSuggestionState(value: SchemaEmbeddedObjectBorderSuggestionState): Self = {
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
    def withImagePropertiesSuggestionState(value: SchemaImagePropertiesSuggestionState): Self = {
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
    def withLinkedContentReferenceSuggestionState(value: SchemaLinkedContentReferenceSuggestionState): Self = {
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
    def withSizeSuggestionState(value: SchemaSizeSuggestionState): Self = {
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

