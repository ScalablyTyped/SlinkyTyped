package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useExistingWebDriverMod {
  
  @JSImport("protractor/built/driverProviders/useExistingWebDriver", "UseExistingWebDriver")
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
