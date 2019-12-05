package typingsSlinky.atAwsDashSdkRegionDashProvider

import typingsSlinky.atAwsDashSdkRegionDashProvider.buildDefaultProviderMod.RegionProviderConfiguration
import typingsSlinky.atAwsDashSdkRegionDashProvider.buildFromEnvMod.EnvConfiguration
import typingsSlinky.atAwsDashSdkRegionDashProvider.buildFromSharedConfigFilesMod.SharedConfigInit
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider/build/defaultProvider", JSImport.Namespace)
@js.native
object buildDefaultProviderMod extends js.Object {
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  type RegionProviderConfiguration = EnvConfiguration with SharedConfigInit
}

