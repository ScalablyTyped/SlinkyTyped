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
  def apply(
    change: (Double, Boolean) => Unit,
    segments: js.Array[SegmentedControlSegment],
    mode: single | multiple | buttons = null,
    segmentStyle: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated = null,
    selectedIndex: Int | Double = null
  ): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction2(change), segments = segments.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (segmentStyle != null) __obj.updateDynamic("segmentStyle")(segmentStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
}

