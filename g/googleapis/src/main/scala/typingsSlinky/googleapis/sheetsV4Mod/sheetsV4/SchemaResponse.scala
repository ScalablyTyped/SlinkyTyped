package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends js.Object {
  /**
    * A reply from adding a banded range.
    */
  var addBanding: js.UndefOr[SchemaAddBandingResponse] = js.native
  /**
    * A reply from adding a chart.
    */
  var addChart: js.UndefOr[SchemaAddChartResponse] = js.native
  /**
    * A reply from adding a dimension group.
    */
  var addDimensionGroup: js.UndefOr[SchemaAddDimensionGroupResponse] = js.native
  /**
    * A reply from adding a filter view.
    */
  var addFilterView: js.UndefOr[SchemaAddFilterViewResponse] = js.native
  /**
    * A reply from adding a named range.
    */
  var addNamedRange: js.UndefOr[SchemaAddNamedRangeResponse] = js.native
  /**
    * A reply from adding a protected range.
    */
  var addProtectedRange: js.UndefOr[SchemaAddProtectedRangeResponse] = js.native
  /**
    * A reply from adding a sheet.
    */
  var addSheet: js.UndefOr[SchemaAddSheetResponse] = js.native
  /**
    * A reply from creating a developer metadata entry.
    */
  var createDeveloperMetadata: js.UndefOr[SchemaCreateDeveloperMetadataResponse] = js.native
  /**
    * A reply from deleting a conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[SchemaDeleteConditionalFormatRuleResponse] = js.native
  /**
    * A reply from deleting a developer metadata entry.
    */
  var deleteDeveloperMetadata: js.UndefOr[SchemaDeleteDeveloperMetadataResponse] = js.native
  /**
    * A reply from deleting a dimension group.
    */
  var deleteDimensionGroup: js.UndefOr[SchemaDeleteDimensionGroupResponse] = js.native
  /**
    * A reply from duplicating a filter view.
    */
  var duplicateFilterView: js.UndefOr[SchemaDuplicateFilterViewResponse] = js.native
  /**
    * A reply from duplicating a sheet.
    */
  var duplicateSheet: js.UndefOr[SchemaDuplicateSheetResponse] = js.native
  /**
    * A reply from doing a find/replace.
    */
  var findReplace: js.UndefOr[SchemaFindReplaceResponse] = js.native
  /**
    * A reply from updating a conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleResponse] = js.native
  /**
    * A reply from updating a developer metadata entry.
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataResponse] = js.native
  /**
    * A reply from updating an embedded object&#39;s position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionResponse] = js.native
}

object SchemaResponse {
  @scala.inline
  def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  @scala.inline
  implicit class SchemaResponseOps[Self <: SchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBanding(value: SchemaAddBandingResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddBanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBanding")(js.undefined)
        ret
    }
    @scala.inline
    def withAddChart(value: SchemaAddChartResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChart")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDimensionGroup(value: SchemaAddDimensionGroupResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAddFilterView(value: SchemaAddFilterViewResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddFilterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterView")(js.undefined)
        ret
    }
    @scala.inline
    def withAddNamedRange(value: SchemaAddNamedRangeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNamedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNamedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAddProtectedRange(value: SchemaAddProtectedRangeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddProtectedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSheet(value: SchemaAddSheetResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeveloperMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConditionalFormatRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteConditionalFormatRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConditionalFormatRule")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDeveloperMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDimensionGroup(value: SchemaDeleteDimensionGroupResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateFilterView(value: SchemaDuplicateFilterViewResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateFilterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateFilterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateFilterView")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateSheet(value: SchemaDuplicateSheetResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withFindReplace(value: SchemaFindReplaceResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findReplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findReplace")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateConditionalFormatRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateConditionalFormatRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateConditionalFormatRule")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeveloperMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEmbeddedObjectPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEmbeddedObjectPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEmbeddedObjectPosition")(js.undefined)
        ret
    }
  }
  
}

