package typingsSlinky.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait ParagraphCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isLastParagraph: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the List to which this paragraph belongs. Throws an error if the paragraph is not in a list.
    *
    * [Api set: WordApi 1.3]
    */
  var list: js.UndefOr[ListLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the List to which this paragraph belongs. Returns a null object if the paragraph is not in a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listOrNullObject: js.UndefOr[ListLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the paragraph.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the paragraph. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the paragraph. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the paragraph. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the paragraph. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the paragraph. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the paragraph. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
}

object ParagraphCollectionLoadOptions {
  @scala.inline
  def apply(): ParagraphCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionLoadOptions]
  }
  @scala.inline
  implicit class ParagraphCollectionLoadOptionsOps[Self <: ParagraphCollectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignment(value: Boolean): Self = {
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
    def withFirstLineIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLineIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLastParagraph(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLastParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLastParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLastParagraph")(js.undefined)
        ret
    }
    @scala.inline
    def withIsListItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isListItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSpacing(value: Boolean): Self = {
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
    def withLineUnitAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineUnitAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineUnitAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineUnitAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withLineUnitBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineUnitBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineUnitBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineUnitBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: ListLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withListItem(value: ListItemLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(js.undefined)
        ret
    }
    @scala.inline
    def withListItemOrNullObject(value: ListItemLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItemOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withListOrNullObject(value: ListLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withParentBody(value: BodyLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBody")(js.undefined)
        ret
    }
    @scala.inline
    def withParentContentControl(value: ContentControlLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentContentControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControl")(js.undefined)
        ret
    }
    @scala.inline
    def withParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControlOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentContentControlOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControlOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTable(value: TableLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTable")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTableCell(value: TableCellLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTableCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTableCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTableCell")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTableCellOrNullObject(value: TableCellLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTableCellOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTableCellOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTableCellOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTableOrNullObject(value: TableLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTableOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTableOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTableOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBuiltIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBuiltIn")(js.undefined)
        ret
    }
    @scala.inline
    def withTableNestingLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableNestingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableNestingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableNestingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

