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

trait TouchBarSegmentedControlConstructorOptions extends js.Object {
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[single | multiple | buttons] = js.undefined
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
  ] = js.undefined
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment]
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is multiple it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  /**
    * Called when the user selects a new segment.
    */
  def change(selectedIndex: Double, isSelected: Boolean): Unit
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChange(value: (Double, Boolean) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def setSegments(value: js.Array[SegmentedControlSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: single | multiple | buttons): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSegmentStyle(
      value: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
    ): Self = this.set("segmentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentStyle: Self = this.set("segmentStyle", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
  }
  
}

