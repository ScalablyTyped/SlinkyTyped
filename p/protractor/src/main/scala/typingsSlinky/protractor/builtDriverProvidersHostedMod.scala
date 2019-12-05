package typingsSlinky.protractor

import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/hosted", JSImport.Namespace)
@js.native
object builtDriverProvidersHostedMod extends js.Object {
  @js.native
  class Hosted protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

