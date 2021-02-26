package typingsSlinky.awsSdkNodeConfigProvider

import typingsSlinky.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typingsSlinky.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import typingsSlinky.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/node-config-provider", "loadConfig")
  @js.native
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T]): Provider[T] = js.native
  @JSImport("@aws-sdk/node-config-provider", "loadConfig")
  @js.native
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = js.native
}
