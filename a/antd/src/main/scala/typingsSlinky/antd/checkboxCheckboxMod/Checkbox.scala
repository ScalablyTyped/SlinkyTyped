package typingsSlinky.antd.checkboxCheckboxMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkbox
  extends Component[CheckboxProps, js.Object, js.Any] {
  
  def blur(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MCheckbox(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCheckbox(hasValue: CheckboxProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCheckbox(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var rcCheckbox: js.Any = js.native
  
  def renderCheckbox(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  
  def saveCheckbox(node: js.Any): Unit = js.native
}
