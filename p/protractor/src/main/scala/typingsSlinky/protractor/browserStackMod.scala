package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/browserStack", JSImport.Namespace)
@js.native
object browserStackMod extends js.Object {
  
  @js.native
  class BrowserStack protected () extends DriverProvider {
    def this(config: Config) = this()
    
    var browserstackClient: js.Any = js.native
  }
}
