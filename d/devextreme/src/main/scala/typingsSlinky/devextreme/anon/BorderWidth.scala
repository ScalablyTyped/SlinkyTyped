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

@js.native
trait BorderWidth extends js.Object {
  var borderColor: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var colorGroupingField: js.UndefOr[String] = js.native
  var colorGroups: js.UndefOr[js.Array[Double]] = js.native
  var customize: js.UndefOr[js.Function1[/* elements */ js.Array[MapLayerElement], _]] = js.native
  var dataField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[
    js.Any | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String
  ] = js.native
  var elementType: js.UndefOr[bubble | dot | image | pie] = js.native
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  var hoveredBorderColor: js.UndefOr[String] = js.native
  var hoveredBorderWidth: js.UndefOr[Double] = js.native
  var hoveredColor: js.UndefOr[String] = js.native
  var label: js.UndefOr[DataFieldEnabled] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  var paletteSize: js.UndefOr[Double] = js.native
  var selectedBorderColor: js.UndefOr[String] = js.native
  var selectedBorderWidth: js.UndefOr[Double] = js.native
  var selectedColor: js.UndefOr[String] = js.native
  var selectionMode: js.UndefOr[multiple | none | single_] = js.native
  var size: js.UndefOr[Double] = js.native
  var sizeGroupingField: js.UndefOr[String] = js.native
  var sizeGroups: js.UndefOr[js.Array[Double]] = js.native
  var `type`: js.UndefOr[area | line | marker] = js.native
}

object BorderWidth {
  @scala.inline
  def apply(): BorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidth]
  }
  @scala.inline
  implicit class BorderWidthOps[Self <: BorderWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorGroupingField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGroupingField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorGroupingField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGroupingField")(js.undefined)
        ret
    }
    @scala.inline
    def withColorGroups(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomize(value: /* elements */ js.Array[MapLayerElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(js.undefined)
        ret
    }
    @scala.inline
    def withDataField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(
      value: js.Any | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withElementType(value: bubble | dot | image | pie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHoveredBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveredBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoveredBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveredBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHoveredBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveredBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoveredBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveredBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHoveredColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveredColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoveredColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveredColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: DataFieldEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: multiple | none | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeGroupingField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGroupingField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeGroupingField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGroupingField")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeGroups(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: area | line | marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

