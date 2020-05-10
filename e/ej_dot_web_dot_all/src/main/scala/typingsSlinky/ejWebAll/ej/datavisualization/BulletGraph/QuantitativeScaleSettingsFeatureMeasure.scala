package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsFeatureMeasure extends js.Object {
  /** Specifies the category of feature measure.
    * @Default {null}
    */
  var category: js.UndefOr[String] = js.native
  /** Comparative measure render till the specified value.
    * @Default {null}
    */
  var comparativeMeasureValue: js.UndefOr[Double] = js.native
  /** Feature measure render till the specified value.
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.native
}

object QuantitativeScaleSettingsFeatureMeasure {
  @scala.inline
  def apply(): QuantitativeScaleSettingsFeatureMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsFeatureMeasureOps[Self <: QuantitativeScaleSettingsFeatureMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withComparativeMeasureValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparativeMeasureValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasureValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

