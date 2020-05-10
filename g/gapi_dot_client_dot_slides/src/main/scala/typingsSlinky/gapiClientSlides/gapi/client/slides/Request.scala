package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /** Creates an image. */
  var createImage: js.UndefOr[CreateImageRequest] = js.native
  /** Creates a line. */
  var createLine: js.UndefOr[CreateLineRequest] = js.native
  /** Creates bullets for paragraphs. */
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
  /** Creates a new shape. */
  var createShape: js.UndefOr[CreateShapeRequest] = js.native
  /** Creates an embedded Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.native
  /** Creates a new slide. */
  var createSlide: js.UndefOr[CreateSlideRequest] = js.native
  /** Creates a new table. */
  var createTable: js.UndefOr[CreateTableRequest] = js.native
  /** Creates a video. */
  var createVideo: js.UndefOr[CreateVideoRequest] = js.native
  /** Deletes a page or page element from the presentation. */
  var deleteObject: js.UndefOr[DeleteObjectRequest] = js.native
  /** Deletes bullets from paragraphs. */
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
  /** Deletes a column from a table. */
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
  /** Deletes a row from a table. */
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
  /** Deletes text from a shape or a table cell. */
  var deleteText: js.UndefOr[DeleteTextRequest] = js.native
  /** Duplicates a slide or page element. */
  var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.native
  /** Inserts columns into a table. */
  var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.native
  /** Inserts rows into a table. */
  var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.native
  /** Inserts text into a shape or table cell. */
  var insertText: js.UndefOr[InsertTextRequest] = js.native
  /** Refreshes a Google Sheets chart. */
  var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.native
  /** Replaces all shapes matching some criteria with an image. */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.native
  /** Replaces all shapes matching some criteria with a Google Sheets chart. */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.native
  /** Replaces all instances of specified text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
  /** Updates the properties of an Image. */
  var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.native
  /** Updates the properties of a Line. */
  var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.native
  /** Updates the transform of a page element. */
  var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.native
  /** Updates the properties of a Page. */
  var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.native
  /** Updates the styling of paragraphs within a Shape or Table. */
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
  /** Updates the properties of a Shape. */
  var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.native
  /** Updates the position of a set of slides in the presentation. */
  var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.native
  /** Updates the properties of a TableCell. */
  var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.native
  /** Updates the styling of text within a Shape or Table. */
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
  /** Updates the properties of a Video. */
  var updateVideoProperties: js.UndefOr[UpdateVideoPropertiesRequest] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImage(value: CreateImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImage")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateLine(value: CreateLineRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLine")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParagraphBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateParagraphBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParagraphBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateShape(value: CreateShapeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createShape")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSheetsChart(value: CreateSheetsChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSheetsChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSheetsChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSheetsChart")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSlide(value: CreateSlideRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTable(value: CreateTableRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTable")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateVideo(value: CreateVideoRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteObject(value: DeleteObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteParagraphBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteParagraphBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteParagraphBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTableColumn(value: DeleteTableColumnRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTableColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTableRow(value: DeleteTableRowRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteText(value: DeleteTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteText")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateObject(value: DuplicateObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateObject")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTableColumns(value: InsertTableColumnsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTableRows(value: InsertTableRowsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertText(value: InsertTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshSheetsChart(value: RefreshSheetsChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSheetsChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshSheetsChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSheetsChart")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllShapesWithImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithImage")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithSheetsChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllShapesWithSheetsChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithSheetsChart")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllText(value: ReplaceAllTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateImageProperties(value: UpdateImagePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateImageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateImageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateImageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLineProperties(value: UpdateLinePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLineProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateLineProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLineProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePageElementTransform(value: UpdatePageElementTransformRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageElementTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePageElementTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageElementTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePageProperties(value: UpdatePagePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateParagraphStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateParagraphStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateParagraphStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateShapeProperties(value: UpdateShapePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateShapeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateShapeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateShapeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSlidesPosition(value: UpdateSlidesPositionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSlidesPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSlidesPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSlidesPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTableCellProperties(value: UpdateTableCellPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableCellProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTableCellProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableCellProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTextStyle(value: UpdateTextStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateVideoProperties(value: UpdateVideoPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateVideoProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateVideoProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateVideoProperties")(js.undefined)
        ret
    }
  }
  
}

