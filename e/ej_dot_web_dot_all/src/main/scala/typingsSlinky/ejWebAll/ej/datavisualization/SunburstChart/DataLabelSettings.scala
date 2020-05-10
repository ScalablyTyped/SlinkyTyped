package typingsSlinky.ejWebAll.ej.datavisualization.SunburstChart

import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstLabelOverflowMode
import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstLabelRotationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabelSettings extends js.Object {
  /** Fill color for the datalabel
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[DataLabelSettingsFont] = js.native
  /** Datalabel overflow mode
    * @Default {Trim. See LabelOverflowMode}
    */
  var labelOverflowMode: js.UndefOr[SunburstLabelOverflowMode | String] = js.native
  /** Alignment of sunburst datalabel
    * @Default {Angle. See DatalabelAlignment}
    */
  var labelRotationMode: js.UndefOr[SunburstLabelRotationMode | String] = js.native
  /** Custom template for datalabel
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Datalabel visibility of the Sunburst.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object DataLabelSettings {
  @scala.inline
  def apply(): DataLabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelSettings]
  }
  @scala.inline
  implicit class DataLabelSettingsOps[Self <: DataLabelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: DataLabelSettingsFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOverflowMode(value: SunburstLabelOverflowMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverflowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOverflowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverflowMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRotationMode(value: SunburstLabelRotationMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRotationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

