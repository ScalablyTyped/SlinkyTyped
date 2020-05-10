package typingsSlinky.officeJs.OneNote.Interfaces

import typingsSlinky.officeJs.OneNote.ParagraphType
import typingsSlinky.officeJs.officeJsStrings.Image
import typingsSlinky.officeJs.officeJsStrings.Ink
import typingsSlinky.officeJs.officeJsStrings.Other
import typingsSlinky.officeJs.officeJsStrings.RichText
import typingsSlinky.officeJs.officeJsStrings.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "paragraph.toJSON()". */
@js.native
trait ParagraphData extends js.Object {
  /**
    *
    * Gets the ID of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageData] = js.native
  /**
    *
    * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkWords: js.UndefOr[js.Array[InkWordData]] = js.native
  /**
    *
    * The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
  /**
    *
    * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText. Read-only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var richText: js.UndefOr[RichTextData] = js.native
  /**
    *
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableData] = js.native
  /**
    *
    * Gets the type of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[ParagraphType | RichText | Image | Table | Ink | Other] = js.native
}

object ParagraphData {
  @scala.inline
  def apply(): ParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphData]
  }
  @scala.inline
  implicit class ParagraphDataOps[Self <: ParagraphData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withImage(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withInkWords(value: js.Array[InkWordData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkWords")(js.undefined)
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
    def withRichText(value: RichTextData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRichText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richText")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: TableData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ParagraphType | RichText | Image | Table | Ink | Other): Self = {
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

