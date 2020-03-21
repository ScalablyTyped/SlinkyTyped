package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/testObject", JSImport.Namespace)
@js.native
object testObjectMod extends js.Object {
  @js.native
  class TestObject protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

