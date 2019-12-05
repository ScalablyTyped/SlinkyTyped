package typingsSlinky.atEgjsAxes.axesMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atEgjsAxes.TypeofClassPanInput
import typingsSlinky.atEgjsAxes.axisManagerMod.Axis
import typingsSlinky.atEgjsAxes.axisManagerMod.AxisOption
import typingsSlinky.atEgjsAxes.constMod.DIRECTION
import typingsSlinky.atEgjsAxes.inputTypePinchInputMod.PinchInputOption
import typingsSlinky.atEgjsAxes.inputTypeWheelInputMod.WheelInputOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/Axes", JSImport.Default)
@js.native
class default protected () extends Axes {
  def this(axis: StringDictionary[AxisOption], options: AxesOption) = this()
  def this(axis: StringDictionary[AxisOption], options: AxesOption, startPos: Axis) = this()
}

/* static members */
@JSImport("@egjs/axes/Axes", JSImport.Default)
@js.native
object default extends js.Object {
  var DIRECTION_ALL: DIRECTION = js.native
  var DIRECTION_DOWN: DIRECTION = js.native
  var DIRECTION_HORIZONTAL: DIRECTION = js.native
  var DIRECTION_LEFT: DIRECTION = js.native
  var DIRECTION_NONE: DIRECTION = js.native
  var DIRECTION_RIGHT: DIRECTION = js.native
  var DIRECTION_UP: DIRECTION = js.native
  var DIRECTION_VERTICAL: DIRECTION = js.native
  var PanInput: TypeofClassPanInput = js.native
  var PinchInput: Instantiable2[
    /* el */ js.Any, 
    js.UndefOr[/* options */ PinchInputOption], 
    typingsSlinky.atEgjsAxes.inputTypePinchInputMod.PinchInput
  ] = js.native
  var TRANSFORM: String = js.native
  var VERSION: String = js.native
  var WheelInput: Instantiable2[
    /* el */ js.Any, 
    js.UndefOr[/* options */ WheelInputOption], 
    typingsSlinky.atEgjsAxes.inputTypeWheelInputMod.WheelInput
  ] = js.native
}

