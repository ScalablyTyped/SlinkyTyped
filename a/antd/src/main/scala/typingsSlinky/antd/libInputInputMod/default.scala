package typingsSlinky.antd.libInputInputMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.Anon_AddonAfter
import typingsSlinky.antd.Anon_Type
import typingsSlinky.antd.Anon_ValueArray
import typingsSlinky.antd.TypeofClassPassword
import typingsSlinky.antd.TypeofClassSearch
import typingsSlinky.antd.TypeofClassTextArea
import typingsSlinky.antd.libInputGroupMod.GroupProps
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
  var Password: TypeofClassPassword = js.native
  var Search: TypeofClassSearch = js.native
  var TextArea: TypeofClassTextArea = js.native
  var defaultProps: Anon_Type = js.native
  var propTypes: Anon_AddonAfter = js.native
  def getDerivedStateFromProps(nextProps: InputProps): Anon_ValueArray | Null = js.native
}

