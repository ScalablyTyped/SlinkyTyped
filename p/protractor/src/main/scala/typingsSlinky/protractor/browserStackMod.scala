package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserStackMod {
  
  @JSImport("protractor/built/driverProviders/browserStack", "BrowserStack")
  @js.native
  class BrowserStack protected () extends DriverProvider {
    def this(config: Config) = this()
    
    var browserstackClient: js.Any = js.native
  }
}
