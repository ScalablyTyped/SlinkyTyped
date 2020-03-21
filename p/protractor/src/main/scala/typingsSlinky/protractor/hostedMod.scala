package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/hosted", JSImport.Namespace)
@js.native
object hostedMod extends js.Object {
  @js.native
  class Hosted protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

