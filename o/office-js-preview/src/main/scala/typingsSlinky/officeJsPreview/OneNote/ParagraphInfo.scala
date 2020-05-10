package typingsSlinky.officeJsPreview.OneNote

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bullet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * List information for paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ParagraphInfo extends js.Object {
  /**
    *
    * //
    Bullet list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var bulletType: String = js.native
  /**
    *
    * //
    Index of paragraph in list
    *
    * [Api set: OneNoteApi 1.1]
    */
  var index: Double = js.native
  /**
    *
    * //
    Type of list in paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var listType: ListType | None | Number | Bullet = js.native
  /**
    *
    * //
    number list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
}

object ParagraphInfo {
  @scala.inline
  def apply(
    bulletType: String,
    index: Double,
    listType: ListType | None | Number | Bullet,
    numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
  ): ParagraphInfo = {
    val __obj = js.Dynamic.literal(bulletType = bulletType.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], numberType = numberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphInfo]
  }
  @scala.inline
  implicit class ParagraphInfoOps[Self <: ParagraphInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListType(value: ListType | None | Number | Bullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

