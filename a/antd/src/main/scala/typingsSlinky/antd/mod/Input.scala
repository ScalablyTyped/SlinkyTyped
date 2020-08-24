package typingsSlinky.antd.mod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.PartialInputState
import typingsSlinky.antd.anon.Type
import typingsSlinky.antd.anon.TypeofTextArea
import typingsSlinky.antd.inputGroupMod.GroupProps
import typingsSlinky.antd.inputInputMod.InputProps
import typingsSlinky.antd.inputInputMod.InputState
import typingsSlinky.antd.inputMod.default
import typingsSlinky.antd.passwordMod.PasswordProps
import typingsSlinky.antd.searchMod.SearchProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Input")
@js.native
class Input protected () extends default {
  def this(props: InputProps) = this()
}

/* static members */
@JSImport("antd", "Input")
@js.native
object Input extends js.Object {
  var Group: ReactComponentClass[GroupProps] = js.native
  var Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = js.native
  var Search: ForwardRefExoticComponent[SearchProps with RefAttributes[typingsSlinky.antd.inputInputMod.default]] = js.native
  var TextArea: TypeofTextArea = js.native
  var defaultProps: Type = js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}

