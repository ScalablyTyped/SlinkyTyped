package typingsSlinky.protractor

import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/kobiton", JSImport.Namespace)
@js.native
object builtDriverProvidersKobitonMod extends js.Object {
  @js.native
  class Kobiton protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

