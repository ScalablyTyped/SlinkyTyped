package typingsSlinky.antd.inputInputMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.AnonType
import typingsSlinky.antd.PartialInputState
import typingsSlinky.antd.TypeofPassword
import typingsSlinky.antd.TypeofSearch
import typingsSlinky.antd.TypeofTextArea
import typingsSlinky.antd.inputGroupMod.GroupProps
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
  var Password: TypeofPassword = js.native
  var Search: TypeofSearch = js.native
  var TextArea: TypeofTextArea = js.native
  var defaultProps: AnonType = js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}

