package typingsSlinky.awsSdkNodeConfigProvider

import typingsSlinky.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typingsSlinky.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-config-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T]): Provider[T] = js.native
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = js.native
}
