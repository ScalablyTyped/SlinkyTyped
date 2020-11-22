package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.PartialConfigProviderProp
import typingsSlinky.antd.anon.WeakValidationMapConfigPr
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.configProviderMod.ConfigProviderProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "ConfigProvider")
@js.native
object ConfigProvider extends js.Object {
  
  def apply(props: PropsWithChildren[ConfigProviderProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ConfigProviderProps], context: js.Any): ReactElement | Null = js.native
  
  var ConfigContext: Context[ConfigConsumerProps] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialConfigProviderProp] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapConfigPr] = js.native
}
