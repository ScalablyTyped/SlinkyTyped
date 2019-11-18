package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBar")
@js.native
class TouchBar protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar
  def this(options: TouchBarConstructorOptions) = this()
  var escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null = js.native
}

/* static members */
@JSGlobal("Electron.TouchBar")
@js.native
object TouchBar extends js.Object {
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarButton
  ] = js.native
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarColorPicker
  ] = js.native
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarGroup
  ] = js.native
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarLabel
  ] = js.native
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarPopover
  ] = js.native
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarScrubber
  ] = js.native
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarSegmentedControl
  ] = js.native
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarSlider
  ] = js.native
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarSpacer
  ] = js.native
}

