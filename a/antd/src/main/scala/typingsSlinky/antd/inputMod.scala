package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.PartialInputState
import typingsSlinky.antd.anon.Type
import typingsSlinky.antd.anon.TypeofPassword
import typingsSlinky.antd.anon.TypeofSearch
import typingsSlinky.antd.anon.TypeofTextArea
import typingsSlinky.antd.inputGroupMod.GroupProps
import typingsSlinky.antd.inputInputMod.InputProps
import typingsSlinky.antd.inputInputMod.InputState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input", JSImport.Namespace)
@js.native
object inputMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.antd.inputInputMod.default {
    def this(props: InputProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: ReactComponentClass[GroupProps] = js.native
    var Password: TypeofPassword = js.native
    var Search: TypeofSearch = js.native
    var TextArea: TypeofTextArea = js.native
    var defaultProps: Type = js.native
    def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
  }
  
}

