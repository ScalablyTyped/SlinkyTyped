package typingsSlinky.atEgjsAxes.axesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atEgjsAxes.animationManagerMod.AnimationManager
import typingsSlinky.atEgjsAxes.axisManagerMod.Axis
import typingsSlinky.atEgjsAxes.axisManagerMod.AxisManager
import typingsSlinky.atEgjsAxes.axisManagerMod.AxisOption
import typingsSlinky.atEgjsAxes.eventManagerMod.EventManager
import typingsSlinky.atEgjsAxes.inputObserverMod.InputObserver
import typingsSlinky.atEgjsAxes.inputTypeInputTypeMod.IInputType
import typingsSlinky.atEgjsAxes.interruptManagerMod.InterruptManager
import typingsSlinky.atEgjsComponent.atEgjsComponentMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes extends ^ {
  var _am: AnimationManager = js.native
  var _axm: AxisManager = js.native
  var _em: EventManager = js.native
  var _inputs: js.Array[IInputType] = js.native
  var _io: InputObserver = js.native
  var _itm: InterruptManager = js.native
  var axis: StringDictionary[AxisOption] = js.native
  @JSName("options")
  var options_Axes: AxesOption = js.native
  /* private */ def _complementOptions(): js.Any = js.native
  def connect(axes: String, inputType: IInputType): this.type = js.native
  def connect(axes: js.Array[String], inputType: IInputType): this.type = js.native
  def destroy(): Unit = js.native
  def disconnect(): this.type = js.native
  def disconnect(inputType: IInputType): this.type = js.native
  def get(): Axis = js.native
  def get(axes: js.Array[String]): Axis = js.native
  def isBounceArea(): Boolean = js.native
  def isBounceArea(axes: js.Array[String]): Boolean = js.native
  def setBy(pos: Axis): this.type = js.native
  def setBy(pos: Axis, duration: Double): this.type = js.native
  def setTo(pos: Axis): this.type = js.native
  def setTo(pos: Axis, duration: Double): this.type = js.native
}

