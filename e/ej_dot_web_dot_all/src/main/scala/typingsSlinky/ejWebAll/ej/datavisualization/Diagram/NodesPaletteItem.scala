package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesPaletteItem extends js.Object {
  /** Defines whether the symbol should be drawn at its actual size regardless of precedence factors or not
    * @Default {true}
    */
  var enableScale: js.UndefOr[Boolean] = js.native
  /** Defines the height of the symbol
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** To display a name for nodes in the symbol palette
    * @Default {null}
    */
  var label: js.UndefOr[String] = js.native
  /** Defines the margin of the symbol item
    * @Default {{ left: 4, right: 4, top: 4, bottom: 4 }}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines the preview height of the symbol
    * @Default {undefined}
    */
  var previewHeight: js.UndefOr[Double] = js.native
  /** Defines the preview width of the symbol
    * @Default {undefined}
    */
  var previewWidth: js.UndefOr[Double] = js.native
  /** Defines the width of the symbol
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object NodesPaletteItem {
  @scala.inline
  def apply(): NodesPaletteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPaletteItem]
  }
  @scala.inline
  implicit class NodesPaletteItemOps[Self <: NodesPaletteItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScale")(js.undefined)
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
    def withLabel(value: String): Self = {
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
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
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

