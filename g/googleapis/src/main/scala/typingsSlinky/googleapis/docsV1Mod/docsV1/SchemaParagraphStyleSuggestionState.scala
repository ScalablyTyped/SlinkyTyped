package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base ParagraphStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaParagraphStyleSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to alignment.
    */
  var alignmentSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to avoid_widow_and_orphan.
    */
  var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_between.
    */
  var borderBetweenSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_bottom.
    */
  var borderBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_left.
    */
  var borderLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_right.
    */
  var borderRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_top.
    */
  var borderTopSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to direction.
    */
  var directionSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to heading_id.
    */
  var headingIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_end.
    */
  var indentEndSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to keep_lines_together.
    */
  var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to keep_with_next.
    */
  var keepWithNextSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to line_spacing.
    */
  var lineSpacingSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to named_style_type.
    */
  var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in shading have been changed in
    * this suggestion.
    */
  var shadingSuggestionState: js.UndefOr[SchemaShadingSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to space_above.
    */
  var spaceAboveSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to space_below.
    */
  var spaceBelowSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to spacing_mode.
    */
  var spacingModeSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaParagraphStyleSuggestionState {
  @scala.inline
  def apply(): SchemaParagraphStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphStyleSuggestionState]
  }
  @scala.inline
  implicit class SchemaParagraphStyleSuggestionStateOps[Self <: SchemaParagraphStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidWidowAndOrphanSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidWidowAndOrphanSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidWidowAndOrphanSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidWidowAndOrphanSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBetweenSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBetweenSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBetweenSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBetweenSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentEndSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentEndSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentEndSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentEndSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFirstLineSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLineSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFirstLineSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLineSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentStartSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStartSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentStartSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStartSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLinesTogetherSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogetherSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLinesTogetherSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogetherSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepWithNextSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNextSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWithNextSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNextSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSpacingSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacingSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSpacingSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacingSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedStyleTypeSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleTypeSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyleTypeSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleTypeSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withShadingSuggestionState(value: SchemaShadingSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadingSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceAboveSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAboveSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceAboveSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAboveSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBelowSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBelowSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBelowSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBelowSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingModeSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingModeSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingModeSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingModeSuggested")(js.undefined)
        ret
    }
  }
  
}

