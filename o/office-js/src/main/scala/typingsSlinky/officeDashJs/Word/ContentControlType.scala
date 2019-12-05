package typingsSlinky.officeDashJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentControlType extends js.Object

/**
  *
  * Specifies supported content control types and subtypes.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.ContentControlType")
@js.native
object ContentControlType extends js.Object {
  @js.native
  sealed trait buildingBlockGallery extends ContentControlType
  
  @js.native
  sealed trait checkBox extends ContentControlType
  
  @js.native
  sealed trait comboBox extends ContentControlType
  
  @js.native
  sealed trait datePicker extends ContentControlType
  
  @js.native
  sealed trait dropDownList extends ContentControlType
  
  @js.native
  sealed trait picture extends ContentControlType
  
  @js.native
  sealed trait plainText extends ContentControlType
  
  @js.native
  sealed trait plainTextInline extends ContentControlType
  
  @js.native
  sealed trait plainTextParagraph extends ContentControlType
  
  @js.native
  sealed trait repeatingSection extends ContentControlType
  
  /**
    *
    * Identifies a rich text content control.
    *
    */
  @js.native
  sealed trait richText extends ContentControlType
  
  @js.native
  sealed trait richTextInline extends ContentControlType
  
  @js.native
  sealed trait richTextParagraphs extends ContentControlType
  
  /**
    *
    * Contains a whole table.
    *
    */
  @js.native
  sealed trait richTextTable extends ContentControlType
  
  /**
    *
    * Contains a whole cell.
    *
    */
  @js.native
  sealed trait richTextTableCell extends ContentControlType
  
  /**
    *
    * Contains a whole row.
    *
    */
  @js.native
  sealed trait richTextTableRow extends ContentControlType
  
  @js.native
  sealed trait unknown extends ContentControlType
  
  /* "BuildingBlockGallery" */ val buildingBlockGallery: typingsSlinky.officeDashJs.Word.ContentControlType.buildingBlockGallery with String = js.native
  /* "CheckBox" */ val checkBox: typingsSlinky.officeDashJs.Word.ContentControlType.checkBox with String = js.native
  /* "ComboBox" */ val comboBox: typingsSlinky.officeDashJs.Word.ContentControlType.comboBox with String = js.native
  /* "DatePicker" */ val datePicker: typingsSlinky.officeDashJs.Word.ContentControlType.datePicker with String = js.native
  /* "DropDownList" */ val dropDownList: typingsSlinky.officeDashJs.Word.ContentControlType.dropDownList with String = js.native
  /* "Picture" */ val picture: typingsSlinky.officeDashJs.Word.ContentControlType.picture with String = js.native
  /* "PlainText" */ val plainText: typingsSlinky.officeDashJs.Word.ContentControlType.plainText with String = js.native
  /* "PlainTextInline" */ val plainTextInline: typingsSlinky.officeDashJs.Word.ContentControlType.plainTextInline with String = js.native
  /* "PlainTextParagraph" */ val plainTextParagraph: typingsSlinky.officeDashJs.Word.ContentControlType.plainTextParagraph with String = js.native
  /* "RepeatingSection" */ val repeatingSection: typingsSlinky.officeDashJs.Word.ContentControlType.repeatingSection with String = js.native
  /* "RichText" */ val richText: typingsSlinky.officeDashJs.Word.ContentControlType.richText with String = js.native
  /* "RichTextInline" */ val richTextInline: typingsSlinky.officeDashJs.Word.ContentControlType.richTextInline with String = js.native
  /* "RichTextParagraphs" */ val richTextParagraphs: typingsSlinky.officeDashJs.Word.ContentControlType.richTextParagraphs with String = js.native
  /* "RichTextTable" */ val richTextTable: typingsSlinky.officeDashJs.Word.ContentControlType.richTextTable with String = js.native
  /* "RichTextTableCell" */ val richTextTableCell: typingsSlinky.officeDashJs.Word.ContentControlType.richTextTableCell with String = js.native
  /* "RichTextTableRow" */ val richTextTableRow: typingsSlinky.officeDashJs.Word.ContentControlType.richTextTableRow with String = js.native
  /* "Unknown" */ val unknown: typingsSlinky.officeDashJs.Word.ContentControlType.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentControlType with String] = js.native
}

