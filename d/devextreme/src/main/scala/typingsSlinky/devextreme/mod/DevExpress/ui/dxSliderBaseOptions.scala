package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.FormatPosition
import typingsSlinky.devextreme.anon.ShowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSliderBaseOptions[T] extends dxTrackBarOptions[T] {
  /** Specifies the step by which a handle moves when a user presses Page Up or Page Down. */
  var keyStep: js.UndefOr[Double] = js.native
  /** Configures the labels displayed at the min and max values. */
  var label: js.UndefOr[FormatPosition] = js.native
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.native
  /** Specifies whether to highlight the selected range. */
  var showRange: js.UndefOr[Boolean] = js.native
  /** Specifies the step by which the widget's value changes when a user drags a handler. */
  var step: js.UndefOr[Double] = js.native
  /** Configures a tooltip. */
  var tooltip: js.UndefOr[ShowMode] = js.native
}

object dxSliderBaseOptions {
  @scala.inline
  def apply[T](): dxSliderBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSliderBaseOptions[T]]
  }
  @scala.inline
  implicit class dxSliderBaseOptionsOps[Self[t] <: dxSliderBaseOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKeyStep(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyStep: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStep")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: FormatPosition): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRange(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRange")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ShowMode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

