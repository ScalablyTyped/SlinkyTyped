package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsMappingColumnStyle extends js.Object {
  /** Specifies the template id of the column header.
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  /** Specifies the template id of all individual cell data.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Specifies the text align mode of the heat map column.
    * @Default {ej.HeatMap.TextAlign.Center}
    */
  var textAlign: js.UndefOr[String] = js.native
  /** Specifies the width of the heat map column.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object ItemsMappingColumnStyle {
  @scala.inline
  def apply(): ItemsMappingColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsMappingColumnStyle]
  }
  @scala.inline
  implicit class ItemsMappingColumnStyleOps[Self <: ItemsMappingColumnStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
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

