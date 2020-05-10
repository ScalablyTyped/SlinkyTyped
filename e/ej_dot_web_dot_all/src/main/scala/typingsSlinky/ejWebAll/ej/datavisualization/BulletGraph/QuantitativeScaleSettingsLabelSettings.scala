package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsLabelSettings extends js.Object {
  /** Contains property to customize the font of the labels in bullet graph.
    */
  var font: js.UndefOr[QuantitativeScaleSettingsLabelSettingsFont] = js.native
  /** Specifies the placement of labels in bullet graph scale.
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
  /** Specifies the prefix to be added with labels in bullet graph.
    * @Default {Empty string}
    */
  var labelPrefix: js.UndefOr[String] = js.native
  /** Specifies the suffix to be added after labels in bullet graph.
    * @Default {Empty string}
    */
  var labelSuffix: js.UndefOr[String] = js.native
  /** Specifies the horizontal/vertical padding of labels.
    * @Default {15}
    */
  var offset: js.UndefOr[Double] = js.native
  /** Specifies the position of the labels to render either above or below the graph. See
    * @Default {below}
    */
  var position: js.UndefOr[LabelPosition | String] = js.native
  /** Specifies the Size of the labels.
    * @Default {12}
    */
  var size: js.UndefOr[Double] = js.native
  /** Specifies the stroke color of the labels in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.native
}

object QuantitativeScaleSettingsLabelSettings {
  @scala.inline
  def apply(): QuantitativeScaleSettingsLabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettings]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsLabelSettingsOps[Self <: QuantitativeScaleSettingsLabelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: QuantitativeScaleSettingsLabelSettingsFont): Self = {
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
    def withLabelPlacement(value: LabelPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LabelPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
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
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

