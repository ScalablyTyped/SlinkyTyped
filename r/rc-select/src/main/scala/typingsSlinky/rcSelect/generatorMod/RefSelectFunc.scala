package typingsSlinky.rcSelect.generatorMod

import slinky.core.ReactComponentClass
import typingsSlinky.rcSelect.generateMod.RefSelectProps
import typingsSlinky.rcSelect.generateMod.SelectProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-select/lib/interface/generator", "RefSelectFunc")
@js.native
object RefSelectFunc extends js.Object {
  def apply[OptionsType /* <: js.Array[js.Object] */, ValueType](Component: ReactComponentClass[RefSelectProps]): ForwardRefExoticComponent[
    (PropsWithoutRef[SelectProps[OptionsType, ValueType]]) with RefAttributes[RefSelectProps]
  ] = js.native
}

