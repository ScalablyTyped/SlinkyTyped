package typingsSlinky.ejWebAll.ej.Rating

import typingsSlinky.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables the rating control with reset button.It can be used to reset the rating control value.
    * @Default {true}
    */
  var allowReset: js.UndefOr[Boolean] = js.native
  /** Fires when Rating value changes.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires when Rating control is clicked successfully.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Fires when Rating control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when Rating control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** When this property is set to false, it disables the rating control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the height of the Rating control wrapper.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies the list of HTML attributes to be added to rating control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specifies the value to be increased while navigating between shapes(stars) in Rating control.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.native
  /** Allow to render the maximum number of Rating shape(star).
    * @Default {5}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Allow to render the minimum number of Rating shape(star).
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.native
  /** Fires when mouse move is moving the Rating control.
    */
  var mousemove: js.UndefOr[js.Function1[/* e */ MousemoveEventArgs, Unit]] = js.native
  /** Fires when mouse hover is removed from Rating control.
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.native
  /** Fires when mouse hovered over the Rating control.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  /** Specifies the orientation of Rating control. See Orientation
    * @Default {ej.Rating.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  /** Helps to provide more precise ratings.Rating control supports three precision modes - full, half, and exact. See Precision
    * @Default {full}
    */
  var precision: js.UndefOr[Precision | String] = js.native
  /** Interaction with Rating control can be prevented by enabling this API.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** To specify the height of each shape in Rating control.
    * @Default {23}
    */
  var shapeHeight: js.UndefOr[Double] = js.native
  /** To specify the width of each shape in Rating control.
    * @Default {23}
    */
  var shapeWidth: js.UndefOr[Double] = js.native
  /** Enables the tooltip option.Currently selected value will be displayed in tooltip.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** To specify the number of stars to be selected while rendering.
    * @Default {1}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the width of the Rating control wrapper.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReset")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMousemove(value: /* e */ MousemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Precision | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
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
    @scala.inline
    def withWidth(value: String): Self = {
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

