package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/direct", JSImport.Namespace)
@js.native
object directMod extends js.Object {
  @js.native
  class Direct protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

