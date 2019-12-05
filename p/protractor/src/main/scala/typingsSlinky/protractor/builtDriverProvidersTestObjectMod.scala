package typingsSlinky.protractor

import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/testObject", JSImport.Namespace)
@js.native
object builtDriverProvidersTestObjectMod extends js.Object {
  @js.native
  class TestObject protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

