package typingsSlinky.atAwsDashSdkRegionDashProvider

import typingsSlinky.atAwsDashSdkRegionDashProvider.atAwsDashSdkRegionDashProviderStrings.AWS_PROFILE
import typingsSlinky.atAwsDashSdkRegionDashProvider.atAwsDashSdkRegionDashProviderStrings.AWS_REGION
import typingsSlinky.atAwsDashSdkRegionDashProvider.buildDefaultProviderMod.RegionProviderConfiguration
import typingsSlinky.atAwsDashSdkRegionDashProvider.buildFromEnvMod.EnvConfiguration
import typingsSlinky.atAwsDashSdkRegionDashProvider.buildFromSharedConfigFilesMod.SharedConfigInit
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider", JSImport.Namespace)
@js.native
object atAwsDashSdkRegionDashProviderMod extends js.Object {
  val ENV_PROFILE: AWS_PROFILE = js.native
  val ENV_REGION: AWS_REGION = js.native
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  def fromEnv(): Provider[String] = js.native
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = js.native
  def fromSharedConfigFiles(): Provider[String] = js.native
  def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = js.native
}

