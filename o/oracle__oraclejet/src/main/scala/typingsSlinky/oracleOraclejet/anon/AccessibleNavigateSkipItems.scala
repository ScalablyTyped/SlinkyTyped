package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibleNavigateSkipItems extends js.Object {
  var accessibleNavigateSkipItems: js.UndefOr[String] = js.native
  var accessibleReorderAfterItem: js.UndefOr[String] = js.native
  var accessibleReorderBeforeItem: js.UndefOr[String] = js.native
  var accessibleReorderInsideItem: js.UndefOr[String] = js.native
  var accessibleReorderTouchInstructionText: js.UndefOr[String] = js.native
  var indexerCharacters: js.UndefOr[String] = js.native
  var labelCopy: js.UndefOr[String] = js.native
  var labelCut: js.UndefOr[String] = js.native
  var labelPaste: js.UndefOr[String] = js.native
  var labelPasteAfter: js.UndefOr[String] = js.native
  var labelPasteBefore: js.UndefOr[String] = js.native
  var msgFetchingData: js.UndefOr[String] = js.native
  var msgNoData: js.UndefOr[String] = js.native
}

object AccessibleNavigateSkipItems {
  @scala.inline
  def apply(): AccessibleNavigateSkipItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibleNavigateSkipItems]
  }
  @scala.inline
  implicit class AccessibleNavigateSkipItemsOps[Self <: AccessibleNavigateSkipItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibleNavigateSkipItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleNavigateSkipItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleNavigateSkipItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleNavigateSkipItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleReorderAfterItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderAfterItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleReorderAfterItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderAfterItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleReorderBeforeItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderBeforeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleReorderBeforeItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderBeforeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleReorderInsideItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderInsideItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleReorderInsideItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderInsideItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleReorderTouchInstructionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderTouchInstructionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleReorderTouchInstructionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleReorderTouchInstructionText")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexerCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexerCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCopy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCut")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPaste(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPasteAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPasteAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPasteBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPasteBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgFetchingData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgFetchingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgFetchingData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgFetchingData")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgNoData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgNoData")(js.undefined)
        ret
    }
  }
  
}

