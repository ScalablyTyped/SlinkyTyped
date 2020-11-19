package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/useExistingWebDriver", JSImport.Namespace)
@js.native
object useExistingWebDriverMod extends js.Object {
  
  @js.native
  class UseExistingWebDriver protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Maintains the existing session and does not quit the driver.
      *
      * @public
      */
    def quitDriver(): js.Promise[Unit] = js.native
  }
}
