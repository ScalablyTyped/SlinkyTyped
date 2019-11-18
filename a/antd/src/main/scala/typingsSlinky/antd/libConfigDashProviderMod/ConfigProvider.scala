package typingsSlinky.antd.libConfigDashProviderMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libLocaleDashProviderMod.Locale
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProvider
  extends Component[ConfigProviderProps, js.Object, js.Any] {
  def getPrefixCls(suffixCls: String): String = js.native
  def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
  def renderProvider(context: ConfigConsumerProps, legacyLocale: Locale): ReactElement = js.native
}

