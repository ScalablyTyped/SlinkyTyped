package typingsSlinky.reactDashSelect

import typingsSlinky.reactDashSelect.srcSelectMod.Props
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action[OptionType /* <: OptionTypeBase */] extends js.Object {
  var cx: js.Any = js.native
  var hasValue: Boolean = js.native
  var isMulti: Boolean = js.native
  var isRtl: Boolean = js.native
  var options: OptionsType[_] = js.native
  var selectProps: ReadonlychildrenReactNode with Props[OptionType] = js.native
  def clearValue(): Unit = js.native
  def getStyles(key: String, props: js.Object): js.Object = js.native
  def getValue(): js.Array[OptionType] = js.native
  def selectOption(newValue: OptionType): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
}

