package typingsSlinky.antd.inputInputMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.PartialInputState
import typingsSlinky.antd.anon.Type
import typingsSlinky.antd.anon.TypeofTextArea
import typingsSlinky.antd.inputGroupMod.GroupProps
import typingsSlinky.antd.passwordMod.PasswordProps
import typingsSlinky.antd.searchMod.SearchProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input/Input", JSImport.Default)
@js.native
class default protected () extends Input {
  def this(props: InputProps) = this()
}

/* static members */
@JSImport("antd/lib/input/Input", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: ReactComponentClass[GroupProps] = js.native
  var Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = js.native
  var Search: ForwardRefExoticComponent[SearchProps with RefAttributes[default]] = js.native
  var TextArea: TypeofTextArea = js.native
  var defaultProps: Type = js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}

