package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.antd.esInputGroupMod.GroupProps
import typingsSlinky.antd.esInputInputMod.InputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/input", JSImport.Namespace)
@js.native
object esInputMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.antd.esInputInputMod.default {
    def this(props: InputProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: ReactComponentClass[GroupProps] = js.native
    var Password: TypeofClassPassword = js.native
    var Search: TypeofClassSearch = js.native
    var TextArea: Instantiable0[typingsSlinky.antd.esInputTextAreaMod.default] = js.native
    var defaultProps: Anon_Type = js.native
    var propTypes: Anon_AddonAfter = js.native
    def getDerivedStateFromProps(nextProps: InputProps): Anon_ValueArray | Null = js.native
  }
  
}

