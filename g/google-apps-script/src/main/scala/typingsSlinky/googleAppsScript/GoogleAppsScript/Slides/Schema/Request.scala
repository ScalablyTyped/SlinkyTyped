package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var createImage: js.UndefOr[CreateImageRequest] = js.native
  var createLine: js.UndefOr[CreateLineRequest] = js.native
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
  var createShape: js.UndefOr[CreateShapeRequest] = js.native
  var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.native
  var createSlide: js.UndefOr[CreateSlideRequest] = js.native
  var createTable: js.UndefOr[CreateTableRequest] = js.native
  var createVideo: js.UndefOr[CreateVideoRequest] = js.native
  var deleteObject: js.UndefOr[DeleteObjectRequest] = js.native
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
  var deleteText: js.UndefOr[DeleteTextRequest] = js.native
  var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.native
  var groupObjects: js.UndefOr[GroupObjectsRequest] = js.native
  var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.native
  var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.native
  var insertText: js.UndefOr[InsertTextRequest] = js.native
  var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.native
  var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.native
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.native
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.native
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
  var replaceImage: js.UndefOr[ReplaceImageRequest] = js.native
  var rerouteLine: js.UndefOr[RerouteLineRequest] = js.native
  var ungroupObjects: js.UndefOr[UngroupObjectsRequest] = js.native
  var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.native
  var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.native
  var updateLineCategory: js.UndefOr[UpdateLineCategoryRequest] = js.native
  var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.native
  var updatePageElementAltText: js.UndefOr[UpdatePageElementAltTextRequest] = js.native
  var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.native
  var updatePageElementsZOrder: js.UndefOr[UpdatePageElementsZOrderRequest] = js.native
  var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.native
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
  var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.native
  var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.native
  var updateTableBorderProperties: js.UndefOr[UpdateTableBorderPropertiesRequest] = js.native
  var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.native
  var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.native
  var updateTableRowProperties: js.UndefOr[UpdateTableRowPropertiesRequest] = js.native
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
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
    def withGroupObjects(value: GroupObjectsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupObjects")(js.undefined)
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
    def withMergeTableCells(value: MergeTableCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeTableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeTableCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeTableCells")(js.undefined)
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
    def withReplaceImage(value: ReplaceImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceImage")(js.undefined)
        ret
    }
    @scala.inline
    def withRerouteLine(value: RerouteLineRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerouteLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRerouteLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerouteLine")(js.undefined)
        ret
    }
    @scala.inline
    def withUngroupObjects(value: UngroupObjectsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ungroupObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUngroupObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ungroupObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmergeTableCells(value: UnmergeTableCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmergeTableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmergeTableCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmergeTableCells")(js.undefined)
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
    def withUpdateLineCategory(value: UpdateLineCategoryRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLineCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateLineCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLineCategory")(js.undefined)
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
    def withUpdatePageElementAltText(value: UpdatePageElementAltTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageElementAltText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePageElementAltText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageElementAltText")(js.undefined)
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
    def withUpdatePageElementsZOrder(value: UpdatePageElementsZOrderRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageElementsZOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePageElementsZOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageElementsZOrder")(js.undefined)
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
    def withUpdateTableBorderProperties(value: UpdateTableBorderPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableBorderProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTableBorderProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableBorderProperties")(js.undefined)
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
    def withUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableColumnProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTableColumnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableColumnProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTableRowProperties(value: UpdateTableRowPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableRowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTableRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableRowProperties")(js.undefined)
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

