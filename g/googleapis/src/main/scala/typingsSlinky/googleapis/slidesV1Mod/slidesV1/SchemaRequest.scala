package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single kind of update to apply to a presentation.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * Creates an image.
    */
  var createImage: js.UndefOr[SchemaCreateImageRequest] = js.native
  /**
    * Creates a line.
    */
  var createLine: js.UndefOr[SchemaCreateLineRequest] = js.native
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[SchemaCreateParagraphBulletsRequest] = js.native
  /**
    * Creates a new shape.
    */
  var createShape: js.UndefOr[SchemaCreateShapeRequest] = js.native
  /**
    * Creates an embedded Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[SchemaCreateSheetsChartRequest] = js.native
  /**
    * Creates a new slide.
    */
  var createSlide: js.UndefOr[SchemaCreateSlideRequest] = js.native
  /**
    * Creates a new table.
    */
  var createTable: js.UndefOr[SchemaCreateTableRequest] = js.native
  /**
    * Creates a video.
    */
  var createVideo: js.UndefOr[SchemaCreateVideoRequest] = js.native
  /**
    * Deletes a page or page element from the presentation.
    */
  var deleteObject: js.UndefOr[SchemaDeleteObjectRequest] = js.native
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[SchemaDeleteParagraphBulletsRequest] = js.native
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[SchemaDeleteTableColumnRequest] = js.native
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[SchemaDeleteTableRowRequest] = js.native
  /**
    * Deletes text from a shape or a table cell.
    */
  var deleteText: js.UndefOr[SchemaDeleteTextRequest] = js.native
  /**
    * Duplicates a slide or page element.
    */
  var duplicateObject: js.UndefOr[SchemaDuplicateObjectRequest] = js.native
  /**
    * Groups objects, such as page elements.
    */
  var groupObjects: js.UndefOr[SchemaGroupObjectsRequest] = js.native
  /**
    * Inserts columns into a table.
    */
  var insertTableColumns: js.UndefOr[SchemaInsertTableColumnsRequest] = js.native
  /**
    * Inserts rows into a table.
    */
  var insertTableRows: js.UndefOr[SchemaInsertTableRowsRequest] = js.native
  /**
    * Inserts text into a shape or table cell.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.native
  /**
    * Merges cells in a Table.
    */
  var mergeTableCells: js.UndefOr[SchemaMergeTableCellsRequest] = js.native
  /**
    * Refreshes a Google Sheets chart.
    */
  var refreshSheetsChart: js.UndefOr[SchemaRefreshSheetsChartRequest] = js.native
  /**
    * Replaces all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[SchemaReplaceAllShapesWithImageRequest] = js.native
  /**
    * Replaces all shapes matching some criteria with a Google Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[SchemaReplaceAllShapesWithSheetsChartRequest] = js.native
  /**
    * Replaces all instances of specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.native
  /**
    * Replaces an existing image with a new image.
    */
  var replaceImage: js.UndefOr[SchemaReplaceImageRequest] = js.native
  /**
    * Reroutes a line such that it&#39;s connected at the two closest
    * connection sites on the connected page elements.
    */
  var rerouteLine: js.UndefOr[SchemaRerouteLineRequest] = js.native
  /**
    * Ungroups objects, such as groups.
    */
  var ungroupObjects: js.UndefOr[SchemaUngroupObjectsRequest] = js.native
  /**
    * Unmerges cells in a Table.
    */
  var unmergeTableCells: js.UndefOr[SchemaUnmergeTableCellsRequest] = js.native
  /**
    * Updates the properties of an Image.
    */
  var updateImageProperties: js.UndefOr[SchemaUpdateImagePropertiesRequest] = js.native
  /**
    * Updates the category of a line.
    */
  var updateLineCategory: js.UndefOr[SchemaUpdateLineCategoryRequest] = js.native
  /**
    * Updates the properties of a Line.
    */
  var updateLineProperties: js.UndefOr[SchemaUpdateLinePropertiesRequest] = js.native
  /**
    * Updates the alt text title and/or description of a page element.
    */
  var updatePageElementAltText: js.UndefOr[SchemaUpdatePageElementAltTextRequest] = js.native
  /**
    * Updates the transform of a page element.
    */
  var updatePageElementTransform: js.UndefOr[SchemaUpdatePageElementTransformRequest] = js.native
  /**
    * Updates the Z-order of page elements.
    */
  var updatePageElementsZOrder: js.UndefOr[SchemaUpdatePageElementsZOrderRequest] = js.native
  /**
    * Updates the properties of a Page.
    */
  var updatePageProperties: js.UndefOr[SchemaUpdatePagePropertiesRequest] = js.native
  /**
    * Updates the styling of paragraphs within a Shape or Table.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.native
  /**
    * Updates the properties of a Shape.
    */
  var updateShapeProperties: js.UndefOr[SchemaUpdateShapePropertiesRequest] = js.native
  /**
    * Updates the position of a set of slides in the presentation.
    */
  var updateSlidesPosition: js.UndefOr[SchemaUpdateSlidesPositionRequest] = js.native
  /**
    * Updates the properties of the table borders in a Table.
    */
  var updateTableBorderProperties: js.UndefOr[SchemaUpdateTableBorderPropertiesRequest] = js.native
  /**
    * Updates the properties of a TableCell.
    */
  var updateTableCellProperties: js.UndefOr[SchemaUpdateTableCellPropertiesRequest] = js.native
  /**
    * Updates the properties of a Table column.
    */
  var updateTableColumnProperties: js.UndefOr[SchemaUpdateTableColumnPropertiesRequest] = js.native
  /**
    * Updates the properties of a Table row.
    */
  var updateTableRowProperties: js.UndefOr[SchemaUpdateTableRowPropertiesRequest] = js.native
  /**
    * Updates the styling of text within a Shape or Table.
    */
  var updateTextStyle: js.UndefOr[SchemaUpdateTextStyleRequest] = js.native
  /**
    * Updates the properties of a Video.
    */
  var updateVideoProperties: js.UndefOr[SchemaUpdateVideoPropertiesRequest] = js.native
}

object SchemaRequest {
  @scala.inline
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  @scala.inline
  implicit class SchemaRequestOps[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImage(value: SchemaCreateImageRequest): Self = {
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
    def withCreateLine(value: SchemaCreateLineRequest): Self = {
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
    def withCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = {
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
    def withCreateShape(value: SchemaCreateShapeRequest): Self = {
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
    def withCreateSheetsChart(value: SchemaCreateSheetsChartRequest): Self = {
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
    def withCreateSlide(value: SchemaCreateSlideRequest): Self = {
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
    def withCreateTable(value: SchemaCreateTableRequest): Self = {
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
    def withCreateVideo(value: SchemaCreateVideoRequest): Self = {
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
    def withDeleteObject(value: SchemaDeleteObjectRequest): Self = {
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
    def withDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = {
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
    def withDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = {
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
    def withDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = {
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
    def withDeleteText(value: SchemaDeleteTextRequest): Self = {
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
    def withDuplicateObject(value: SchemaDuplicateObjectRequest): Self = {
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
    def withGroupObjects(value: SchemaGroupObjectsRequest): Self = {
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
    def withInsertTableColumns(value: SchemaInsertTableColumnsRequest): Self = {
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
    def withInsertTableRows(value: SchemaInsertTableRowsRequest): Self = {
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
    def withInsertText(value: SchemaInsertTextRequest): Self = {
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
    def withMergeTableCells(value: SchemaMergeTableCellsRequest): Self = {
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
    def withRefreshSheetsChart(value: SchemaRefreshSheetsChartRequest): Self = {
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
    def withReplaceAllShapesWithImage(value: SchemaReplaceAllShapesWithImageRequest): Self = {
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
    def withReplaceAllShapesWithSheetsChart(value: SchemaReplaceAllShapesWithSheetsChartRequest): Self = {
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
    def withReplaceAllText(value: SchemaReplaceAllTextRequest): Self = {
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
    def withReplaceImage(value: SchemaReplaceImageRequest): Self = {
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
    def withRerouteLine(value: SchemaRerouteLineRequest): Self = {
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
    def withUngroupObjects(value: SchemaUngroupObjectsRequest): Self = {
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
    def withUnmergeTableCells(value: SchemaUnmergeTableCellsRequest): Self = {
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
    def withUpdateImageProperties(value: SchemaUpdateImagePropertiesRequest): Self = {
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
    def withUpdateLineCategory(value: SchemaUpdateLineCategoryRequest): Self = {
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
    def withUpdateLineProperties(value: SchemaUpdateLinePropertiesRequest): Self = {
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
    def withUpdatePageElementAltText(value: SchemaUpdatePageElementAltTextRequest): Self = {
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
    def withUpdatePageElementTransform(value: SchemaUpdatePageElementTransformRequest): Self = {
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
    def withUpdatePageElementsZOrder(value: SchemaUpdatePageElementsZOrderRequest): Self = {
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
    def withUpdatePageProperties(value: SchemaUpdatePagePropertiesRequest): Self = {
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
    def withUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = {
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
    def withUpdateShapeProperties(value: SchemaUpdateShapePropertiesRequest): Self = {
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
    def withUpdateSlidesPosition(value: SchemaUpdateSlidesPositionRequest): Self = {
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
    def withUpdateTableBorderProperties(value: SchemaUpdateTableBorderPropertiesRequest): Self = {
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
    def withUpdateTableCellProperties(value: SchemaUpdateTableCellPropertiesRequest): Self = {
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
    def withUpdateTableColumnProperties(value: SchemaUpdateTableColumnPropertiesRequest): Self = {
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
    def withUpdateTableRowProperties(value: SchemaUpdateTableRowPropertiesRequest): Self = {
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
    def withUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = {
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
    def withUpdateVideoProperties(value: SchemaUpdateVideoPropertiesRequest): Self = {
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

