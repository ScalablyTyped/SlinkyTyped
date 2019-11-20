package typingsSlinky.antd.esProgressProgressMod

import typingsSlinky.antd.antdStrings.active
import typingsSlinky.antd.antdStrings.exception
import typingsSlinky.antd.antdStrings.normal
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends Component[ProgressProps, js.Object, js.Any] {
  def getPercentNumber(): Double = js.native
  def getProgressStatus(): normal | active | success | exception = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_active(prefixCls: String, progressStatus: active): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_exception(prefixCls: String, progressStatus: exception): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_normal(prefixCls: String, progressStatus: normal): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_success(prefixCls: String, progressStatus: success): Element | Null = js.native
  def renderProgress(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

