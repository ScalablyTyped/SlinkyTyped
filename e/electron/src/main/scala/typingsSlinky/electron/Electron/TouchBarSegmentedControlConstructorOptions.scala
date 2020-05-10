package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`round-rect`
import typingsSlinky.electron.electronStrings.`small-square`
import typingsSlinky.electron.electronStrings.`textured-rounded`
import typingsSlinky.electron.electronStrings.`textured-square`
import typingsSlinky.electron.electronStrings.automatic
import typingsSlinky.electron.electronStrings.buttons
import typingsSlinky.electron.electronStrings.capsule
import typingsSlinky.electron.electronStrings.multiple
import typingsSlinky.electron.electronStrings.rounded
import typingsSlinky.electron.electronStrings.separated
import typingsSlinky.electron.electronStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarSegmentedControlConstructorOptions extends js.Object {
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[single | multiple | buttons] = js.native
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
  ] = js.native
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment] = js.native
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is multiple it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  /**
    * Called when the user selects a new segment.
    */
  def change(selectedIndex: Double, isSelected: Boolean): Unit = js.native
}

object TouchBarSegmentedControlConstructorOptions {
  @scala.inline
  def apply(change: (Double, Boolean) => Unit, segments: js.Array[SegmentedControlSegment]): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction2(change), segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarSegmentedControlConstructorOptionsOps[Self <: TouchBarSegmentedControlConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[SegmentedControlSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: single | multiple | buttons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentStyle(
      value: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentStyle")(js.undefined)
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
  }
  
}

