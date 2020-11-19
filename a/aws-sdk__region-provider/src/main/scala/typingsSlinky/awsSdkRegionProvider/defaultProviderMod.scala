package typingsSlinky.awsSdkRegionProvider

import typingsSlinky.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typingsSlinky.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/region-provider/build/defaultProvider", JSImport.Namespace)
@js.native
object defaultProviderMod extends js.Object {
  
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  
  type RegionProviderConfiguration = EnvConfiguration with SharedConfigInit
}
