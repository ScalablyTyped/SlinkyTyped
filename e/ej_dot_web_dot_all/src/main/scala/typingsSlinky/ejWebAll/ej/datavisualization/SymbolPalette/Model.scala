package typingsSlinky.ejWebAll.ej.datavisualization.SymbolPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Defines whether the symbols can be dragged from palette or not
    * @Default {true}
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /** Customizes the style of the symbol palette
    * @Default {e-symbolpalette}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Defines the default properties of nodes and connectors
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.native
  /** Sets the Id of the diagram, over which the symbols will be dropped
    * @Default {null}
    */
  var diagramId: js.UndefOr[String] = js.native
  /** Sets the height of the palette headers
    * @Default {30}
    */
  var headerHeight: js.UndefOr[Double] = js.native
  /** Defines the height of the symbol palette
    * @Default {400}
    */
  var height: js.UndefOr[Double] = js.native
  /** Defines the height of the palette items
    * @Default {50}
    */
  var paletteItemHeight: js.UndefOr[Double] = js.native
  /** Defines the width of the palette items
    * @Default {50}
    */
  var paletteItemWidth: js.UndefOr[Double] = js.native
  /** An array of JSON objects, where each object represents a node/connector
    * @Default {[]}
    */
  var palettes: js.UndefOr[js.Array[Palette]] = js.native
  /** Defines the preview height of the symbols
    * @Default {100}
    */
  var previewHeight: js.UndefOr[Double] = js.native
  /** Defines the offset value to be left between the mouse cursor and symbol previews
    * @Default {(110, 110)}
    */
  var previewOffset: js.UndefOr[js.Any] = js.native
  /** Defines the width of the symbol previews
    * @Default {100}
    */
  var previewWidth: js.UndefOr[Double] = js.native
  /** Triggers when a palette item is selected or unselected
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.native
  /** Enable or disable the palette item text
    * @Default {true}
    */
  var showPaletteItemText: js.UndefOr[Boolean] = js.native
  /** The width of the palette
    * @Default {250}
    */
  var width: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSettings(value: DefaultSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagramId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagramId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteItemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteItemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteItemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPalettes(value: js.Array[Palette]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palettes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalettes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palettes")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPaletteItemText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPaletteItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPaletteItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPaletteItemText")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

