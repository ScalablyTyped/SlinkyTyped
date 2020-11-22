package typingsSlinky.awsSdkNodeConfigProvider

import typingsSlinky.awsSdkNodeConfigProvider.fromEnvMod.GetterFromEnv
import typingsSlinky.awsSdkNodeConfigProvider.fromSharedConfigFilesMod.GetterFromConfig
import typingsSlinky.awsSdkNodeConfigProvider.fromSharedConfigFilesMod.SharedConfigInit
import typingsSlinky.awsSdkNodeConfigProvider.fromStaticMod.FromStaticConfig
import typingsSlinky.awsSdkSharedIniFileLoader.mod.Profile
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-config-provider/dist/cjs/configLoader", JSImport.Namespace)
@js.native
object configLoaderMod extends js.Object {
  
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T]): Provider[T] = js.native
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = js.native
  
  @js.native
  trait LoadedConfigSelectors[T] extends js.Object {
    
    /**
      * A getter function getting config values associated with the inferred
      * profile from shared INI files
      */
    def configFileSelector(profile: Profile): js.UndefOr[T] = js.native
    /**
      * A getter function getting config values associated with the inferred
      * profile from shared INI files
      */
    @JSName("configFileSelector")
    var configFileSelector_Original: GetterFromConfig[T] = js.native
    
    /**
      * Default value or getter
      */
    var default: FromStaticConfig[T] = js.native
    
    /**
      * A getter function getting the config values from all the environment
      * variables.
      */
    def environmentVariableSelector(env: ProcessEnv): js.UndefOr[T] = js.native
    /**
      * A getter function getting the config values from all the environment
      * variables.
      */
    @JSName("environmentVariableSelector")
    var environmentVariableSelector_Original: GetterFromEnv[T] = js.native
  }
  
  type LocalConfigOptions = SharedConfigInit
}
