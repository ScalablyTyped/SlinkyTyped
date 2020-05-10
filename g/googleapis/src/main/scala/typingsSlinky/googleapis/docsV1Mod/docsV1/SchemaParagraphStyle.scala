package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a whole paragraph.  Inherited paragraph styles are
  * represented as unset fields in this message. A paragraph style&#39;s parent
  * depends on where the paragraph style is defined:    * The ParagraphStyle on
  * a Paragraph     inherits from the paragraph&#39;s corresponding named style
  * type.   * The ParagraphStyle on a named style     inherits from the normal
  * text named style.   * The ParagraphStyle of the normal text named style
  * inherits     from the default paragraph style in the Docs editor.   * The
  * ParagraphStyle on a Paragraph     element that is contained in a table may
  * inherit its paragraph style from     the table style.  If the paragraph
  * style does not inherit from a parent, unsetting fields will revert the
  * style to a value matching the defaults in the Docs editor.
  */
@js.native
trait SchemaParagraphStyle extends js.Object {
  /**
    * The text alignment for this paragraph.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * Whether to avoid widows and orphans for the paragraph. If unset, the
    * value is inherited from the parent.
    */
  var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.native
  /**
    * The border between this paragraph and the next and previous paragraphs.
    * If unset, the value is inherited from the parent.  The between border is
    * rendered when the adjacent paragraph has the same border and indent
    * properties.  Paragraph borders cannot be partially updated. When making
    * changes to a paragraph border the new border must be specified in its
    * entirety.
    */
  var borderBetween: js.UndefOr[SchemaParagraphBorder] = js.native
  /**
    * The border at the bottom of this paragraph. If unset, the value is
    * inherited from the parent.  The bottom border is rendered when the
    * paragraph below has different border and indent properties.  Paragraph
    * borders cannot be partially updated. When making changes to a paragraph
    * border the new border must be specified in its entirety.
    */
  var borderBottom: js.UndefOr[SchemaParagraphBorder] = js.native
  /**
    * The border to the left of this paragraph. If unset, the value is
    * inherited from the parent.  Paragraph borders cannot be partially
    * updated. When making changes to a paragraph border the new border must be
    * specified in its entirety.
    */
  var borderLeft: js.UndefOr[SchemaParagraphBorder] = js.native
  /**
    * The border to the right of this paragraph. If unset, the value is
    * inherited from the parent.  Paragraph borders cannot be partially
    * updated. When making changes to a paragraph border the new border must be
    * specified in its entirety.
    */
  var borderRight: js.UndefOr[SchemaParagraphBorder] = js.native
  /**
    * The border at the top of this paragraph. If unset, the value is inherited
    * from the parent.  The top border is rendered when the paragraph above has
    * different border and indent properties.  Paragraph borders cannot be
    * partially updated. When making changes to a paragraph border the new
    * border must be specified in its entirety.
    */
  var borderTop: js.UndefOr[SchemaParagraphBorder] = js.native
  /**
    * The text direction of this paragraph. If unset, the value defaults to
    * LEFT_TO_RIGHT since paragraph direction is not inherited.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The heading ID of the paragraph. If empty, then this paragraph is not a
    * heading. This property is read-only.
    */
  var headingId: js.UndefOr[String] = js.native
  /**
    * The amount of indentation for the paragraph on the side that corresponds
    * to the end of the text, based on the current paragraph direction. If
    * unset, the value is inherited from the parent.
    */
  var indentEnd: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of indentation for the first line of the paragraph. If unset,
    * the value is inherited from the parent.
    */
  var indentFirstLine: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of indentation for the paragraph on the side that corresponds
    * to the start of the text, based on the current paragraph direction. If
    * unset, the value is inherited from the parent.
    */
  var indentStart: js.UndefOr[SchemaDimension] = js.native
  /**
    * Whether all lines of the paragraph should be laid out on the same page or
    * column if possible. If unset, the value is inherited from the parent.
    */
  var keepLinesTogether: js.UndefOr[Boolean] = js.native
  /**
    * Whether at least a part of this paragraph should be laid out on the same
    * page or column as the next paragraph if possible. If unset, the value is
    * inherited from the parent.
    */
  var keepWithNext: js.UndefOr[Boolean] = js.native
  /**
    * The amount of space between lines, as a percentage of normal, where
    * normal is represented as 100.0. If unset, the value is inherited from the
    * parent.
    */
  var lineSpacing: js.UndefOr[Double] = js.native
  /**
    * The named style type of the paragraph.  Since updating the named style
    * type affects other properties within ParagraphStyle, the named style type
    * is applied before the other properties are updated.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * The shading of the paragraph. If unset, the value is inherited from the
    * parent.
    */
  var shading: js.UndefOr[SchemaShading] = js.native
  /**
    * The amount of extra space above the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceAbove: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of extra space below the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceBelow: js.UndefOr[SchemaDimension] = js.native
  /**
    * The spacing mode for the paragraph.
    */
  var spacingMode: js.UndefOr[String] = js.native
  /**
    * A list of the tab stops for this paragraph. The list of tab stops is not
    * inherited. This property is read-only.
    */
  var tabStops: js.UndefOr[js.Array[SchemaTabStop]] = js.native
}

object SchemaParagraphStyle {
  @scala.inline
  def apply(): SchemaParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphStyle]
  }
  @scala.inline
  implicit class SchemaParagraphStyleOps[Self <: SchemaParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidWidowAndOrphan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidWidowAndOrphan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidWidowAndOrphan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidWidowAndOrphan")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBetween(value: SchemaParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBetween")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBetween")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottom(value: SchemaParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeft(value: SchemaParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRight(value: SchemaParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTop(value: SchemaParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingId")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentEnd(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFirstLine(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentStart(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLinesTogether(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLinesTogether: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogether")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepWithNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWithNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNext")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedStyleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(js.undefined)
        ret
    }
    @scala.inline
    def withShading(value: SchemaShading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceAbove(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAbove")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBelow(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBelow")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStops(value: js.Array[SchemaTabStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStops")(js.undefined)
        ret
    }
  }
  
}

