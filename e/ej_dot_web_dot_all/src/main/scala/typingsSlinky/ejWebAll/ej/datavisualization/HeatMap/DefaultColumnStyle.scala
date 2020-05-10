package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultColumnStyle extends js.Object {
  /** Specifies the template id of the heat map column header.
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  /** Specifies the template id of all individual cell data of the heat map.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Specifies the alignment mode of the heat map column.
    * @Default {ej.HeatMap.TextAlign.Center}
    */
  var textAlign: js.UndefOr[js.Any] = js.native
}

object DefaultColumnStyle {
  @scala.inline
  def apply(): DefaultColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultColumnStyle]
  }
  @scala.inline
  implicit class DefaultColumnStyleOps[Self <: DefaultColumnStyle] (val x: Self) extends AnyVal {
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
    def withTextAlign(value: js.Any): Self = {
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
  }
  
}

