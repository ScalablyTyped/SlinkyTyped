package typingsSlinky.egjsAxes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.egjsAxes.axesMod.AxesOption
import typingsSlinky.egjsAxes.axisManagerMod.Axis
import typingsSlinky.egjsAxes.axisManagerMod.AxisOption
import typingsSlinky.egjsAxes.constMod.DIRECTION
import typingsSlinky.egjsAxes.pinchInputMod.PinchInputOption
import typingsSlinky.egjsAxes.wheelInputMod.WheelInputOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.egjsAxes.axesMod.default {
    def this(axis: StringDictionary[AxisOption], options: AxesOption) = this()
    def this(axis: StringDictionary[AxisOption], options: AxesOption, startPos: Axis) = this()
  }
  
  /* static members */
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
    var PanInput: TypeofPanInput = js.native
    var PinchInput: Instantiable2[
        /* el */ js.Any, 
        js.UndefOr[/* options */ PinchInputOption], 
        typingsSlinky.egjsAxes.pinchInputMod.PinchInput
      ] = js.native
    var TRANSFORM: String = js.native
    var VERSION: String = js.native
    var WheelInput: Instantiable2[
        /* el */ js.Any, 
        js.UndefOr[/* options */ WheelInputOption], 
        typingsSlinky.egjsAxes.wheelInputMod.WheelInput
      ] = js.native
  }
  
}

