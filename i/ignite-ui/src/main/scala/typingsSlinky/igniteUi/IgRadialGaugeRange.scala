package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialGaugeRange
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the brush for the entire range.
  	 */
  var brush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the ending value of the range.
  	 */
  var endValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the ending value of the inner extent of the range.
  	 */
  var innerEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the starting value of the inner extent of the range.
  	 */
  var innerStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the name of the range.
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the ending value of the outer extent of the range.
  	 */
  var outerEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the starting value of the outer extent of the range.
  	 */
  var outerStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush for the outline of the range.
  	 */
  var outline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the flag used to determine if the range should be removed. If set to true, the range (if existing) is removed.
  	 */
  var remove: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the starting value of the range.
  	 */
  var startValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the thickness of the range outline.
  	 */
  var strokeThickness: js.UndefOr[Double] = js.native
}

object IgRadialGaugeRange {
  @scala.inline
  def apply(): IgRadialGaugeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialGaugeRange]
  }
  @scala.inline
  implicit class IgRadialGaugeRangeOps[Self <: IgRadialGaugeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerEndExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerEndExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerEndExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerEndExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerStartExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerStartExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerStartExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerStartExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterEndExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerEndExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterEndExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerEndExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterStartExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerStartExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterStartExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerStartExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(js.undefined)
        ret
    }
  }
  
}

