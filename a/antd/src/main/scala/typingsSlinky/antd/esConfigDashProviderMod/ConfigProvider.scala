package typingsSlinky.antd.esConfigDashProviderMod

import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.esLocaleDashProviderMod.Locale
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProvider
  extends Component[ConfigProviderProps, js.Object, js.Any] {
  def getPrefixCls(suffixCls: String): String = js.native
  def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
  def renderProvider(context: ConfigConsumerProps, legacyLocale: Locale): Element = js.native
}

