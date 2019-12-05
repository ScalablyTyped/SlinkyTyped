package typingsSlinky.protractor

import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/direct", JSImport.Namespace)
@js.native
object builtDriverProvidersDirectMod extends js.Object {
  @js.native
  class Direct protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

