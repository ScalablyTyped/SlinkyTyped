package typingsSlinky.antd.configProviderMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProvider
  extends Component[ConfigProviderProps, js.Object, js.Any] {
  def getPrefixClsWrapper(context: ConfigConsumerProps): js.Function2[/* suffixCls */ String, /* customizePrefixCls */ js.UndefOr[String], String] = js.native
  def renderProvider(context: ConfigConsumerProps, legacyLocale: Locale): ReactElement = js.native
}

