package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBulletGraphRange
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the brush to use to fill the range.
  	 */
  var brush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the value at which the range ends along the scale.
  	 */
  var endValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the inner edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var innerEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the inner edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var innerStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the name of the range.
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the outer edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var outerEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the outer edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var outerStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the outline to use when rendering the range.
  	 */
  var outline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the value at which the range starts along the scale.
  	 */
  var startValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness to use when rendering this range's outline.
  	 */
  var strokeThickness: js.UndefOr[Double] = js.native
}

object IgBulletGraphRange {
  @scala.inline
  def apply(): IgBulletGraphRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBulletGraphRange]
  }
  @scala.inline
  implicit class IgBulletGraphRangeOps[Self <: IgBulletGraphRange] (val x: Self) extends AnyVal {
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

