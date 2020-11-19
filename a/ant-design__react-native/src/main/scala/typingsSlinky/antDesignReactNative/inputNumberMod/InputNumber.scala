package typingsSlinky.antDesignReactNative.inputNumberMod

import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.down
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.up
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputNumber[P /* <: InputNumberProps */, S /* <: InputNumberState */]
  extends Component[P, S, js.Any] {
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MInputNumber(nextProps: P): Unit = js.native
  
  var _stepDown: js.Any = js.native
  
  var _stepDownText: js.Any = js.native
  
  var _stepUp: js.Any = js.native
  
  var _stepUpText: js.Any = js.native
  
  @JSName("action")
  def action_down(`type`: down, e: js.Any): Unit = js.native
  @JSName("action")
  def action_down(`type`: down, e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
  @JSName("action")
  def action_down(`type`: down, e: js.Any, ratio: js.Any): Unit = js.native
  @JSName("action")
  def action_down(`type`: down, e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
  @JSName("action")
  def action_up(`type`: up, e: js.Any): Unit = js.native
  @JSName("action")
  def action_up(`type`: up, e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
  @JSName("action")
  def action_up(`type`: up, e: js.Any, ratio: js.Any): Unit = js.native
  @JSName("action")
  def action_up(`type`: up, e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
  
  var autoStepTimer: js.Any = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInputNumber(): Unit = js.native
  
  def down(e: js.Any): Unit = js.native
  def down(e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
  def down(e: js.Any, ratio: js.Any): Unit = js.native
  def down(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
  
  def getCurrentValidValue(value: js.Any): js.Any = js.native
  
  def getMaxPrecision(currentValue: js.Any): Double = js.native
  def getMaxPrecision(currentValue: js.Any, ratio: Double): Double = js.native
  
  def getPrecision(value: js.Any): Double = js.native
  
  def getPrecisionFactor(currentValue: js.Any): Double = js.native
  def getPrecisionFactor(currentValue: js.Any, ratio: Double): Double = js.native
  
  def getValidValue(value: js.Any): js.Any = js.native
  
  def getValueFromEvent(e: js.Any): js.Any = js.native
  
  def isNotCompleteNumber(num: js.Any): Boolean = js.native
  
  def onBlur(e: js.Any, args: js.Any*): Unit = js.native
  
  def onChange(e: js.Any): Unit = js.native
  
  def onFocus(args: js.Any*): Unit = js.native
  
  def onPressIn(`type`: String): Unit = js.native
  
  def onPressInDown(e: js.Any): Unit = js.native
  
  def onPressInUp(e: js.Any): Unit = js.native
  
  def onPressOut(`type`: js.Any): Unit = js.native
  
  def onPressOutDown(): Unit = js.native
  
  def onPressOutUp(): Unit = js.native
  
  def setValue(v: js.Any): Unit = js.native
  def setValue(v: js.Any, callback: js.Any): Unit = js.native
  
  @JSName("stepCompute")
  def stepCompute_down(`type`: down, `val`: js.Any, rat: js.Any): js.Any = js.native
  @JSName("stepCompute")
  def stepCompute_up(`type`: up, `val`: js.Any, rat: js.Any): js.Any = js.native
  
  @JSName("step")
  def step_down(`type`: down, e: js.Any): Boolean = js.native
  @JSName("step")
  def step_down(`type`: down, e: js.Any, ratio: Double): Boolean = js.native
  @JSName("step")
  def step_up(`type`: up, e: js.Any): Boolean = js.native
  @JSName("step")
  def step_up(`type`: up, e: js.Any, ratio: Double): Boolean = js.native
  
  def stop(): Unit = js.native
  
  def toNumber(num: js.Any): js.Any = js.native
  
  def toNumberWhenUserInput(num: js.Any): js.Any = js.native
  
  def toPrecisionAsStep(num: js.Any): js.Any = js.native
  
  def up(e: js.Any): Unit = js.native
  def up(e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
  def up(e: js.Any, ratio: js.Any): Unit = js.native
  def up(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
}
