package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettings extends js.Object {
  /** Contains property to customize the comparative measure.
    */
  var comparativeMeasureSettings: js.UndefOr[QuantitativeScaleSettingsComparativeMeasureSettings] = js.native
  /** Contains property to customize the featured measure.
    */
  var featureMeasures: js.UndefOr[js.Array[QuantitativeScaleSettingsFeatureMeasure]] = js.native
  /** Contains property to customize the featured measure.
    */
  var featuredMeasureSettings: js.UndefOr[QuantitativeScaleSettingsFeaturedMeasureSettings] = js.native
  /** Contains property to customize the fields.
    */
  var fields: js.UndefOr[QuantitativeScaleSettingsFields] = js.native
  /** Specifies the interval for the Graph.
    * @Default {1}
    */
  var interval: js.UndefOr[Double] = js.native
  /** Contains property to customize the labels.
    */
  var labelSettings: js.UndefOr[QuantitativeScaleSettingsLabelSettings] = js.native
  /** Contains property to customize the position of the quantitative scale
    */
  var location: js.UndefOr[QuantitativeScaleSettingsLocation] = js.native
  /** Contains property to customize the major tick lines.
    */
  var majorTickSettings: js.UndefOr[QuantitativeScaleSettingsMajorTickSettings] = js.native
  /** Specifies the maximum value of the Graph.
    * @Default {10}
    */
  var maximum: js.UndefOr[Double] = js.native
  /** Specifies the minimum value of the Graph.
    * @Default {0}
    */
  var minimum: js.UndefOr[Double] = js.native
  /** Contains property to customize the minor ticks.
    */
  var minorTickSettings: js.UndefOr[QuantitativeScaleSettingsMinorTickSettings] = js.native
  /** The specified number of minor ticks will be rendered per interval.
    * @Default {4}
    */
  var minorTicksPerInterval: js.UndefOr[Double] = js.native
  /** Specifies the placement of ticks to render either inside or outside the scale.
    * @Default {ej.datavisualization.BulletGraph.TickPlacement.Outside}
    */
  var tickPlacement: js.UndefOr[TickPlacement | String] = js.native
  /** Specifies the position of the ticks to render either above,below or inside
    * @Default {ej.datavisualization.BulletGraph.TickPosition.Far}
    */
  var tickPosition: js.UndefOr[TickPosition | String] = js.native
}

object QuantitativeScaleSettings {
  @scala.inline
  def apply(): QuantitativeScaleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettings]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsOps[Self <: QuantitativeScaleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparativeMeasureSettings(value: QuantitativeScaleSettingsComparativeMeasureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparativeMeasureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureMeasures(value: js.Array[QuantitativeScaleSettingsFeatureMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureMeasures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureMeasures")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedMeasureSettings(value: QuantitativeScaleSettingsFeaturedMeasureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredMeasureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedMeasureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredMeasureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: QuantitativeScaleSettingsFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSettings(value: QuantitativeScaleSettingsLabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: QuantitativeScaleSettingsLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTickSettings(value: QuantitativeScaleSettingsMajorTickSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickSettings(value: QuantitativeScaleSettingsMinorTickSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicksPerInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicksPerInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTicksPerInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicksPerInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPlacement(value: TickPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPosition(value: TickPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPosition")(js.undefined)
        ret
    }
  }
  
}

