package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersLabelSettings extends js.Object {
  /** enable or disable the enableSmartLabel property
    * @Default {false}
    */
  var enableSmartLabel: js.UndefOr[Boolean] = js.native
  /** set the labelLength property
    * @Default {'2'}
    */
  var labelLength: js.UndefOr[Double] = js.native
  /** set the labelPath property
    * @Default {null}
    */
  var labelPath: js.UndefOr[String] = js.native
  /** The property specifies whether to show labels or not.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** set the smartLabelSize property
    * @Default {fixed}
    */
  var smartLabelSize: js.UndefOr[LabelSize | String] = js.native
}

object LayersSubLayersLabelSettings {
  @scala.inline
  def apply(): LayersSubLayersLabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersLabelSettings]
  }
  @scala.inline
  implicit class LayersSubLayersLabelSettingsOps[Self <: LayersSubLayersLabelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableSmartLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSmartLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSmartLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSmartLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLength")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPath")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartLabelSize(value: LabelSize | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartLabelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartLabelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartLabelSize")(js.undefined)
        ret
    }
  }
  
}

