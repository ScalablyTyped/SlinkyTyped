package typingsSlinky.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLElement
  import slinky.web.SyntheticFocusEvent
  import slinky.web.SyntheticKeyboardEvent
  import slinky.web.SyntheticMouseEvent
  import typingsSlinky.react.reactMod.Ref

  type ClassNameList = js.Array[String]
  type ClassNamesState = js.UndefOr[StringDictionary[Boolean]]
  type FocusEventHandler = js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], Unit]
  type GroupedOptionsType[OptionType /* <: OptionTypeBase */] = js.Array[GroupType[OptionType]]
  type InnerRef = Ref[js.Any]
  type KeyboardEventHandler = js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]
  type MouseEventHandler = js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]
  type OptionTypeBase = StringDictionary[js.Any]
  type OptionsType[OptionType /* <: OptionTypeBase */] = js.Array[OptionType]
  type ValueType[OptionType /* <: OptionTypeBase */] = js.UndefOr[OptionType | OptionsType[OptionType] | Null]
}
