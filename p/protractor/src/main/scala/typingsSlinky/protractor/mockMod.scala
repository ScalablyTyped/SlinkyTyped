package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import typingsSlinky.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockMod {
  
  @JSImport("protractor/built/driverProviders/mock", "Mock")
  @js.native
  class Mock () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * An execute function that returns a promise with a test value.
      */
    def execute(): Promise[_] = js.native
  }
  
  @JSImport("protractor/built/driverProviders/mock", "MockExecutor")
  @js.native
  class MockExecutor () extends StObject {
    
    def execute(command: js.Any): js.Any = js.native
  }
}
