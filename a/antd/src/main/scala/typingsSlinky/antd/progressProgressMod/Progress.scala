package typingsSlinky.antd.progressProgressMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.active
import typingsSlinky.antd.antdStrings.exception
import typingsSlinky.antd.antdStrings.normal
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress
  extends Component[ProgressProps, js.Object, js.Any] {
  
  def getPercentNumber(): Double = js.native
  
  def getProgressStatus(): success | normal | active | exception = js.native
  
  @JSName("renderProcessInfo")
  def renderProcessInfo_active(prefixCls: String, progressStatus: active): ReactElement | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_exception(prefixCls: String, progressStatus: exception): ReactElement | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_normal(prefixCls: String, progressStatus: normal): ReactElement | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_success(prefixCls: String, progressStatus: success): ReactElement | Null = js.native
  
  def renderProgress(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
}
