package typingsSlinky.officeJsPreview.Word.Interfaces

import typingsSlinky.officeJsPreview.Word.ContentControlAppearance
import typingsSlinky.officeJsPreview.Word.ContentControlType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BoundingBox
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BuildingBlockGallery
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CheckBox
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ComboBox
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DatePicker
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DropDownList
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hidden
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Picture
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PlainText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PlainTextInline
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PlainTextParagraph
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RepeatingSection
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RichText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RichTextInline
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RichTextParagraphs
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RichTextTable
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RichTextTableCell
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RichTextTableRow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tags
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "contentControl.toJSON()". */
@js.native
trait ContentControlData extends js.Object {
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Gets the collection of content control objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.native
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.native
  /**
    *
    * Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[Double] = js.native
  /**
    *
    * Gets the collection of inlinePicture objects in the content control. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.native
  /**
    *
    * Gets the collection of list objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.native
  /**
    *
    * Get the collection of paragraph objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[
    ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.native
  /**
    *
    * Gets the collection of table objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[String] = js.native
  /**
    *
    * Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.native
  /**
    *
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[
    ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.native
}

object ContentControlData {
  @scala.inline
  def apply(): ContentControlData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlData]
  }
  @scala.inline
  implicit class ContentControlDataOps[Self <: ContentControlData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearance(value: ContentControlAppearance | BoundingBox | Tags | Hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def withCannotDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannotDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withCannotEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannotEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContentControls(value: js.Array[ContentControlData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentControls")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontData): Self = {
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
    def withId(value: Double): Self = {
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
    def withInlinePictures(value: js.Array[InlinePictureData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlinePictures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlinePictures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlinePictures")(js.undefined)
        ret
    }
    @scala.inline
    def withLists(value: js.Array[ListData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphs(value: js.Array[ParagraphData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveWhenEdited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhenEdited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveWhenEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhenEdited")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
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
    def withStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = {
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
    def withSubtype(
      value: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[TableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

