package typingsSlinky.antd.checkboxGroupMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxGroup
  extends Component[CheckboxGroupProps, CheckboxGroupState, js.Any] {
  
  def cancelValue(value: String): Unit = js.native
  
  def getOptions(): js.Array[CheckboxOptionType] = js.native
  
  def registerValue(value: String): Unit = js.native
  
  def renderGroup(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  
  def toggleOption(option: CheckboxOptionType): Unit = js.native
}
