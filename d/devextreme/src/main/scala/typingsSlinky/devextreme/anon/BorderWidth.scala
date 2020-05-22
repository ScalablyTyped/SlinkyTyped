package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bubble
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.image
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.marker
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.pie
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.MapLayerElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderWidth extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorGroupingField: js.UndefOr[String] = js.undefined
  var colorGroups: js.UndefOr[js.Array[Double]] = js.undefined
  var customize: js.UndefOr[js.Function1[/* elements */ js.Array[MapLayerElement], _]] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[
    js.Any | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String
  ] = js.undefined
  var elementType: js.UndefOr[bubble | dot | image | pie] = js.undefined
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  var hoveredBorderColor: js.UndefOr[String] = js.undefined
  var hoveredBorderWidth: js.UndefOr[Double] = js.undefined
  var hoveredColor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[DataFieldEnabled] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  var paletteSize: js.UndefOr[Double] = js.undefined
  var selectedBorderColor: js.UndefOr[String] = js.undefined
  var selectedBorderWidth: js.UndefOr[Double] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeGroupingField: js.UndefOr[String] = js.undefined
  var sizeGroups: js.UndefOr[js.Array[Double]] = js.undefined
  var `type`: js.UndefOr[area | line | marker] = js.undefined
}

object BorderWidth {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    colorGroupingField: String = null,
    colorGroups: js.Array[Double] = null,
    customize: /* elements */ js.Array[MapLayerElement] => _ = null,
    dataField: String = null,
    dataSource: js.Any | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String = null,
    elementType: bubble | dot | image | pie = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    hoveredBorderColor: String = null,
    hoveredBorderWidth: js.UndefOr[Double] = js.undefined,
    hoveredColor: String = null,
    label: DataFieldEnabled = null,
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteSize: js.UndefOr[Double] = js.undefined,
    selectedBorderColor: String = null,
    selectedBorderWidth: js.UndefOr[Double] = js.undefined,
    selectedColor: String = null,
    selectionMode: multiple | none | single_ = null,
    size: js.UndefOr[Double] = js.undefined,
    sizeGroupingField: String = null,
    sizeGroups: js.Array[Double] = null,
    `type`: area | line | marker = null
  ): BorderWidth = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorGroupingField != null) __obj.updateDynamic("colorGroupingField")(colorGroupingField.asInstanceOf[js.Any])
    if (colorGroups != null) __obj.updateDynamic("colorGroups")(colorGroups.asInstanceOf[js.Any])
    if (customize != null) __obj.updateDynamic("customize")(js.Any.fromFunction1(customize))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.get.asInstanceOf[js.Any])
    if (hoveredBorderColor != null) __obj.updateDynamic("hoveredBorderColor")(hoveredBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hoveredBorderWidth)) __obj.updateDynamic("hoveredBorderWidth")(hoveredBorderWidth.get.asInstanceOf[js.Any])
    if (hoveredColor != null) __obj.updateDynamic("hoveredColor")(hoveredColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(paletteSize)) __obj.updateDynamic("paletteSize")(paletteSize.get.asInstanceOf[js.Any])
    if (selectedBorderColor != null) __obj.updateDynamic("selectedBorderColor")(selectedBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedBorderWidth)) __obj.updateDynamic("selectedBorderWidth")(selectedBorderWidth.get.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (sizeGroupingField != null) __obj.updateDynamic("sizeGroupingField")(sizeGroupingField.asInstanceOf[js.Any])
    if (sizeGroups != null) __obj.updateDynamic("sizeGroups")(sizeGroups.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidth]
  }
}

