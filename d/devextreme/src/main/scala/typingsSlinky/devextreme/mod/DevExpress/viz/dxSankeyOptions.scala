package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorMode
import typingsSlinky.devextreme.anon.ComponentDxSankey
import typingsSlinky.devextreme.anon.ComponentElementEventModel
import typingsSlinky.devextreme.anon.EventModelTarget
import typingsSlinky.devextreme.anon.HorizontalOffset
import typingsSlinky.devextreme.anon.KeepLabels
import typingsSlinky.devextreme.anon.Padding
import typingsSlinky.devextreme.anon.TargetDxSankeyNode
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
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankeyOptions extends BaseWidgetOptions[dxSankey] {
  /** Specifies adaptive layout options. */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.native
  /** Aligns node columns vertically. */
  var alignment: js.UndefOr[bottom | center | top | (js.Array[bottom | center | top])] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** Specifies whether nodes and links change their style when they are hovered over or pressed. */
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  /** Configures sankey nodes' labels. */
  var label: js.UndefOr[HorizontalOffset] = js.native
  /** Configures sankey links' appearance. */
  var link: js.UndefOr[ColorMode] = js.native
  /** Configures sankey nodes' appearance. */
  var node: js.UndefOr[Padding] = js.native
  /** A function that is executed when a sankey link is clicked or tapped. */
  var onLinkClick: js.UndefOr[(js.Function1[/* e */ EventModelTarget, _]) | String] = js.native
  /** A function that is executed after the pointer enters or leaves a sankey link. */
  var onLinkHoverChanged: js.UndefOr[js.Function1[/* e */ ComponentDxSankey, _]] = js.native
  /** A function that is executed when a sankey node is clicked or tapped. */
  var onNodeClick: js.UndefOr[(js.Function1[/* e */ ComponentElementEventModel, _]) | String] = js.native
  /** A function that is executed after the pointer enters or leaves a sankey node. */
  var onNodeHoverChanged: js.UndefOr[js.Function1[/* e */ TargetDxSankeyNode, _]] = js.native
  /** Sets the palette to be used to colorize sankey nodes. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** Specifies how to extend the palette when it contains less colors than the number of sankey nodes. */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** Specifies nodes' sorting order in their columns. */
  var sortData: js.UndefOr[js.Any] = js.native
  /** Specifies which data source field provides links' source nodes. */
  var sourceField: js.UndefOr[String] = js.native
  /** Specifies which data source field provides links' target nodes. */
  var targetField: js.UndefOr[String] = js.native
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  @JSName("tooltip")
  var tooltip_dxSankeyOptions: js.UndefOr[dxSankeyTooltip] = js.native
  /** Specifies which data source field provides links' weights. */
  var weightField: js.UndefOr[String] = js.native
}

object dxSankeyOptions {
  @scala.inline
  def apply(): dxSankeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyOptions]
  }
  @scala.inline
  implicit class dxSankeyOptionsOps[Self <: dxSankeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveLayout(value: KeepLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignment(value: bottom | center | top | (js.Array[bottom | center | top])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = {
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
    def withLabel(value: HorizontalOffset): Self = {
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
    def withLink(value: ColorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkClickFunction1(value: /* e */ EventModelTarget => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLinkClick(value: (js.Function1[/* e */ EventModelTarget, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkHoverChanged(value: /* e */ ComponentDxSankey => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLinkHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeClickFunction1(value: /* e */ ComponentElementEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNodeClick(value: (js.Function1[/* e */ ComponentElementEventModel, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNodeClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeHoverChanged(value: /* e */ TargetDxSankeyNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodeHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeHoverChanged")(js.undefined)
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
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortData")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceField")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetField")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: dxSankeyTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightField")(js.undefined)
        ret
    }
  }
  
}

