package typingsSlinky.officeUiFabricReact.detailsListDocumentsExampleMod

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListDocumentsExampleState extends js.Object {
  var announcedMessage: js.UndefOr[String] = js.native
  var columns: js.Array[IColumn] = js.native
  var isCompactMode: Boolean = js.native
  var isModalSelection: Boolean = js.native
  var items: js.Array[IDocument] = js.native
  var selectionDetails: String = js.native
}

object IDetailsListDocumentsExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    isCompactMode: Boolean,
    isModalSelection: Boolean,
    items: js.Array[IDocument],
    selectionDetails: String
  ): IDetailsListDocumentsExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isCompactMode = isCompactMode.asInstanceOf[js.Any], isModalSelection = isModalSelection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListDocumentsExampleState]
  }
  @scala.inline
  implicit class IDetailsListDocumentsExampleStateOps[Self <: IDetailsListDocumentsExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCompactMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsModalSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModalSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnouncedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnouncedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcedMessage")(js.undefined)
        ret
    }
  }
  
}

