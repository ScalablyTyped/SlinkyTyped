package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.PartialConfigProviderProp
import typingsSlinky.antd.anon.WeakValidationMapConfigPr
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.configProviderMod.ConfigProviderProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<antd.antd/lib/config-provider.ConfigProviderProps> & {  ConfigContext :react.react.Context<antd.antd/lib/config-provider/context.ConfigConsumerProps>} */
object ConfigProvider {
  
  @JSImport("antd", "ConfigProvider")
  @js.native
  def apply(props: PropsWithChildren[ConfigProviderProps]): ReactElement | Null = js.native
  @JSImport("antd", "ConfigProvider")
  @js.native
  def apply(props: PropsWithChildren[ConfigProviderProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("antd", "ConfigProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "ConfigProvider.ConfigContext")
  @js.native
  def ConfigContext: Context[ConfigConsumerProps] = js.native
  @scala.inline
  def ConfigContext_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigContext")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "ConfigProvider.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "ConfigProvider.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialConfigProviderProp] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialConfigProviderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "ConfigProvider.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "ConfigProvider.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapConfigPr] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapConfigPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
