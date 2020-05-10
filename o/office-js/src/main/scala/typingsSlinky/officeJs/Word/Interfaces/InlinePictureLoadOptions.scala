package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an inline picture.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait InlinePictureLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the parent paragraph that contains the inline image.
    *
    * [Api set: WordApi 1.2]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the inline image. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the inline image. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the table that contains the inline image. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * Gets the table cell that contains the inline image. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * Gets the table cell that contains the inline image. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * Gets the table that contains the inline image. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.native
}

object InlinePictureLoadOptions {
  @scala.inline
  def apply(): InlinePictureLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureLoadOptions]
  }
  @scala.inline
  implicit class InlinePictureLoadOptionsOps[Self <: InlinePictureLoadOptions] (val x: Self) extends AnyVal {
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
    def withAltTextDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTextDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAltTextTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTextTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraph(value: ParagraphLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.undefined)
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
    def withWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

