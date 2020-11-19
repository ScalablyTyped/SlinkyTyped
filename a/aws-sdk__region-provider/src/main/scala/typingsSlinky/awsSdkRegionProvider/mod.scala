package typingsSlinky.awsSdkRegionProvider

import typingsSlinky.awsSdkRegionProvider.defaultProviderMod.RegionProviderConfiguration
import typingsSlinky.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typingsSlinky.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/region-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  val ENV_REGION: /* "AWS_REGION" */ String = js.native
  
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  
  def fromEnv(): Provider[String] = js.native
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = js.native
  
  def fromSharedConfigFiles(): Provider[String] = js.native
  def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = js.native
}
