package typingsSlinky.officeDashJsDashPreview.Excel.Interfaces

import typingsSlinky.officeDashJsDashPreview.Excel.AggregationFunction
import typingsSlinky.officeDashJsDashPreview.Excel.ShowAsRule
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Average
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Count
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CountNumbers
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Max
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Min
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Product
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StandardDeviation
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StandardDeviationP
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Sum
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Variance
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `dataPivotHierarchy.toJSON()`. */
trait DataPivotHierarchyData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldData] = js.undefined
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    *
    * Determines whether the data should be shown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.undefined
  /**
    *
    * Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.undefined
}

object DataPivotHierarchyData {
  @scala.inline
  def apply(
    field: PivotFieldData = null,
    id: String = null,
    name: String = null,
    numberFormat: String = null,
    position: Int | Double = null,
    showAs: ShowAsRule = null,
    summarizeBy: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = null
  ): DataPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs.asInstanceOf[js.Any])
    if (summarizeBy != null) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyData]
  }
}

