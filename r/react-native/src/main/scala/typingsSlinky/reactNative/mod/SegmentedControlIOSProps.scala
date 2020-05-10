package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControlIOSProps extends ViewProps {
  /**
    * If false the user won't be able to interact with the control. Default value is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * If true, then selecting a segment won't persist visually.
    * The onValueChange callback will still work as expected.
    */
  var momentary: js.UndefOr[Boolean] = js.native
  /**
    * Callback that is called when the user taps a segment;
    * passes the event as an argument
    */
  var onChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, NativeSegmentedControlIOSChangeEvent], Unit]
  ] = js.native
  /**
    * Callback that is called when the user taps a segment; passes the segment's value as an argument
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /**
    * The index in props.values of the segment to be (pre)selected.
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  /**
    * Accent color of the control.
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * The labels for the control's segment buttons, in order.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SegmentedControlIOSProps {
  @scala.inline
  def apply(): SegmentedControlIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentedControlIOSProps]
  }
  @scala.inline
  implicit class SegmentedControlIOSPropsOps[Self <: SegmentedControlIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMomentary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentary")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[NodeHandle, NativeSegmentedControlIOSChangeEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

