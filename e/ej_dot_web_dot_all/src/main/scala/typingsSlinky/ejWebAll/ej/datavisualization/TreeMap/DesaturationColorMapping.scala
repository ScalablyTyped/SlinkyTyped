package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesaturationColorMapping extends js.Object {
  /** Specifies the color for desaturationColorMapping
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the from value for desaturation color mapping
    * @Default {0}
    */
  var from: js.UndefOr[Double] = js.native
  /** Specifies the rangeMaximum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMaximum: js.UndefOr[Double] = js.native
  /** Specifies the rangeMinimum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMinimum: js.UndefOr[Double] = js.native
  /** Specifies the to value for desaturation color mapping
    * @Default {0}
    */
  var to: js.UndefOr[Double] = js.native
}

object DesaturationColorMapping {
  @scala.inline
  def apply(): DesaturationColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesaturationColorMapping]
  }
  @scala.inline
  implicit class DesaturationColorMappingOps[Self <: DesaturationColorMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

