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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSegmentedControlConstructorOptions extends StObject {
  
  /**
    * Called when the user selects a new segment.
    */
  var change: js.UndefOr[js.Function2[/* selectedIndex */ Double, /* isSelected */ Boolean, Unit]] = js.native
  
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
    * interaction. When the mode is `multiple` it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.native
}
object TouchBarSegmentedControlConstructorOptions {
  
  @scala.inline
  def apply(segments: js.Array[SegmentedControlSegment]): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarSegmentedControlConstructorOptionsMutableBuilder[Self <: TouchBarSegmentedControlConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* selectedIndex */ Double, /* isSelected */ Boolean) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setMode(value: single | multiple | buttons): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSegmentStyle(
      value: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
    ): Self = StObject.set(x, "segmentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentStyleUndefined: Self = StObject.set(x, "segmentStyle", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[SegmentedControlSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: SegmentedControlSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
